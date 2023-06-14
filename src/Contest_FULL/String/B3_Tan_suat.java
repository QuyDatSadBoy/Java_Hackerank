package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B3_Tan_suat {
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
        Set<Map.Entry<Character, Long>> entrySet = mp.entrySet();
        for (Map.Entry<Character, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for (char x : s.toCharArray()) {
            if (mp.containsKey(x) == true) {
                System.out.println(x + " " + mp.get(x));
                mp.remove(x);
            }
        }
    }
}
