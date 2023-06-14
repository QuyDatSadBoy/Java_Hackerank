package OOP1.B27_tinh_Gio;

import java.util.*;
import java.math.*;

public class time {
    public String ten, ma, ten2;
    public long choi;

    public time(String ten, String ma, String ten2, long choi) {
        this.ten = ten;
        this.ma = ma;
        this.ten2 = ten2;
        this.choi = choi;
    }

    public static long cal(String s) {
        String[] arr = s.split(":");
        long dem1 = Long.parseLong(arr[0]) * 60;
        long dem2 = Long.parseLong(arr[1]);
        return dem1 + dem2;
    }

    public static String convert(long a) {
        long dem1 = a / 60;
        long dem2 = a % 60;
        return dem1 + " " + "gio " + dem2 + " phut";
    }

    public String toString() {
        return ten + " " + ma + " " + ten2 + " " + convert(choi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        time[] a = new time[n];
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine(), ma = sc.nextLine(), ten2 = sc.nextLine();
            String vao = sc.nextLine(), ra = sc.nextLine();
            long choi = cal(ra) - cal(vao);
            a[i] = new time(ten, ma, ten2, choi);
        }
        Arrays.sort(a, new Comparator<time>() {
            @Override
            public int compare(time a, time b) {
                if (a.choi != b.choi) return (int) (b.choi - a.choi);
                else return a.ten.compareTo(b.ten);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }

}
