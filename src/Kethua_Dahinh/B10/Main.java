package Kethua_Dahinh.B10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class Vehicle {
    private String ma, hang, ten, mauSac;
    private int giaBan;

    public Vehicle() {
    }


    public Vehicle(String ma, String hang, String ten, String mauSac, int giaBan) {
        this.ma = ma;
        this.hang = hang;
        this.ten = ten;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getHang() {
        return hang;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.hang + " " + this.mauSac;

    }

    public String getMa() {
        return this.ma;
    }

    public String getTen() {
        return this.ten;
    }

}

class XeMay extends Vehicle {
    private int tocDo;


    public XeMay(int tocDo, String ma, String hang, String ten, String mauSac, int giaBan) {
        super(ma, hang, ten, mauSac, giaBan);
        this.tocDo = tocDo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.tocDo + " " + super.getGiaBan();
    }

}

class Oto extends Vehicle {
    private int maLuc;

    public Oto(int maLuc, String ma, String hang, String ten, String mauSac, int giaBan) {
        super(ma, hang, ten, mauSac, giaBan);
        this.maLuc = maLuc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + super.getGiaBan();
    }

}


/**
 * @author Andrew
 */
class SortXeMayByGia implements Comparator<XeMay> {
    public int compare(XeMay a, XeMay b) {
        if (a.getGiaBan() != b.getGiaBan())
            return b.getGiaBan() - a.getGiaBan();
        return a.getMa().compareTo(b.getMa());
    }
}

class SortOtoByGia implements Comparator<Oto> {
    public int compare(Oto a, Oto b) {
        if (a.getGiaBan() != b.getGiaBan())
            return b.getGiaBan() - a.getGiaBan();
        return a.getMa().compareTo(b.getMa());
    }
}


/**
 * @author Andrew
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XeMay> arr1 = new ArrayList<>();
        List<Oto> arr2 = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.substring(0, 2).equals("XM")) {
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int tocDo = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                XeMay m1 = new XeMay(tocDo, ma, hang, ten, mau, giaBan);
                arr1.add(m1);
            } else {
                String ten = sc.nextLine();
                String hang = sc.nextLine();
                String mau = sc.nextLine();
                int maLuc = Integer.parseInt(sc.nextLine());
                int giaBan = Integer.parseInt(sc.nextLine());
                Oto o1 = new Oto(maLuc, ma, hang, ten, mau, giaBan);
                arr2.add(o1);
            }
        }
        String s = sc.nextLine();
        System.out.println("DANH SACH OTO :");
        for (Oto x : arr2) {
            if (x.getTen().equals(s))
                System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for (XeMay x : arr1) {
            if (x.getTen().equals(s))
                System.out.println(x);
        }
    }
}
