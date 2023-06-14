package OOP1.B21_DanhSachMatHang;

import java.util.*;
import java.math.*;

public class client {
    public static long cnt = 1;
    private String ma, loai, doVi;
    private long mua, ban, lai;

    public client(String ma, String loai, String doVi, long mua, long ban, long lai) {
        this.ma = ma;
        this.loai = loai;
        this.doVi = doVi;
        this.mua = mua;
        this.ban = ban;
        this.lai = lai;
    }

    public String toString() {
        return ma + " " + loai + " " + doVi + " " + mua + " " + ban + " " + lai;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        client[] a = new client[n];
        for (int i = 0; i < n; i++) {
            String ma = "MH" + String.format("%04d", cnt++), loai = sc.nextLine(), donvi = sc.nextLine();
            long mua = Long.parseLong(sc.nextLine());
            long ban = Long.parseLong(sc.nextLine());
            a[i] = new client(ma, loai, donvi, mua, ban, ban - mua);
        }
        Arrays.sort(a, new Comparator<client>() {
            @Override
            public int compare(client a, client b) {
                if (a.lai != b.lai) return (int) (b.lai - a.lai);
                else return a.ma.compareTo(b.ma);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }

}
