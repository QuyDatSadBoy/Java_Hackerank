package OOP1.B3_sinh_vien;

import java.util.Scanner;

public class sinhVien {
    private String maSV, name, lop, birth;
    private double gpa;

    public sinhVien(String maSV, String name, String lop, String birth, double gpa) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }

    void chuan_Hoa() {
        StringBuilder ss = new StringBuilder(this.birth);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        this.birth = ss.toString();
    }

    @Override
    public String toString() {
        return maSV + " " + name + " " + lop + " " + birth + " " + String.format("%.1f", gpa);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhVien sv = new sinhVien("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sv.chuan_Hoa();
        System.out.println(sv);

    }
}
