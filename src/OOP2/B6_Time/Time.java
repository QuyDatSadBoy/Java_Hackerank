package OOP2.B6_Time;

import java.util.*;
import java.math.*;

public class Time {
    public long h, p, s;

    public void convert(String S) {
        String[] arr = S.split(":");
        h = Long.parseLong(arr[0]);
        p = Long.parseLong(arr[1]);
        s = Long.parseLong(arr[2]);
    }

    public long sum() {
        return h * 3600 + p * 60 + s;
    }

    public void digit(long ans) {
        long res = this.sum() + ans;
        res = Math.max(res, 0);
        h = res / 3600;
        h %= 24;
        res %= 3600;
        p = res / 60;
        res %= 60;
        s = res;
    }

    public String toString() {
        return String.format("%02d", h) + ":" + String.format("%02d", p) + ":" + String.format("%02d", s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Time[] t = new Time[6];
        for (int i = 0; i < 6; i++) {
            t[i] = new Time();
            t[i].convert(S);
        }
        long[] a = {1, 60, 3600, -1, -60, -3600};
        for (int i = 0; i < 6; i++) {
            t[i].digit(a[i]);
            System.out.println(t[i]);
        }
    }
}
