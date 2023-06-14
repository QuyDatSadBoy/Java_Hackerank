package OOP1.B34_sapXepGiangVien;

import java.util.*;
import java.math.*;

public class giangVien {
    public static int cnt = 1;
    public String ma, ten, nganh;

    public giangVien(String ma, String ten, String nganh) {
        this.ma = ma;
        this.ten = ten;
        this.nganh = nganh;
    }

    public String getNganh() {
        String res = "";
        String[] arr = nganh.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
        }
        return res;
    }

    public String getTen() {
        String[] arr = ten.split("\\s+");
        return arr[arr.length - 1];
    }

    public String toString() {
        return ma + " " + ten + " " + getNganh();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        giangVien[] a = new giangVien[n];
        for (int i = 0; i < n; i++) {
            String ma = "GV" + String.format("%02d", cnt++);
            a[i] = new giangVien(ma, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a, new Comparator<giangVien>() {
            @Override
            public int compare(giangVien a, giangVien b) {
                String s1 = a.getTen();
                String s2 = b.getTen();
                if (s1.equals(s2) == false) return s1.compareTo(s2);
                else return a.ma.compareTo(b.ma);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
