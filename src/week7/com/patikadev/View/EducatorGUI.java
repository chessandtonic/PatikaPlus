package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;

    public EducatorGUI(){
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterLocation("x", getSize());
        int y = Helper.screenCenterLocation("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI login = new LoginGUI();
    }
}
