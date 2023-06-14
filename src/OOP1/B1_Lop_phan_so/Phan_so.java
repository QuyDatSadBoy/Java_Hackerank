package OOP1.B1_Lop_phan_so;

import java.util.*;
import java.math.*;

public class Phan_so {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    private long tu, mau;

    public Phan_so() {
    }

    ;

    public Phan_so(long a, long b) {
        this.tu = a;
        this.mau = b;
    }

    public void simplify() {
        long Gcd = gcd(this.tu, this.mau);
        this.tu /= Gcd;
        this.mau /= Gcd;
    }

    @Override
    public String toString() {
        return (String.valueOf(this.tu) + "/" + String.valueOf(this.mau));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phan_so p = new Phan_so(sc.nextLong(), sc.nextLong());
        p.simplify();
        System.out.println(p);
    }
}
