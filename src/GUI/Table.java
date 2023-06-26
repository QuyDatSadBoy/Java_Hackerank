package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Comparator;

public class Table extends JFrame implements ActionListener {
    JFrame frame;
    JLabel lblUsername;
    JLabel lblPassword;
    JTextField jtfUsername, jtfPassword;
    JTable table;
    JButton add, delete, sort;

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
        add.setBounds(50, 400, 100, 50);
        add.addActionListener(this);
        delete = new JButton("DELETE");
        delete.setBounds(200, 400, 100, 50);
        delete.addActionListener(this);
        sort = new JButton("SORT GPA");
        sort.setBounds(350, 400, 100, 50);
        sort.addActionListener(this);

        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        frame.add(scroll1);
        frame.setVisible(true);
        frame.add(add);
        frame.add(delete);
        frame.add(sort);
    }

    public static void main(String[] args) {
        new Table();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object modul = e.getSource();
        if (modul == add) {
            String ten = "Tran Quy Dat", lop = "CN06", diem = "3.6", type = "Gioi";
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{ten, lop, diem, type});
        } else if (modul == delete) {
            int idex = table.getSelectedRow();
            if (idex != -1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(idex);
            } else JOptionPane.showMessageDialog(null, "Ban vui dung click vao dong muon xoa nhe !");
        } else if (modul == sort) {
            int row = table.getRowCount();
            int col = table.getColumnCount();
            Object[][] ob = new Object[row][col];
            for (int i = 0; i < row; i++) {
                String tam = "";
                for (int j = 0; j < col; j++) {
                    ob[i][j] = table.getValueAt(i, j);
                    tam += ob[i][j] + " ";
                }
                tam = tam.substring(0, tam.length() - 1);
                System.out.println(tam);
            }
            Arrays.sort(ob, new Comparator<Object[]>() {
                @Override
                public int compare(Object[] a, Object[] b) {
                    double hieu = Double.parseDouble((String)b[2])-Double.parseDouble((String)a[2]);
                    if(hieu>0.0) return 1;
                    return -1;
                }
            });
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            for (int i = 0; i < row; i++) {
                model.addRow(ob[i]);
            }
        }
    }


}
