package OOP1.B30_sinhVien;

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
        sinhVien[] a = new sinhVien[5000];
        int cnt = 0;
        while (sc.hasNext()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String gmail = sc.nextLine();
            a[cnt++] = new sinhVien(ma, ten, lop, gmail);
        }
        Arrays.sort(a, 0, cnt, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien a, sinhVien b) {
                return a.ma.compareTo(b.ma);
            }
        });
        for (int i = 0; i < cnt; i++) System.out.println(a[i]);
    }
}
