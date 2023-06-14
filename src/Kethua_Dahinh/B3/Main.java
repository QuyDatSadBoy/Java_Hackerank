package Kethua_Dahinh.B3;

import java.util.*;
import java.math.*;

class person {
    public String ten, ngaySinh, diaChi;

    public person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void chuanHoa() {
        String res = "";
        String[] arr = ten.toLowerCase().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) {
                res += arr[i].charAt(j);
            }
            if (i != arr.length - 1) res += " ";
        }
        this.ten = res;
        StringBuilder ss = new StringBuilder(ngaySinh);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        ngaySinh = ss.toString();
    }

    public String toString() {
        return ten + " " + ngaySinh + " " + diaChi + " ";
    }
}

class sinhVien extends person {
    public String ma, lop, gpa;

    public sinhVien(String ten, String ngaySinh, String diaChi, String ma, String lop, String gpa) {

        super(ten, ngaySinh, diaChi);
        this.ma = ma;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString() {
        return ma + " " + super.toString() + lop + " " + gpa;
    }
}

class giaoVien extends person {
    public String ma, khoa, luong;

    public giaoVien(String ten, String ngaySinh, String diaChi, String ma, String khoa, String luong) {
        super(ten, ngaySinh, diaChi);
        this.ma = ma;
        this.khoa = khoa;
        this.luong = luong;
    }

    public String toString() {
        return ma + " " + super.toString() + khoa + " " + luong;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<person> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String diaChi = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                giaoVien gv = new giaoVien(ten, ns, diaChi, ma, sc.nextLine(), sc.nextLine());
                gv.chuanHoa();
                a.add(gv);
            } else {
                sinhVien sv = new sinhVien(ten, ns, diaChi, ma, sc.nextLine(), sc.nextLine());
                sv.chuanHoa();
                a.add(sv);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof giaoVien) {
                System.out.println(a.get(i));
            }
        }
        System.out.println("DANH SACH SINH VIEN :");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof sinhVien) {
                System.out.println(a.get(i));
            }
        }
    }
}
