package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B49_Xoa_cum_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ss = new StringBuilder(s);
        while (ss.lastIndexOf("111") >= 0) {
            int idex = ss.lastIndexOf("111");
            ss.delete(idex, idex + 3);
        }
        s = ss.toString();
        if (s.compareTo("") == 0) System.out.println("EMPTY");
        else System.out.println(s);
    }
}
