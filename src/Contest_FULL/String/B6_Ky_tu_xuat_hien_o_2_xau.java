package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B6_Ky_tu_xuat_hien_o_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Set<Character> se = new TreeSet<>(), se2 = new TreeSet<>();
        Map<Character, Long> mp = new TreeMap<>();
        for (char x : s1.toCharArray()) {
            se.add(x);
            mp.put(x, 1l * 1);
        }
        for (char x : s2.toCharArray()) {
            se.add(x);
            if (mp.containsKey(x) == true) {
                se2.add(x);
            }
        }
        for (char x : se2) System.out.print(x);
        System.out.println();
        for (char x : se) System.out.print(x);
        System.out.println();

    }
}
