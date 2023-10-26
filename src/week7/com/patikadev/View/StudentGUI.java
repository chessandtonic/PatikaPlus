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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Week7.com.PatikaDev.View.EducatorGUI.getListByUser;

public class StudentGUI extends JFrame {
    private JPanel wrapper;
    private JLabel lbl_studentWelcome;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField fld_hiddenPathId;
    private JButton selectButtonPath;
    private JButton enrollButtonCourse;
    private JTable tbl_pathList;
    private JTable tbl_courseList;
    private JPanel pnl_pathList;
    private JScrollPane pnl_courseList;
    private User user;
    private Object[] row_pathList;
    private DefaultTableModel mdl_pathList;
    private Object[] row_courseList;
    private DefaultTableModel mdl_courseList;

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

        mdl_courseList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_courseList = {"ID", "Course Name"};
        mdl_courseList.setColumnIdentifiers(col_courseList);
        row_courseList = new Object[col_courseList.length];

        //loadCourseModel();
        tbl_courseList.setModel(mdl_courseList);
        tbl_courseList.getTableHeader().setReorderingAllowed(false);
        tbl_courseList.getColumnModel().getColumn(0).setMaxWidth(30);
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
}
