package Contest_FULL.Sort_Search;

import java.util.*;

public class B3_Sort_tong_chu_so {
    public static long Sum(long n) {
        String s = String.valueOf(n);
        long sum = 0;
        for (char x : s.toCharArray()) {
            sum += (x - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                if (Sum(a) != Sum(b)) return (int) (Sum(a) - Sum(b));
                else return (int) (a - b);
            }
        });
        for (long x : a) System.out.print(x + " ");
        System.out.println();

    }
}
