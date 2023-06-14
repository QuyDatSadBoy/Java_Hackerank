package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B9_Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a, 0, n);
        int q = sc.nextInt();
        while (q-- > 0) {
            long x = sc.nextLong();
            if (Arrays.binarySearch(a, 0, n, x) >= 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
