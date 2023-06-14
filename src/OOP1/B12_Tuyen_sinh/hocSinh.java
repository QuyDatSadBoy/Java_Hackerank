package OOP1.B12_Tuyen_sinh;

import java.util.*;
import java.math.*;

public class hocSinh {
    private String ma, ten, ketQua, diem;
    private long vung;

    public void calc(String ma1, String ten1, double a, double b, double c) {
        ma = ma1;
        ten = ten1;
        long d = ma1.charAt(2) - '0';
        vung = d;
        double cong;
        if (d == 1) cong = 0.5;
        else if (d == 2) cong = 1;
        else cong = 2.5;
        double sum = a + b + c + cong;
        if (sum >= (24 * 1.0)) ketQua = "TRUNG TUYEN";
        else ketQua = "TRUOT";
        if (sum == (int) (sum)) {
            diem = String.format("%.0f", sum);
        } else diem = String.format("%.1f", sum);
    }

    public String toString() {
        return ma + " " + ten + " " + String.valueOf(vung) + " " + diem + " " + ketQua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hocSinh hs = new hocSinh();
        hs.calc(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(hs);
    }
}
