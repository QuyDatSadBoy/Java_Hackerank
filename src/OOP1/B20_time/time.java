package OOP1.B20_time;

import java.util.*;

public class time {
    private long h, p, s;

    public long getH() {
        return h;
    }

    public long getS() {
        return s;
    }

    public long getP() {
        return p;
    }

    public time(long h, long p, long s) {
        this.h = h;
        this.p = p;
        this.s = s;
    }

    @Override
    public String toString() {
        String res = "";
        res = res + this.h + " " + this.p + " " + this.s;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = T;
        time[] a = new time[T];
        while (T-- > 0) {
            a[T] = new time(sc.nextLong(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new sort_time());
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
