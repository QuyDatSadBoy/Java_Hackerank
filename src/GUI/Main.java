package GUI;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI example");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

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

        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfPassword);
        frame.add(jtfUsername);

        frame.setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tk = jtfUsername.getText();
                String mk = jtfPassword.getText();
                System.out.println(tk + " " +mk);
            }
        });


    }
}
