package OOP2.B4_Nha;

import java.util.*;
import java.math.*;

public class Nha {
    public String ma, ten;
    public long tt, tran, diem, hs;

    public Nha(String ma, String ten, long tran, long diem, long hs) {
        this.ma = ma;
        this.ten = ten;
        this.tran = tran;
        this.diem = diem;
        this.hs = hs;
    }

    public static int find(Nha[] a, String t) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].ten.equals(t) == true) return i;
        }
        return -1;
    }

    public String toString() {
        return "#" + tt + " " + ma + " " + ten + " " + tran + " " + hs + " " + diem + "\n------------------";
    }

    public static void tinh(Scanner sc, String s, Nha[] a) {
        String arr[] = s.split("\\s+");
        int idex3 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("-") == true) {
                idex3 = i;
                break;
            }
        }
        long d1 = Long.parseLong(arr[idex3 - 1]);
        long d2 = Long.parseLong(arr[idex3 + 1]);
        String ten1 = "", ten2 = "";
        for (int i = 0; i < idex3 - 1; i++) {
            ten1 += arr[i] + " ";
        }
        ten1 = ten1.substring(0, ten1.length() - 1);
        for (int i = idex3 + 2; i < arr.length; i++) {
            ten2 += arr[i] + " ";
        }
        ten2 = ten2.substring(0, ten2.length() - 1);
        int idex1 = find(a, ten1);
        int idex2 = find(a, ten2);
        if (d1 > d2) a[idex1].diem += 3;
        else if (d1 < d2) a[idex2].diem += 3;
        else {
            a[idex1].diem++;
            a[idex2].diem++;
        }
        a[idex1].tran++;
        a[idex2].tran++;
        a[idex1].hs += (d1 - d2);
        a[idex2].hs += (d2 - d1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nha[] a = new Nha[20];
        for (int i = 0; i < 20; i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            sc.nextLine();
            a[i] = new Nha(ma, ten, Long.parseLong(arr[0]), Long.parseLong(arr[2]), Long.parseLong(arr[1]));
        }
        while (sc.hasNext()) {
            String s = sc.nextLine();
            tinh(sc, s, a);
        }
        Arrays.sort(a, new cmp());
        for (int i = 0; i < 20; i++) {
            a[i].tt = i + 1;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(a[i]);
        }
    }
}
