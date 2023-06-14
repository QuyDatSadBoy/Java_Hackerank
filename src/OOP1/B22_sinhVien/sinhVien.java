package OOP1.B22_sinhVien;

import java.util.*;

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
            System.out.println(a[i]);
        }
    }
}
