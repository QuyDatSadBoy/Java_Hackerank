package Contest_FULL.Sort_Search;

import java.util.*;
import java.math.*;

public class B22_Sort_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mp = new TreeMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String s = String.valueOf(x);
            for (char v : s.toCharArray()) {
                mp.put(v, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = mp.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();

    }
}
