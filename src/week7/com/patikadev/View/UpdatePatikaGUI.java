package week7.com.patikadev.View;

import week7.com.patikadev.Helper.Config;
import week7.com.patikadev.Helper.Helper;
import week7.com.patikadev.Model.Patika;

import javax.swing.*;

public class UpdatePatikaGUI extends JFrame{
    private JPanel wrapper;
    private JTextField field_pathName;
    private JButton update_Button;
    private Patika patika;
    public UpdatePatikaGUI(Patika patika){
        this.patika = patika;
        add(wrapper);
        setSize(300,150);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        field_pathName.setText(patika.getName());
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Patika p = new Patika(1, "Frontend");
        UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(p);
    }
}
