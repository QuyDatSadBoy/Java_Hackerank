package Contest_FULL.String;

import java.util.*;
import java.math.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long chu = 0, so = 0, khac = 0;
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x) == true) chu++;
            else if (Character.isDigit(x) == true) so++;
            else khac++;
        }
        System.out.println(chu + " " + so + " " + khac);

    }
}
