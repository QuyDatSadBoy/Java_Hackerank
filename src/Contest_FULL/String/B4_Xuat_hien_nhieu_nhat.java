package Contest_FULL.String;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class B4_Xuat_hien_nhieu_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Long> mp = new TreeMap<Character, Long>();
        for (char x : s.toCharArray()) {
            if (mp.containsKey(x) == true) {
                long cnt = mp.get(x);
                mp.put(x, cnt + 1);
            } else mp.put(x, 1L * 1);
        }
        long res1 = -1, res2 = (long) (1e18);
        char c1 = 'c', c2 = 'c';
        Set<Map.Entry<Character, Long>> entrySet = mp.entrySet();
        for (Map.Entry<Character, Long> entry : entrySet) {
            char value = entry.getKey();
            long cnt = entry.getValue();
            if (cnt >= res1) {
                c1 = value;
                res1 = cnt;
            }
            if (cnt <= res2) {
                c2 = value;
                res2 = cnt;
            }
        }
        System.out.println(c1 + " " + res1);
        System.out.println(c2 + " " + res2);

    }
}
