package OOP1.B4_lop_NhanVien;

import java.util.*;
import java.math.*;

public class nhanVien {
    private String ma, name, gt, ns, sdt, ns2;

    public nhanVien(String ma, String name, String gt, String ns, String sdt, String ns2) {
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.sdt = sdt;
        this.ns2 = ns2;
    }

    @Override
    public String toString() {
        return ("00001 " + ma + " " + name + " " + gt + " " + ns + " " + sdt + " " + ns2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanVien nv = new nhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}


