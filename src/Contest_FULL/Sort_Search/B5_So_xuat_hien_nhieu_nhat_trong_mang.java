package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B5_So_xuat_hien_nhieu_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = Integer.MIN_VALUE, ans = 0;
        TreeMap<Long, Long> mp = new TreeMap<Long, Long>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (mp.containsKey(x) == true) {
                long cnt = mp.get(x);
                mp.put(x, cnt + 1);
            } else mp.put(x, 1l * 1);
        }
        Set<Map.Entry<Long, Long>> entry = mp.entrySet();
        for (Map.Entry<Long, Long> x : entry) {
            long u = x.getKey();
            long cnt = x.getValue();
            if (cnt > res) {
                res = cnt;
                ans = u;
            }
        }
        System.out.println(ans + " " + res);

    }
}
