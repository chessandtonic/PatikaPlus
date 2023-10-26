package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.DBConnector;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Course;
import Week7.com.PatikaDev.Model.User;
import Week7.com.PatikaDev.Model.Path;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentGUI extends JFrame {
    private JPanel wrapper;
    private JLabel lbl_studentWelcome;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField fld_hiddenCourseId;
    private JTextField fld_hiddenPathId;
    private JButton selectButtonPath;
    private JButton enrollButtonCourse;
    private JTable tbl_pathList;
    private JTable tbl_courseList;
    private JPanel pnl_pathList;
    private JScrollPane pnl_courseList;
    private JTabbedPane tabbedPane2;
    private JButton selectButtonCourse;
    private JTable tbl_myCourseList;
    private User user;
    private Object[] row_pathList;
    private DefaultTableModel mdl_pathList;
    private Object[] row_courseList;
    private DefaultTableModel mdl_courseList;
    private Object[] row_myCourseList;
    private DefaultTableModel mdl_myCourseList;

    public StudentGUI(User user) {
        this.user = user;
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterLocation("x", getSize());
        int y = Helper.screenCenterLocation("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        lbl_studentWelcome.setText("Welcome " + user.getName());
        mdl_pathList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_pathList = {"ID", "Path Name"};
        mdl_pathList.setColumnIdentifiers(col_pathList);
        row_pathList = new Object[col_pathList.length];

        loadPathModel();

        tbl_pathList.setModel(mdl_pathList);
        tbl_pathList.getTableHeader().setReorderingAllowed(false);
        tbl_pathList.getColumnModel().getColumn(0).setMaxWidth(30);

        tbl_pathList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    String select_course_id = tbl_pathList.getValueAt(tbl_pathList.getSelectedRow(), 0).toString();
                    fld_hiddenPathId.setText(select_course_id);
                } catch (Exception exception) {

                }
            }
        });
        tbl_courseList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {

                    String select_courseId = tbl_courseList.getValueAt(tbl_courseList.getSelectedRow(), 0).toString();
                    fld_hiddenCourseId.setText(select_courseId);
                } catch (Exception exception) {

                }
            }
        });

        mdl_courseList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_courseList = {"ID", "Course Name", "Course Language"};
        mdl_courseList.setColumnIdentifiers(col_courseList);
        row_courseList = new Object[col_courseList.length];
        tbl_courseList.setModel(mdl_courseList);
        tbl_courseList.getTableHeader().setReorderingAllowed(false);
        tbl_courseList.getColumnModel().getColumn(0).setMaxWidth(30);

        mdl_myCourseList = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==0||column==1){
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_myCourseList={"Id","Course Name","Course Language","Course Path"};
        mdl_myCourseList.setColumnIdentifiers(col_myCourseList);
        row_myCourseList=new Object[col_myCourseList.length];

        tbl_myCourseList.setModel(mdl_myCourseList);
        tbl_myCourseList.getTableHeader().setReorderingAllowed(false);
        tbl_myCourseList.getColumnModel().getColumn(0).setMaxWidth(30);

        selectButtonPath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadCourseModel();
            }
        });
        enrollButtonCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fld_hiddenCourseId.getText().isEmpty()){
                    Helper.showMassage("error");
                } else {
                    Helper.showMassage("done");
                    loadMyCourseModel();
                }
            }
        });
    }

    public static ArrayList<Path> getPaths() {
        ArrayList<Path> pathList = new ArrayList<>();

        Path obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM path");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                obj = new Path(id, name);
                pathList.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pathList;
    }

    private void loadPathModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_pathList.getModel();
        clearModel.setRowCount(0);

        for (Path obj : getPaths()) {
            row_pathList[0] = obj.getId();
            row_pathList[1] = obj.getName();
            mdl_pathList.addRow(row_pathList);
        }
    }

    public static ArrayList<Course> getCourseByPath(int path_id) {
        ArrayList<Course> courseList = new ArrayList<>();

        Course obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course WHERE path_id = " + path_id);
            while (rs.next()) {
                int id = rs.getInt("id");
                int userId = rs.getInt("user_id");
                int pathId = rs.getInt("path_id");
                String name = rs.getString("name");
                String lang = rs.getString("lang");
                obj = new Course(id, userId, pathId, name, lang);
                courseList.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_courseList.getModel();
        clearModel.setRowCount(0);
        int pathId = Integer.parseInt(fld_hiddenPathId.getText());
        for (Course obj : getCourseByPath(pathId)) {
            row_courseList[0] = obj.getId();
            row_courseList[1] = obj.getName();
            row_courseList[2] = obj.getLang();
            mdl_courseList.addRow(row_courseList);
        }
    }
    public static ArrayList<Course> getCourseById(int courseId) {
        ArrayList<Course> courseList = new ArrayList<>();

        Course obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course WHERE id = " + courseId);
            while (rs.next()) {
                int id = rs.getInt("id");
                int userId = rs.getInt("user_id");
                int pathId = rs.getInt("path_id");
                String name = rs.getString("name");
                String lang = rs.getString("lang");
                obj = new Course(id, userId, pathId, name, lang);
                courseList.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseList;
    }

    private void loadMyCourseModel() {
        //DefaultTableModel clearModel = (DefaultTableModel) tbl_courseList.getModel();
        //clearModel.setRowCount(0);

        int courseId = Integer.parseInt(fld_hiddenCourseId.getText());
        for (Course obj : getCourseById(courseId)) {
            row_myCourseList[0] = obj.getId();
            row_myCourseList[1] = obj.getName();
            row_myCourseList[2] = obj.getLang();
            row_myCourseList[3] = obj.getPath_id();
            mdl_myCourseList.addRow(row_myCourseList);
        }
    }
}
