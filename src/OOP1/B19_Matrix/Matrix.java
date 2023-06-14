package OOP1.B19_Matrix;

import java.util.*;
import java.math.*;

public class Matrix {
    private long[][] a = new long[1001][1001];
    private int n, m;

    public Matrix(int a, int b) {
        this.n = a;
        this.m = b;
    }

    public Matrix() {
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextLong();
            }
        }
    }

    public Matrix trans() {
        Matrix cv = new Matrix();
        cv.n = this.m;
        cv.m = this.n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cv.a[i][j] = a[j][i];
            }
        }
        return cv;
    }

    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(this.n, b.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < b.m; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k < b.n; k++) {
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                res += this.a[i][j] + " ";
            }
            res = res.substring(0, res.length() - 1) + '\n';
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = a.trans();
        System.out.println(a.mul(b));
    }
}
