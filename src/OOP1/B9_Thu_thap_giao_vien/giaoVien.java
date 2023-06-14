package OOP1.B9_Thu_thap_giao_vien;

import java.util.*;
import java.math.*;

public class giaoVien {
    private String ma, ten;
    private long bac, luong;

    public giaoVien(String ma, String ten, long bac, long luong) {
        this.ma = ma;
        this.ten = ten;
        this.bac = bac;
        this.luong = luong;
    }

    public long cal() {
        String res = ma.substring(0, 2);
        long sum = luong * bac;
        if (res.equals("HT")) sum += 2000000;
        else if (res.equals("HP")) sum += 900000;
        else sum += 500000;
        return sum;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + bac + " " + this.cal();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        long bac = Long.parseLong(ma.substring(2, 4));
        giaoVien gv = new giaoVien(ma, sc.nextLine(), bac, sc.nextLong());
        System.out.println(gv);

    }
}
