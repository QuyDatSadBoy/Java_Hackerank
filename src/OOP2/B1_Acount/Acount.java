package OOP2.B1_Acount;

import java.util.*;

public class Acount {
    public String id, ma, tk, mk;

    public Acount(String id, String ma, String tk, String mk) {
        this.id = id;
        this.ma = ma;
        this.tk = tk;
        this.mk = mk;
    }

    public boolean check(String a, String b) {
        if (a.equals(tk) && b.equals(mk)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Acount[] a = new Acount[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Acount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            boolean ok = false;
            String s = sc.nextLine();
            String t = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (a[i].check(s, t) == true) {
                    ok = true;
                    break;
                }
            }
            if (ok == true) System.out.println("Login Successful");
            else System.out.println("Login Failed");
        }
    }
}
