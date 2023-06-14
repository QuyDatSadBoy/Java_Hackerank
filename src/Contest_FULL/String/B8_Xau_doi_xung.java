package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B8_Xau_doi_xung {
    public static int check(String s) {
        StringBuilder tam = new StringBuilder(s);
        tam = tam.reverse();
        return s.compareTo(tam.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s) == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
