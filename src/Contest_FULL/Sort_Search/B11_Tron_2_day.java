package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B11_Tron_2_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Long[] a = new Long[n];
        Long[] b = new Long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.print("b" + (i + 1) + " ");
                i++;
            } else {
                System.out.print("c" + (j + 1) + " ");
                j++;
            }
        }
        while (i < n) {
            System.out.print("b" + (i + 1) + " ");
            i++;
        }
        while (j < m) {
            System.out.print("c" + (j + 1) + " ");
            j++;
        }
        System.out.println();

    }

}
