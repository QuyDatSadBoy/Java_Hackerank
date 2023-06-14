package Contest_FULL.Sort_Search;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return (int) (Math.abs(a) - Math.abs(b));
            }
        });
        for (long x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
