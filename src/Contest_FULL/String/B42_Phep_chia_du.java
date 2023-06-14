package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B42_Phep_chia_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        System.out.println(b1.mod(b2));
    }
}
