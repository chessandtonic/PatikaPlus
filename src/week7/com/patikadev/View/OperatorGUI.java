package week7.com.patikadev.View;

import week7.com.patikadev.Helper.Config;
import week7.com.patikadev.Helper.Helper;
import week7.com.patikadev.Model.Operator;
import week7.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel label_welcome;
    private JPanel panel_top;
    private JButton exitButton;
    private JPanel panel_userList;
    private JScrollPane scroll_userList;
    private JTable table_userList;
    private DefaultTableModel model_userList;
    private Object[] row_userList;
    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
       // Helper.setLayout();
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_welcome.setText("Welcome, " + operator.getName() + "!");

        // ModelUserList

        model_userList = new DefaultTableModel();
        Object[] col_userList = {"ID", "Name", "Username", "Password", "Type"};
        model_userList.setColumnIdentifiers(col_userList);

        //Object[] firstRow = {operator.getId(), operator.getName(), operator.getUname(), operator.getPass(), operator.getType()};
        //model_userList.addRow(firstRow);

        for (User obj : User.getList()) {
            Object[] row = new Object[col_userList.length];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getUname();
            row[3] = obj.getPass();
            row[4] = obj.getType();
            model_userList.addRow(row);
        };
        table_userList.setModel(model_userList);
        table_userList.getTableHeader().setReorderingAllowed(false);
    }

    public static void main(String[] args) {
        Operator op = new Operator(1, "Can Iscan", "caniscan", "1234", "operator");
        OperatorGUI operatorGUI = new OperatorGUI(op);
    }
}