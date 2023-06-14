package OOP1.B25_nhanVien;

import java.util.*;
import java.math.*;

public class nhanVien {
    public static long cnt = 1;
    private String ma, ten, gt, ns1, dc, sdt, ns2;

    public nhanVien(String ma, String ten, String gt, String ns1, String dc, String sdt, String ns2) {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        this.ns1 = ns1;
        this.dc = dc;
        this.sdt = sdt;
        this.ns2 = ns2;
    }

    public void chuanHoa() {
        StringBuilder ss = new StringBuilder(ns1);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        ns1 = ss.toString();
        ss = new StringBuilder(ns2);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        ns2 = ss.toString();
    }

    public String toString() {
        return ma + " " + ten + " " + gt + " " + ns1 + " " + dc + " " + sdt + " " + ns2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        nhanVien[] a = new nhanVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new nhanVien(String.format("%05d", cnt++), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a[i].chuanHoa();
            System.out.println(a[i]);
        }
    }
}
