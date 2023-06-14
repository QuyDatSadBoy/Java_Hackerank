package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B9_Dem_so_luong_tu_trong_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer ss = new StringTokenizer(s);
        long cnt = 0;
        while (ss.hasMoreTokens()) {
            cnt++;
            System.out.println(ss.nextToken());
        }
        System.out.println(cnt);
    }
}
