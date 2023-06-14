package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B48_So_may_man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1) {
            int sum = 0;
            for (char x : s.toCharArray()) {
                sum += x - '0';
            }
            s = String.valueOf(sum);
        }
        if (s.compareTo("9") == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
