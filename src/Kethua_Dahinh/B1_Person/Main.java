package Kethua_Dahinh.B1_Person;

import java.util.*;

class Person {
    public String ten, ngaySinh, diaChi;

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void chuanHoa() {
        String arr[] = this.ten.toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) res += arr[i].charAt(j);
            res += " ";
        }
        res = res.substring(0, res.length() - 1);
        this.ten = res;
        StringBuilder ss = new StringBuilder(ngaySinh);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        this.ngaySinh = ss.toString();
    }

    public String toString() {
        return ten + " " + ngaySinh + " " + diaChi + " ";
    }
}

class student extends Person {
    public String ma, lop;
    public double gpa;

    public student(String ten, String ngaySinh, String diaChi, String ma, String lop, double gpa) {
        super(ten, ngaySinh, diaChi);
        this.ma = ma;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString() {
        return ma + " " + super.toString() + lop + " " + String.format("%.2f", this.gpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            String ngaySinh = "", diaChi = "";
            for (char x : s.toCharArray()) {
                if (Character.isDigit(x) || x == '/') {
                    ngaySinh += x;
                } else diaChi += x;
            }
            student hs = new student(ten, ngaySinh, diaChi, String.format("%04d", i + 1), lop, gpa);
            hs.chuanHoa();
            System.out.println(hs);
        }
    }
}