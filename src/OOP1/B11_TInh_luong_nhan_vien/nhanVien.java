package OOP1.B11_TInh_luong_nhan_vien;

import java.util.*;

public class nhanVien {
    public static long cnt = 1;
    private String ma, ten;
    private long luongCung, thuong, phucCap, luongThang;

    public nhanVien(String ma, String ten, long luongCung, long thuong, long phucCap, long luongThang) {
        this.ma = ma;
        this.ten = ten;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phucCap = phucCap;
        this.luongThang = luongThang;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongCung + " " + thuong + " " + phucCap + " " + luongThang;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tam = sc.nextLine();
        long luongDay = sc.nextLong(), ngay = sc.nextLong();
        sc.nextLine();
        String bac = sc.nextLine();
        String ma = "NV" + String.format("%02d", cnt++);
        long luongCung = luongDay * ngay;
        long thuong;
        if (ngay >= 25) thuong = (luongCung / 5);
        else if (ngay >= 22) thuong = (luongCung / 10);
        else thuong = 0;
        long phuCap;
        if (bac.equals("GD")) phuCap = 250000;
        else if (bac.equals("PGD")) phuCap = 200000;
        else if (bac.equals("TP")) phuCap = 180000;
        else phuCap = 150000;
        long luongThang = luongCung + thuong + phuCap;
        nhanVien nv = new nhanVien(ma, tam, luongCung, thuong, phuCap, luongThang);
        System.out.println(nv);
    }
}
