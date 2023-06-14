package OOP1.B29_sinhVien;

import java.util.*;
import java.math.*;

public class sinhVien {
    public String ma, ten, lop, gmail;

    public sinhVien(String ma, String ten, String lop, String gmail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.gmail = gmail;
    }

    public String toString() {
        return ma + " " + ten + " " + lop + " " + gmail;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien[] a = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien a, sinhVien b) {
                if (a.lop.equals(b.lop) == false) return a.lop.compareTo(b.lop);
                else return a.ma.compareTo(b.ma);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
