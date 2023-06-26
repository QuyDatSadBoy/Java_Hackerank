package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Table extends JFrame implements ActionListener {
    JFrame frame;
    JLabel lblUsername;
    JLabel lblPassword;
    JTextField jtfUsername, jtfPassword;
    JTable table;
    JButton add;
    Table() {
        frame = new JFrame("GUI example");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        ToolTipManager.sharedInstance().setInitialDelay(0);

        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        jtfUsername = new JTextField();
        jtfPassword = new JTextField();
        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);

        Object[] colum = {"Name", "Class", "GPA", "Type"};
        Object[][] data = {
                {"Tran Quy Dat", "CN06", "3.6", "Gioi"},
                {"Nguyen Ha An", "CN08", "2.5", "Kha"},
                {"Nguyen Viet Khanh", "CN07", "3.9", "Gioi"},
                {"Tran Quy Dat", "CN06", "3.6", "Gioi"},
                {"Nguyen Ha An", "CN08", "2.5", "Kha"},
                {"Nguyen Viet Khanh", "CN07", "3.9", "Gioi"},
                {"Tran Quy Dat", "CN06", "3.6", "Gioi"},
                {"Nguyen Ha An", "CN08", "2.5", "Kha"},
                {"Nguyen Viet Khanh", "CN07", "3.9", "Gioi"}
        };
        DefaultTableModel model1 = new DefaultTableModel(data, colum);
        table = new JTable(model1);
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(100, 150, 400, 200);
        scroll1.setToolTipText("Day la danh sach Sinh Vien");

        add = new JButton("ADD");
        add.setBounds(250,400,100,50);

        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        frame.add(scroll1);
        frame.setVisible(true);
        frame.add(add);
    }

    public static void main(String[] args) {
        new Table();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public
}
