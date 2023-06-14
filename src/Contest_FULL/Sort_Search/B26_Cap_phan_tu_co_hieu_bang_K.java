package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B26_Cap_phan_tu_co_hieu_bang_K {
    public static int[] cnt = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (cnt[a[i] + k] > 0) {
                ok = true;
                break;
            }
        }
        if (ok == true) System.out.println(1);
        else System.out.println(-1);
    }
}
