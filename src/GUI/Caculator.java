package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Caculator extends JFrame implements ActionListener, FocusListener {
    private JFrame frame;
    private JLabel lblFirstNumber, lblSecondNumber;
    private Button add, sub, mul, div;
    private JTextField jtfFirstNumber, jtfSecondNumber, jtfResult;
    private String Title = "Caculator";
    private String Name1 = "FirstNumber";
    private String Name2 = "SecondNumber";
    private String Name3 = "Result = ";
    private String btn1 = "ADD", btn2 = "SUB", btn3 = "MUL", btn4 = "DIV";

    Caculator() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.setTitle(Title);
        this.setSize(600, 600);
        lblFirstNumber = new JLabel(Name1);
        lblFirstNumber.setBounds(50, 100, 100, 60);
        lblSecondNumber = new JLabel(Name2);
        lblSecondNumber.setBounds(50, 160, 100, 60);
        jtfFirstNumber = new JTextField();
        jtfFirstNumber.setText(Name1);
        jtfFirstNumber.setBounds(200, 100, 150, 60);
        jtfSecondNumber = new JTextField();
        jtfSecondNumber.setText(Name2);
        jtfSecondNumber.setBounds(200, 160, 150, 60);
        jtfResult = new JTextField();
        jtfResult.setText(Name3);
        jtfResult.setEditable(false);

        jtfResult.setBounds(150, 400, 300, 100);
        add = new Button(btn1);
        add.setBounds(100, 300, 100, 60);
        sub = new Button(btn2);
        sub.setBounds(200, 300, 100, 60);
        mul = new Button(btn3);
        mul.setBounds(300, 300, 100, 60);
        div = new Button(btn4);
        div.setBounds(400, 300, 100, 60);

        jtfFirstNumber.addFocusListener(this);
        jtfSecondNumber.addFocusListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        this.add(lblFirstNumber);
        this.add(lblSecondNumber);
        this.add(jtfResult);
        this.add(jtfFirstNumber);
        this.add(jtfSecondNumber);
        this.add(add);
        this.add(sub);
        this.add(mul);
        this.add(div);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        long n1 = Long.parseLong(jtfFirstNumber.getText());
        long n2 = Long.parseLong(jtfSecondNumber.getText());
        if (a.getSource() == add) {
            jtfResult.setText("Result = " + (n1 + n2));
        }
        if (a.getSource() == sub) {
            jtfResult.setText("Result = " + (n1 - n2));
        }
        if (a.getSource() == mul) {
            jtfResult.setText("Result = " + (n1 * n2));
        }
        if (a.getSource() == div) {
            jtfResult.setText("Result = " + (n1 / n2));
        }
    }

    @Override
    public void focusGained(FocusEvent a) {
        if (a.getSource() == jtfFirstNumber) {
            if (jtfFirstNumber.getText().equals(Name1)) jtfFirstNumber.setText("");
        }
        if (a.getSource() == jtfSecondNumber) {
            if (jtfSecondNumber.getText().equals(Name2)) jtfSecondNumber.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent a) {
        if (a.getSource() == jtfFirstNumber) {
            if (jtfFirstNumber.getText().isEmpty()) {
                jtfFirstNumber.setText(Name1);
            }
        }
        if (a.getSource() == jtfSecondNumber) {
            if (jtfSecondNumber.getText().isEmpty()) {
                jtfSecondNumber.setText(Name2);
            }
        }
    }

    public static void main(String[] args) {
        new Caculator();
    }
}
