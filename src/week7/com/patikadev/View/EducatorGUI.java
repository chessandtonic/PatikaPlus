package Week7.com.PatikaDev.View;

import Week7.com.PatikaDev.Helper.Config;
import Week7.com.PatikaDev.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;

    public EducatorGUI(){
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
