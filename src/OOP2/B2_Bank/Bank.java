package OOP2.B2_Bank;

import java.util.*;

public class Bank {
    public String id1, id2, tk, mk;
    public long tien;

    public void napTien(long a) {
        this.tien += a;
    }

    public boolean rutTien(long a) {
        if ((this.tien - 50000) >= a) {
            this.tien -= a;
            return true;
        }
        return false;
    }

    public Bank(String id1, String id2, String tk, String mk, long tien) {
        this.id1 = id1;
        this.id2 = id2;
        this.tk = tk;
        this.mk = mk;
        this.tien = tien;
    }

    public String toString() {
        return "ID : " + id1 + '\n' + "CusID : " + id2 + '\n' + "Number : " + tk + '\n' + "PIN : " + mk + '\n' + "Balance : " + tien + "VND\n-------------------";
    }

    public static int find(Bank[] a, int n, String s) {
        for (int i = 0; i < n; i++) {
            if (a[i].tk.equals(s) == true) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Bank[] a = new Bank[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Bank(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }
        int q = Integer.parseInt(sc.next());
        while (q-- > 0) {
            String modul = sc.next();
            if (modul.equals("deposit") == true) {
                String tk = sc.next();
                long tien = Long.parseLong(sc.next());
                int idex = find(a, n, tk);
                if (idex != -1) a[idex].napTien(tien);
            } else if (modul.equals("withdraw")) {
                String tk = sc.next();
                long tien = Long.parseLong(sc.next());
                int idex = find(a, n, tk);
                if (idex != -1) {
                    a[idex].rutTien(tien);
                }
            } else {
                String s = sc.next();
                String t = sc.next();
                long tien = Long.parseLong(sc.next());
                int idex1 = find(a, n, s);
                int idex2 = find(a, n, t);
                boolean ok = false;
                if (idex1 != -1) {
                    if (a[idex1].tien - tien >= 50000) {
                        a[idex1].rutTien(tien);
                        ok = true;
                    }
                }
                if (idex2 != -1 && ok == true) a[idex2].napTien(tien);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
