package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI implements ActionListener {
    JFrame frame;
    JLabel lblUsername;
    JLabel lblPassword;
    JButton btnLogin;
    JTextField jtfUsername, jtfPassword;

    SimpleGUI() {
        frame = new JFrame("GUI example");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        btnLogin = new JButton("Login");

        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        btnLogin.setBounds(140, 150, 80, 20);

        jtfUsername = new JTextField();
        jtfPassword = new JTextField();
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);
        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        btnLogin.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblUsername.setText("Tai Khoan");
        lblPassword.setText("Mat Khau");
        String tk = jtfUsername.getText();
        String mk = jtfPassword.getText();
        System.out.println("tk=" + tk + " " + "mk=" + mk);
        System.out.println("Day la TQD");
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}
