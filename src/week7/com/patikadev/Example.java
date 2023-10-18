package week7.com.patikadev;

import javax.swing.*;

public class Example  extends JFrame {
    private JPanel wrapper;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setContentPane(new Example().wrapper);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

