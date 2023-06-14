package OOP2.B7_Custom;

import java.util.*;
import java.math.*;

class Cus {
    public String id, name;
    public double dc;

    public Cus(String id, String name, double dc) {
        this.id = id;
        this.name = name;
        this.dc = dc;
    }

    public String toString() {
        return "Customer ID : " + id + '\n' + "Full Name : " + name + '\n';
    }
}

class invoice {
    public String id;
    double amount;
    Cus c;

    public invoice(String id, double amount, Cus c) {
        this.id = id;
        this.amount = amount;
        this.c = c;
    }

    public void cal() {
        this.amount = this.amount - (this.amount / 100 * 1.0 * c.dc);
    }

    public String toString() {
        return this.c.toString() + "Amount : " + String.format("%.2f", amount) + " $" + "\n--------------------";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        invoice[] a = new invoice[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] s1 = sc.nextLine().split("\\s+");
            String[] s2 = sc.nextLine().split("\\s+");
            String[] s3 = sc.nextLine().split("\\s+");
            String[] s4 = sc.nextLine().split("\\s+");
            String[] s5 = sc.nextLine().split("\\s+");
            String id1 = s1[3];
            String name = "";
            for (int j = 3; j < s2.length; j++) name += s2[j] + " ";
            name = name.substring(0, name.length() - 1);
            double dc = Double.parseDouble(s3[2]);
            String id2 = s4[3];
            double amount = Double.parseDouble(s5[2]);
            Cus cs = new Cus(id1, name, dc);
            a[i] = new invoice(id2, amount, cs);
            a[i].cal();
        }
        Arrays.sort(a, new Comparator<invoice>() {
            @Override
            public int compare(invoice a, invoice b) {
                if (a.amount != b.amount) {
                    if (a.amount > b.amount) return -1;
                    else return 1;
                } else return a.c.id.compareTo(b.c.id);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
