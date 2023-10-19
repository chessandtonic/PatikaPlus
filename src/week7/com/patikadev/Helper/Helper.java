package week7.com.patikadev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static int screenCenterPoint(String axis, Dimension size) {
        int point = 0;
        switch (axis) {
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    public static boolean isFieldEmpty(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    public static void showMsg(String str) {
        optionPaneTR();
        String msg;
        String title;

        switch (str) {
            case "fill":
                msg = "Please fill in all the fields!";
                title = "Warning!";
                break;
            case "done":
                msg = "Process completed successfully!";
                title = "Success!";
                break;
            case "error":
                msg = "An error occurred during the operation!";
                title = "Error!";
            default:
                msg = str;
                title = "Message";
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str) {
        String msg;
        switch (str) {
            case "sure":
                msg = "Are you sure?";
                break;
            default:
                msg = str;
        }
        return JOptionPane.showConfirmDialog(null, msg, "Last chance!", JOptionPane.YES_NO_OPTION) == 0;
    }
    ;

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "OK");
        UIManager.put("OptionPane.yesButtonText", "Yes");
        UIManager.put("OptionPane.noButtonText", "No");
    }
}
