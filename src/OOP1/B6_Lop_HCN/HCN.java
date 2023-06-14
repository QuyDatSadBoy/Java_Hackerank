package OOP1.B6_Lop_HCN;

import java.util.*;
import java.math.*;

public class HCN {
    private long width, height;
    private String color;

    public HCN(long width, long height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean check() {
        if (width < 0 || height < 0) return false;
        else return true;
    }

    public long Area() {
        return width * height;
    }

    public long Perimeter() {
        return (width + height) * 2;
    }

    public static String chuanHoa(String s) {
        s = s.toLowerCase();
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        res += s.substring(1);
        return res;
    }

    @Override
    public String toString() {
        return String.valueOf(Perimeter()) + " " + String.valueOf(Area()) + " " + chuanHoa(color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN cn = new HCN(sc.nextLong(), sc.nextLong(), sc.next());
        if (cn.check()) System.out.println(cn);
        else System.out.println("INVALID");
    }
}
