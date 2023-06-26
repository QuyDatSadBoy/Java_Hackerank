package GUI;

import java.awt.event.*;
import javax.swing.*;

public class listTable extends JFrame implements ActionListener {
    JFrame frame;
    JLabel lblUsername;
    JLabel lblPassword;
    JButton btnLogin, btnOrder;
    JTextField jtfUsername, jtfPassword;
    //JTextArea jtaTest;
    JList drink, food;

    listTable() {
        frame = new JFrame("GUI example");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        ToolTipManager.sharedInstance().setInitialDelay(0);

        lblUsername = new JLabel("Username");
        lblPassword = new JLabel("Password");
        btnLogin = new JButton("Login");
        btnOrder = new JButton("Order");
        btnOrder.addActionListener(this);

        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        btnLogin.setBounds(140, 150, 80, 20);
        btnOrder.setBounds(250, 350, 100, 100);

        jtfUsername = new JTextField();
        jtfPassword = new JTextField();
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);


//        jtaTest = new JTextArea();
//        jtaTest.setBounds(100,200,200,50);
//        jtaTest.setToolTipText("Moi ban nhap du lieu vo han !!!");
//        jtaTest.setWrapStyleWord(true);
//        jtaTest.setLineWrap(true);

        String[] arr = {"Ga Ran", "Thit Ga", "Thit Lon", "Thit Bo"};
        DefaultListModel model1 = new DefaultListModel();
        for (String x : arr) model1.addElement(x);
        food = new JList(model1);

        String[] arr2 = {"Coca", "Pepsi", "Fanta", "7Up"};
        DefaultListModel model2 = new DefaultListModel();
        for (String x : arr2) model2.addElement(x);
        drink = new JList(model2);


        JScrollPane Scroll1 = new JScrollPane(food);
        JScrollPane Scroll2 = new JScrollPane(drink);

        Scroll1.setBounds(50, 250, 100, 100);
        Scroll2.setBounds(200, 250, 100, 100);

        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        //frame.add(jtaTest);
        frame.add(Scroll1);
        frame.add(Scroll2);
        frame.add(btnOrder);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel model1 = (DefaultListModel) food.getModel();
        DefaultListModel model2 = (DefaultListModel) drink.getModel();
        int[] arr1 = food.getSelectedIndices();
        int[] arr2 = drink.getSelectedIndices();
        if (arr1.length != 0) {
            System.out.println("Ban da Order : ");
            for (int x : arr1) {
                System.out.println(model1.getElementAt(x));
            }
        } else System.out.println("Ban chua Order do an !");
        if (arr2.length != 0) {
            System.out.println("Ban da Order : ");
            for (int x : arr2) {
                System.out.println(model2.getElementAt(x));
            }
        } else System.out.println("Ban chua Order do uong !");
    }

    public static void main(String[] args) {
        new listTable();
    }
}
