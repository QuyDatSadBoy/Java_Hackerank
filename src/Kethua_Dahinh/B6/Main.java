package Kethua_Dahinh.B6;

import java.util.*;

class Person {
    private String ten, ngaySinh, diaChi;

    public Person() {
        this.ten = this.ngaySinh = this.diaChi = "";
    }

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void chuanHoa() {
        StringBuilder sb = new StringBuilder("");
        String[] arr = this.ten.split("\\s+");
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++) {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        this.ten = sb.toString();

        StringBuilder sb1 = new StringBuilder(this.ngaySinh);
        if (sb1.charAt(1) == '/')
            sb1.insert(0, "0");
        if (sb1.charAt(4) == '/')
            sb1.insert(3, "0");
        this.ngaySinh = sb1.toString();
    }

    public String getTen() {
        return ten;
    }


    @Override
    public String toString() {
        return this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}

class Student extends Person {
    private String maSinhVien, lop;
    private double gpa;


    public Student(String maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}

class Lecturer extends Person {
    private String maGiangVien, khoa, lop;
    private int luong;

    public Lecturer(String maGiangVien, String khoa, String lop, int luong, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maGiangVien = maGiangVien;
        this.khoa = khoa;
        this.lop = lop;
        this.luong = luong;
    }

    public String getLop() {
        return lop;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return this.maGiangVien + " " + super.toString() + " " + this.khoa + " " + this.luong + " " + this.lop;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list1 = new ArrayList<>();
        List<Lecturer> list2 = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.substring(0, 2).equals("GV")) {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String khoa = sc.nextLine();
                int luong = Integer.parseInt(sc.nextLine());
                String lop = sc.nextLine();
                Lecturer l = new Lecturer(ma, khoa, lop, luong, ten, ngaySinh, diaChi);
                l.chuanHoa();
                list2.add(l);
            } else {
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String lop = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                Student s = new Student(ma, lop, gpa, ten, ngaySinh, diaChi);
                s.chuanHoa();
                list1.add(s);
            }
        }
        String lop = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + lop + " :");
        for (Lecturer x : list2) {
            if (x.getLop().equals(lop))
                System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN LOP " + lop + " :");
        for (Student x : list1) {
            if (x.getLop().equals(lop))
                System.out.println(x);
        }
    }
}
