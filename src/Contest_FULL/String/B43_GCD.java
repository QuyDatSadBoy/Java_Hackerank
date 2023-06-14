package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B43_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        System.out.println(a.gcd(b));
    }
}
