package OOP2.B8;

import java.util.*;
import java.math.*;

class Cus {
    public String id, name, gender;

    public Cus(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String toString() {
        return "Customer ID : " + id + "\nFull Name : " + name + "\nGender : " + gender;
    }
}

class acount {
    public String id;
    double tien;
    Cus c;

    public acount(String id, double tien, Cus c) {
        this.id = id;
        this.tien = tien;
        this.c = c;
    }

    public boolean check(double a) {
        if (this.tien >= a) return true;
        else return false;
    }

    public void deposit(double a) {
        tien = tien + a;
    }

    public void withdraw(double a) {
        if (this.check(a)) tien = tien - a;
    }

    public String toString() {
        return "-------------------\n" + this.c.toString() + "\nAccount ID : " + id + "\nBalance : " + String.format("%.2f", tien) + " $";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split("\\s+");
        String[] s2 = sc.nextLine().split("\\s+");
        String[] s3 = sc.nextLine().split("\\s+");
        String[] s4 = sc.nextLine().split("\\s+");
        String[] s5 = sc.nextLine().split("\\s+");
        sc.nextLine();
        String name = "";
        for (int i = 3; i < s2.length; i++) name += s2[i] + " ";
        name = name.substring(0, name.length() - 1);
        Cus c = new Cus(s1[3], name, s3[2]);
        acount a = new acount(s4[3], Double.parseDouble(s5[2]), c);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] modul = sc.nextLine().split("\\s+");
            double ans = Double.parseDouble(modul[1]);
            if (modul[0].equals("withdraw") == true) {
                if (a.check(ans) == true) {
                    System.out.println("transaction successful");
                    a.withdraw(ans);
                } else System.out.println("amount withdrawn exceeds the current balance!");
            } else {
                System.out.println("transaction successful");
                a.deposit(ans);
            }
        }
        System.out.println(a);
    }
}
