package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Set<Character> se1 = new TreeSet<>();
        Set<Character> se2 = new TreeSet<>();
        for (char x : s1.toCharArray()) se1.add(x);
        for (char x : s2.toCharArray()) se2.add(x);
        for (char x : se1) {
            if (se2.contains(x) == false) System.out.print(x);
        }
        System.out.println();
        for (char x : se2) {
            if (se1.contains(x) == false) System.out.print(x);
        }

    }
}
