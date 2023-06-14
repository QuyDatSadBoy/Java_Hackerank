package OOP1.B13_Phan_so;

import java.util.*;
import java.math.*;

public class phanSo {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long tu, mau;

    public phanSo() {
    }

    ;

    public phanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void rutGon() {
        long tam = gcd(this.tu, this.mau);
        tu = tu / tam;
        mau = mau / tam;
    }

    public static phanSo tong(phanSo a, phanSo b) {
        phanSo sum = new phanSo();
        long lcm1 = lcm(a.mau, b.mau);
        sum.tu = a.tu * (lcm1 / a.mau) + b.tu * (lcm1 / b.mau);
        sum.mau = lcm1;
        sum.tu *= sum.tu;
        sum.mau *= sum.mau;
        sum.rutGon();
        return sum;
    }

    public static phanSo tich(phanSo a, phanSo b, phanSo c) {
        phanSo Tich = new phanSo();
        Tich.tu = a.tu * b.tu * c.tu;
        Tich.mau = a.mau * b.mau * c.mau;
        Tich.rutGon();
        return Tich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            phanSo a = new phanSo(sc.nextLong(), sc.nextLong());
            phanSo b = new phanSo(sc.nextLong(), sc.nextLong());
            phanSo c = tong(a, b);
            phanSo Tich = tich(a, b, c);
            System.out.println(c.tu + "/" + c.mau + " " + Tich.tu + "/" + Tich.mau);
        }
    }
}
