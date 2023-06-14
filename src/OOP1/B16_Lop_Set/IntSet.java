package OOP1.B16_Lop_Set;

import java.util.Scanner;
import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> se = new TreeSet<>();

    public IntSet(int[] a) {
        for (int x : a) se.add(x);
    }

    public IntSet() {
    }

    public IntSet Union(IntSet b) {
        IntSet res = new IntSet();
        for (int x : b.se) {
            res.se.add(x);
        }
        for (int x : this.se) {
            res.se.add(x);
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (int x : this.se) {
            res += String.valueOf(x) + " ";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.Union(s2);
        System.out.println(s3);
    }
}
