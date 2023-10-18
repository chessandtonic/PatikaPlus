package week7.com.patikadev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wTop;
    private JPanel wMiddle;
    private JPanel wBottom;
    private JTextField input_user;
    private JTextField input_pass;
    private JLabel Password;
    private JButton button_login;


    public Example() {
        /*for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }*/
        setContentPane(wrapper);
        setSize(400, 400);
        setTitle("Application Name");

        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2;
        setLocation(x, y);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = input_user.getText();
                String password = input_pass.getText();
                if (username.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username and password cannot be empty!","Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username cannot be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (username.equals("admin") && password.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Login successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
