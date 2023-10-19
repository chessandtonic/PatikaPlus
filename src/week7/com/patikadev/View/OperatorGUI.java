package week7.com.patikadev.View;

import week7.com.patikadev.Helper.Config;
import week7.com.patikadev.Helper.DBConnector;
import week7.com.patikadev.Helper.Helper;
import week7.com.patikadev.Model.Operator;
import week7.com.patikadev.Model.Patika;
import week7.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel label_welcome;
    private JPanel panel_top;
    private JButton exitButton;
    private JPanel panel_userList;
    private JScrollPane scroll_userList;
    private JTable table_userList;
    private JPanel panel_userForm;
    private JTextField field_name;
    private JTextField field_uName;
    private JTextField field_pass;
    private JComboBox combo_userType;
    private JButton button_userAdd;
    private JTextField field_userID;
    private JButton button_userDel;
    private JTextField field_searchName;
    private JTextField field_searchuName;
    private JComboBox combo_searchType;
    private JButton button_searchUser;
    private JPanel panel_patikaList;
    private JScrollPane scroll_patikaList;
    private JTable table_patikaList;
    private DefaultTableModel model_userList;
    private Object[] row_userList;
    private DefaultTableModel model_patikaList;
    private Object[] row_patikaList;

    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        Helper.setLayout();
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        label_welcome.setText("Welcome, " + operator.getName() + "!");

        // ModelUserList
        model_userList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] col_userList = {"ID", "Name", "Username", "Password", "Type"};
        model_userList.setColumnIdentifiers(col_userList);
        row_userList = new Object[col_userList.length];

        loadUserModel();

        table_userList.setModel(model_userList);
        table_userList.getTableHeader().setReorderingAllowed(false);

        table_userList.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selectUserID = table_userList.getValueAt(table_userList.getSelectedRow(), 0).toString();
                field_userID.setText(selectUserID);
            } catch (Exception exception) {

            }
        });

        table_userList.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int user_id = Integer.parseInt(table_userList.getValueAt(table_userList.getSelectedRow(), 0).toString());
                    String user_name = table_userList.getValueAt(table_userList.getSelectedRow(), 1).toString();
                    String user_uname = table_userList.getValueAt(table_userList.getSelectedRow(), 2).toString();
                    String user_pass = table_userList.getValueAt(table_userList.getSelectedRow(), 3).toString();
                    String user_type = table_userList.getValueAt(table_userList.getSelectedRow(), 4).toString();

                    if (User.update(user_id, user_name, user_uname, user_pass, user_type)) {
                        Helper.showMsg("done");
                    } else {
                        Helper.showMsg("error");
                    }
                    loadUserModel();
                }
            }
        });

        model_patikaList = new DefaultTableModel();
        Object[] col_patikaList = {"ID", "Path Name"};
        model_patikaList.setColumnIdentifiers(col_patikaList);
        row_patikaList = new Object[col_patikaList.length];
        loadPatikaModel();

        button_userAdd.addActionListener(e -> {
            if (Helper.isFieldEmpty(field_name) || Helper.isFieldEmpty(field_uName) || Helper.isFieldEmpty(field_pass)) {
                Helper.showMsg("fill");
            } else {
                String name = field_name.getText();
                String uname = field_uName.getText();
                String pass = field_pass.getText();
                String type = combo_userType.getSelectedItem().toString();
                if (User.add(name, uname, pass, type)) {
                    Helper.showMsg("done");
                    loadUserModel();
                    field_name.setText(null);
                    field_uName.setText(null);
                    field_pass.setText(null);
                }
            }
        });
        button_userDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(field_userID)) {
                    Helper.showMsg("fill");
                } else {
                    if (User.delete(Integer.parseInt(field_userID.getText()))) {
                        Helper.showMsg("done");
                        loadUserModel();
                    } else {
                        Helper.showMsg("error");
                    }
                }
            }
        });
        button_searchUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = field_searchName.getText();
                String uname = field_searchuName.getText();
                String type = combo_searchType.getSelectedItem().toString();
                String query = User.searchQuery(name, uname, type);
                ArrayList<User> searchList = User.searchUserList(query);
                loadUserModel(searchList);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_patikaList.getModel();
        clearModel.setRowCount(0);
        int i = 0;
        for (Patika obj : Patika.getList()) {
            row_patikaList[i++] = obj.getId();
            row_patikaList[i++] = obj.getName();
            model_patikaList.addRow(row_patikaList);
        }
    }

    public void loadUserModel() {
        DefaultTableModel clearModel = (DefaultTableModel) table_userList.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : User.getList()) {
            i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getName();
            row_userList[i++] = obj.getuName();
            row_userList[i++] = obj.getPass();
            row_userList[i++] = obj.getType();
            model_userList.addRow(row_userList);
        }
    }

    public void loadUserModel(ArrayList<User> list) {
        DefaultTableModel clearModel = (DefaultTableModel) table_userList.getModel();
        clearModel.setRowCount(0);

        for (User obj : list) {
            int i = 0;
            row_userList[i++] = obj.getId();
            row_userList[i++] = obj.getName();
            row_userList[i++] = obj.getuName();
            row_userList[i++] = obj.getPass();
            row_userList[i++] = obj.getType();
            model_userList.addRow(row_userList);
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator(1, "Can İşcan", "caniscan", "1234", "operator");
        DBConnector.getInstance();
        OperatorGUI operatorGUI = new OperatorGUI(op);
    }
}