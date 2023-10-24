package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Course;

import javax.swing.*;

public class ContentGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_content_name;
    private JButton btn_content_add;
    private JButton btn_content_delete;
    private JButton btn_content_select;
    private JComboBox cmb_content_header;
    private Course course;
    private JLabel lbl_course_name;



    public ContentGUI(Course course){
        this.course=course;
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterLocation("x", getSize());
        int y = Helper.screenCenterLocation("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        lbl_course_name.setText("Course Name: " + course.getName());
    }
}
