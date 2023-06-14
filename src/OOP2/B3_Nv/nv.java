package OOP2.B3_Nv;

import java.util.*;

public class nv {
    public long sm, mau;
    public String tt;

    public nv(long sm, long mau, String tt) {
        this.sm = sm;
        this.mau = mau;
        this.tt = tt;
    }

    public void mushRoom() {
        if (tt.equals("ALIVE")) {
            mau -= 15;
            sm -= 2;
            if (mau <= 0 || sm <= 0) {
                mau = 0;
                sm = 0;
                tt = "DEAD";
            }
        }
    }

    public void pea() {
        if (tt.equals("ALIVE")) {
            mau += 10;
            sm += 2;
        }
    }

    public void witch(long a) {
        if (tt.equals("ALIVE") == true) {
            if (a >= sm) {
                mau = sm = 0;
                tt = "DEAD";
            } else {
                sm += 5;
            }
        }
    }

    public void solider(long a) {
        if (tt.equals("ALIVE")) {
            if (a >= sm) {
                mau = sm = 0;
                tt = "DEAD";
            } else {
                sm += 7;
                mau += 5;
            }
        }
    }

    public String toString() {
        return "POWER : " + sm + '\n' + "BLOOD : " + mau + '\n' + tt + "\n--------------------";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sm = Long.parseLong(sc.nextLine().substring(8));
        long mau = Long.parseLong(sc.nextLine().substring(8));
        String tt = sc.nextLine();
        nv qd = new nv(sm, mau, tt);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String modul = sc.nextLine();
            if (modul.charAt(0) == 'p') {
                qd.pea();
                System.out.println(qd);
            } else if (modul.charAt(0) == 'm') {
                qd.mushRoom();
                System.out.println(qd);
            } else if (modul.charAt(0) == 'w') {
                qd.witch(Long.parseLong(modul.substring(6)));
                System.out.println(qd);
            } else {
                qd.solider(Long.parseLong(modul.substring(8)));
                System.out.println(qd);
            }
        }
    }
}
