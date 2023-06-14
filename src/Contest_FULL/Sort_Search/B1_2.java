package Contest_FULL.Sort_Search;

import java.util.*;

public class B1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a, 0, n);
        for (long x : a) System.out.print(x + " ");
        System.out.println();
        Arrays.sort(a, 0, n, Collections.reverseOrder());
        for (long x : a) System.out.print(x + " ");
        System.out.println();

    }
}
