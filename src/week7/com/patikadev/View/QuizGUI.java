package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Content;

import javax.swing.*;

public class QuizGUI extends JFrame {

    private JPanel wrapper;
    private JLabel lbl_content_name;
    private JButton btn_select;
    private JComboBox cmb_quiz_list;
    private JTextField fld_quiz_name;
    private JTextArea txt_questions;
    private JButton btn_quiz_add;
    private JButton btn_quiz_delete;
    private JButton btn_quiz_update;
    private static Content content;

    public QuizGUI(Content content) {
        this.content = content;
        add(wrapper);
        setSize(700, 700);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        txt_questions.setSize(50, 50);
        txt_questions.setLineWrap(true);
        lbl_content_name.setText(content.getName());
    }
}
