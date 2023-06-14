package Contest_FULL.Sort_Search;

import java.util.Arrays;
import java.util.Scanner;

public class B19_Tong_lon_hon_K {
    public static int start(long[] a, int l, int r, long x) {
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] > x) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static int end(long[] a, int l, int r, long x) {
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] < x) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long res = 0;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            int idex1 = start(a, i + 1, n - 1, k - a[i]);
            if (idex1 != -1) {
                res += (n - idex1);
            }
        }
        System.out.println(res);
    }
}
