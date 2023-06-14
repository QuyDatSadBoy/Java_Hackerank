package Contest_FULL.Sort_Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B2_Cmp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = a[i];
        }
        Arrays.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                long dem1 = Math.abs(a - x);
                long dem2 = Math.abs(b - x);
                if (dem1 != dem2) {
                    return (int) (dem1 - dem2);
                } else return (int) (a - b);
            }
        });
        Arrays.sort(b, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                long dem1 = a % 2;
                long dem2 = b % 2;
                if (dem1 != dem2) {
                    return (int) (dem1 - dem2);
                } else {
                    if (dem1 == 0) {
                        return (int) (a - b);
                    } else return (int) (b - a);
                }
            }
        });
        for (long X : a) System.out.print(X + " ");
        System.out.println();
        for (long X : b) System.out.print(X + " ");
        System.out.println();
    }
}
