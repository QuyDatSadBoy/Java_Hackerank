package Contest_FULL.Sort_Search;

import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1_Cac_so_khac_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Long> se = new HashSet<Long>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            se.add(x);
        }
        System.out.println(se.size());
    }
}
