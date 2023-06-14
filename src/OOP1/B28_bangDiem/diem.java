package OOP1.B28_bangDiem;

import java.util.*;
import java.math.*;

public class diem {
    public static long cnt = 1;
    public String ma, ten, kq;
    public double tb;

    public diem(String ma, String ten, String kq, double tb) {
        this.ma = ma;
        this.ten = ten;
        this.kq = kq;
        this.tb = tb;
    }

    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", tb) + " " + kq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        diem[] a = new diem[n];
        for (int i = 0; i < n; i++) {
            String ma = "HS" + String.format("%02d", cnt++);
            String ten = sc.nextLine();
            double sum = 0;
            for (int j = 0; j < 10; j++) {
                double x = sc.nextDouble();
                sum += x;
            }
            sc.nextLine();
            sum /= 10.0;
            String kq;
            if (sum >= 9.0) kq = "XUAT SAC";
            else if (sum >= 8.0) kq = "GIOI";
            else if (sum >= 7.0) kq = "KHA";
            else if (sum >= 5.0) kq = "TB";
            else kq = "YEU";
            a[i] = new diem(ma, ten, kq, sum);
        }
        Arrays.sort(a, new Comparator<diem>() {
            @Override
            public int compare(diem a, diem b) {
                if (a.tb != b.tb) {
                    if (a.tb > b.tb) return -1;
                    else return 1;
                } else return a.ma.compareTo(b.ma);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
