package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B41_Chia_het_cho_2_mu_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') cnt++;
            else break;
        }
        if (cnt >= k) System.out.println("YES");
        else System.out.println("NO");
    }
}
