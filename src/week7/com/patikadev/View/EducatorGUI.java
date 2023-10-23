package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.DBConnector;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Course;
import Week7.com.PatikaDev.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Week7.com.PatikaDev.Model.Course.getList;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;
    private JLabel lbl_educatorWelcome;
    private JTabbedPane tab_educator;
    private JTable tbl_myCourses;
    private JScrollPane scrl_myCourses;
    private JButton selectButton;
    private JTextField fld_courseName;
    private Object[] row_myCourseList;
    private DefaultTableModel mdl_myCourseList;
    private final User user;


    public EducatorGUI(User user) {
        this.user = user;
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterLocation("x", getSize());
        int y = Helper.screenCenterLocation("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        lbl_educatorWelcome.setText("Welcome "+ user.getName());

        mdl_myCourseList = new DefaultTableModel();
        Object[] col_myCourseList ={"Course Name"};
        mdl_myCourseList.setColumnIdentifiers(col_myCourseList);
        row_myCourseList = new Object[col_myCourseList.length];
        loadCourseModel();
        tbl_myCourses.setModel(mdl_myCourseList);
        tbl_myCourses.getTableHeader().setReorderingAllowed(false);
    }

    public static ArrayList<Course> getListByUser(int user_id) {
        ArrayList<Course> courseList = new ArrayList<>();

        Course obj;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course WHERE user_id = " + user_id);
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
        DefaultTableModel clearModel = (DefaultTableModel) tbl_myCourses.getModel();
        clearModel.setRowCount(0);

        for (Course obj : getListByUser(user.getId())) {
            row_myCourseList[0] = obj.getName();
            mdl_myCourseList.addRow(row_myCourseList);
        }
    }
}
