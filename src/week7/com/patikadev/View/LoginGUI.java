package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;
import Week7.com.PatikaDev.Model.Operator;
import Week7.com.PatikaDev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField field_user_uname;
    private JPasswordField field_user_pass;
    private JButton button_login;
    private JButton button_signup;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        button_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_user_uname) || Helper.isFieldEmpty(field_user_pass)) {
                Helper.showMassage("fill");
            } else {
                User u = User.getFetch(field_user_uname.getText(), field_user_pass.getText());
                if (u == null) {
                    Helper.showMassage("User not found");
                } else {
                    switch (u.getType()) {
                        case "operator":
                            OperatorGUI opGUI = new OperatorGUI((Operator) u);
                            break;
                        case "educator":
                            EducatorGUI edGUI = new EducatorGUI(u);
                            break;
                        case "student":
                            StudentGUI stGUI = new StudentGUI(u);
                            break;
                    }
                    dispose();
                }
            }
        });
        button_signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpGUI signUpGUI = new SignUpGUI();
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI login = new LoginGUI();
    }
}
