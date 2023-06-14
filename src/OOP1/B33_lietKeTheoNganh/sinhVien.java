package OOP1.B33_lietKeTheoNganh;

import java.util.*;
import java.math.*;

public class sinhVien {
    public String ma, ten, lop, gmail;

    public sinhVien(String ma, String ten, String lop, String gmail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.gmail = gmail;
    }

    public String nganh() {
        String res = "";
        for (char x : lop.toCharArray()) {
            if (Character.isAlphabetic(x)) res += x;
        }
        return res;
    }

    public void chuanHoa() {
        ten = ten.toLowerCase();
        StringBuilder ss = new StringBuilder(ten);
        String[] arr = ten.split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) res += arr[i].charAt(j);
            res += " ";
        }
        res = res.substring(0, res.length() - 1);
        ten = res;
    }

    public String toString() {
        return ma + " " + ten + " " + lop + " " + gmail;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien[] a = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a[i].chuanHoa();
        }
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String res = sc.nextLine();
            String tam;
            if (res.equals("CNTT")) tam = "CONG NGHE THONG TIN";
            else if (res.equals("KT")) tam = "KE TOAN";
            else if (res.equals("DTVT")) tam = "DIEN TU VIEN THONG";
            else tam = "MARKETING";
            System.out.println("DANH SACH SINH VIEN NGANH " + tam + " :");
            for (int i = 0; i < n; i++) {
                if (a[i].nganh().equals(res) == true) System.out.println(a[i]);
            }
        }
    }
}
