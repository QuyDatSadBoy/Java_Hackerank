package GUI;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI example");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ToolTipManager.sharedInstance().setInitialDelay(0);
        frame.setLayout(null);

        JCheckBox cb1 = new JCheckBox("Nam");
        JCheckBox cb2 = new JCheckBox("NU");
        cb1.setBounds(50,200,100,100);
        cb2.setBounds(50,300,100,100);

        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);

        JTextField jtfUsername = new JTextField();
        JTextField jtfPassword = new JTextField();
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(140, 150, 80, 20);
        JButton btnLogin2 = new JButton("Login2");
        btnLogin2.setBounds(300, 150, 80, 20);

        String[] arr = {"C++","Java","Python","C"};
        JComboBox cb = new JComboBox(arr);
        cb.setToolTipText("Danh muc ngon ngu");
        cb.setBounds(150,300,50,50);

        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfPassword);
        frame.add(jtfUsername);
        frame.add(btnLogin2);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb);
        frame.setVisible(true);

        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res = (String)cb.getItemAt(cb.getSelectedIndex());
                System.out.println(res);
            }
        });
        btnLogin2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tk = jtfUsername.getText();
                String mk = jtfPassword.getText();
                System.out.println(tk + " " +mk+" 2");
            }
        });
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int res=itemEvent.getStateChange();
                if(res==1) System.out.println("Nam on");
                else System.out.println("Nam off");
            }
        });
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int res=itemEvent.getStateChange();
                if(res==1) System.out.println("Nu on");
                else System.out.println("Nu off");
            }
        });
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("day la TQD");
            }
        });
    }
}
