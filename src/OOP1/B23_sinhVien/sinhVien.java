package OOP1.B23_sinhVien;

import java.util.*;
import java.math.*;

public class sinhVien {
    public static long cnt = 1;
    private String ma, ten, lop, ns;
    double gpa;

    public sinhVien(String ma, String ten, String lop, String ns, double gpa) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }

    public void chuanHoaTen() {
        String[] arr = ten.split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) res += arr[i].charAt(j);
            res += " ";
        }
        res = res.substring(0, res.length() - 1);
        ten = res;
    }

    public void chuanHoa() {
        StringBuilder ss = new StringBuilder(ns);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        ns = ss.toString();
    }

    public String toString() {
        return ma + " " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien[] a = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new sinhVien("SV" + String.format("%03d", cnt++), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            a[i].chuanHoa();
            a[i].chuanHoaTen();
            System.out.println(a[i]);
        }
    }
}
