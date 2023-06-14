package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B44_Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        System.out.println(a.modPow(b, new BigInteger(String.valueOf((long) (1e9 + 7)))));
    }
}
