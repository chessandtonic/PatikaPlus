package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Helper.Item;
import Week7.com.PatikaDev.Model.Content;
import Week7.com.PatikaDev.Model.Quiz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        loadQuizCombo();


        txt_questions.setSize(25,25);
        txt_questions.setLineWrap(true);

        btn_quiz_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_quiz_name) || Helper.isFieldEmpty(txt_questions)) {
                    Helper.showMassage("fill");
                } else {
                    String quizName = fld_quiz_name.getText();
                    String quizText = txt_questions.getText();

                    if (Quiz.add(quizName, quizText, content.getId())) {
                        Helper.showMassage("done");
                        loadQuizCombo();
                        fld_quiz_name.setText(null);
                        txt_questions.setText(null);
                    }
                }
            }
        });
    }
    public void loadQuizCombo() {
        cmb_quiz_list.removeAllItems();
        cmb_quiz_list.addItem(new Item(0,"New Quiz"));
        for (Quiz obj : Quiz.getList()) {
            cmb_quiz_list.addItem(new Item(obj.getId(), obj.getQuiz_name()));
        }
    }
}
