package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B10_Liet_ke_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long cnt = 0;
        Set<String> se1 = new TreeSet<>();
        Set<String> se2 = new LinkedHashSet<>();
        String[] a = s.split("\\s+");
        for (String x : a) {
            se1.add(x);
            se2.add(x);
        }
        for (String x : se1) {
            cnt++;
            if (cnt != se1.size()) {
                System.out.print(x + " ");
            } else System.out.print(x);
        }
        System.out.println();
        cnt = 0;
        for (String x : se2) {
            cnt++;
            if (cnt != se2.size()) {
                System.out.print(x + " ");
            } else System.out.print(x);
        }
        System.out.println();
        System.out.println(String.format("%010d",2));
    }
}
