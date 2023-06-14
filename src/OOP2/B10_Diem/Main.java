package OOP2.B10_Diem;

import java.util.*;
import java.math.*;

class monHoc {
    String name;
    double soTin, diem;

    public monHoc(String name, double soTin, double diem) {
        this.name = name;
        this.soTin = soTin;
        this.diem = diem;
    }
}

class sinhVien {
    String name, ten, lop;
    monHoc[] a;

    double gpa() {
        double sum = 0;
        double res = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].soTin;
        }
        for (int i = 0; i < a.length; i++) {
            res += ((a[i].diem * a[i].soTin)) / sum;
        }
        return res;
    }

    public sinhVien(String name, String ten, String lop, monHoc[] a) {
        this.name = name;
        this.ten = ten;
        this.lop = lop;
        this.a = a;
    }

    public String toString() {
        return name + " " + ten + " " + lop + " " + String.format("%.2f", this.gpa()) + '\n' + "------------------------";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sinhVien[] arr = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            monHoc[] a = new monHoc[k];
            for (int j = 0; j < k; j++) {
                String s4 = sc.nextLine();
                String[] s5 = sc.nextLine().split("\\s+");
                a[j] = new monHoc(s4, Double.parseDouble(s5[0]), Double.parseDouble(s5[1]));
            }
            arr[i] = new sinhVien(s1, s2, s3, a);
        }
        Arrays.sort(arr, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien a, sinhVien b) {
                if (a.gpa() != b.gpa()) {
                    if (a.gpa() > b.gpa()) return -1;
                    else return 1;
                } else return a.name.compareTo(b.name);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(arr[i]);
    }
}
