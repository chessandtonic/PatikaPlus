package f.Week7.com.PatikaDev.View;

import f.Week7.com.PatikaDev.Helper.Config;
import f.Week7.com.PatikaDev.Helper.Helper;
import f.Week7.com.PatikaDev.Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField field_SignUpName;
    private JTextField field_SignUpUsername;
    private JTextField field_SignUpPass;
    private JButton signUpButton;

    public SignUpGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(field_SignUpName) || Helper.isFieldEmpty(field_SignUpUsername) || Helper.isFieldEmpty(field_SignUpPass)) {
                    Helper.showMessage("fill");
                } else {
                    if (User.add(field_SignUpName.getText(), field_SignUpUsername.getText(), field_SignUpPass.getText(), "student")) {
                        Helper.showMessage("done");
                        dispose();
                    }
                }
            }
        });
    }
}