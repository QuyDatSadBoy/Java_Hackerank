package Contest_FULL.De_qui;

import java.util.Scanner;

public class Bai_21_kiem_tra_mang_doi_xung {
    public static boolean check(long[] a, int l, int r) {
        if (l >= r) return true;
        if (a[l] != a[r]) return false;
        else return check(a, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        if (check(a, 0, n - 1) == true) System.out.println("YES");
        else System.out.println("NO");
    }
}
