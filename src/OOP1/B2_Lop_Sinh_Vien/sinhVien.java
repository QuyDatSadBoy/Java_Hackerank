package OOP1.B2_Lop_Sinh_Vien;

import java.util.*;
import java.math.*;

public class sinhVien {
    private String name, birth;
    private double a, b, c;

    public sinhVien(String name, String birth, double a, double b, double c) {
        this.name = name;
        this.birth = birth;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double sum_Point() {
        return this.a + this.b + this.c;
    }

    void chuan_Hoa() {
        StringBuilder ss = new StringBuilder(this.birth);
        if (ss.charAt(2) != '/') ss.insert(2, "/");
        if (ss.charAt(5) != '/') ss.insert(5, "/");
        this.birth = ss.toString();
    }

    @Override
    public String toString() {
        return name + " " + birth + " " + String.format("%.1f", this.sum_Point());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhVien sv = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        sv.chuan_Hoa();
        System.out.println(sv);

    }
}
