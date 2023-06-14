package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B30_Den_long {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        double res = -1e9;
        res = Math.max(a[0], l - a[n - 1]);
        for (int i = 1; i < n - 1; i++) {
            double l1 = (double) ((1.0 * a[i] - a[i - 1]) / 2);
            double l2 = (double) ((1.0 * a[i + 1] - a[i]) / 2);
            res = Math.max(Math.max(l1, l2), res);
        }
        System.out.printf("%.10f\n", res);
    }

}
