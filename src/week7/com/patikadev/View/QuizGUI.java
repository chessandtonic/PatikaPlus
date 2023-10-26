package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Content;
import Week7.com.PatikaDev.Model.Quiz;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
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
    private JButton newQuizButton;
    private JTable tbl_quizList;
    private JTextField fld_hiddenId;
    private static Content content;
    private DefaultTableModel mdl_myQuizList;
    private Object[] row_myQuizList;


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

        txt_questions.setSize(25, 25);
        txt_questions.setLineWrap(true);

        mdl_myQuizList=new DefaultTableModel();

        Object[] col_myQuizList ={"Id","Quiz Name"};
        mdl_myQuizList.setColumnIdentifiers(col_myQuizList);
        row_myQuizList = new Object[col_myQuizList.length];
        //loadContentModel(course.getId());
        tbl_quizList.setModel(mdl_myQuizList);
        tbl_quizList.getTableHeader().setReorderingAllowed(false);
        tbl_quizList.getColumnModel().getColumn(0).setMaxWidth(30);
        loadQuizModel();

        tbl_quizList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try{
                    String select_quizId=tbl_quizList.getValueAt(tbl_quizList.getSelectedRow(),0).toString();
                    fld_hiddenId.setText(select_quizId);
                }catch (Exception exception){

                }
            }
        });
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
                        loadQuizModel();

                        fld_quiz_name.setText(null);
                        txt_questions.setText(null);
                    }
                }
            }
        });
        btn_quiz_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fld_hiddenId)) {
                    Helper.showMassage("Pick a quiz to delete");
                } else {
                    if(Helper.confirm("sure")){
                        int quizId = Integer.parseInt(fld_hiddenId.getText());
                        if (Quiz.delete(quizId)) {
                            Helper.showMassage("done");
                            loadQuizModel();
                            fld_hiddenId.setText(null);
                        } else {
                            Helper.showMassage("error");
                        }
                    }
                }
            }
        });
    }
    private void loadQuizModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_quizList.getModel();
        clearModel.setRowCount(0);
        int i = 0;
        for(Quiz obj : Quiz.getListByContent(content.getId())){
            i=0;
            row_myQuizList[i++] = obj.getId();
            row_myQuizList[i++] = obj.getQuiz_name();

            mdl_myQuizList.addRow(row_myQuizList);
        }
    }
}
