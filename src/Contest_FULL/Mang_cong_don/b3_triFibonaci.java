package Contest_FULL.Mang_cong_don;

import java.util.Scanner;

public class b3_triFibonaci {
    public static long[] f = new long[1000001];
    public static long mod = (long) (1e9 + 7);

    public static void init() {
        f[0] = 0;
        f[1] = 0;
        f[2] = 1;
        for (int i = 3; i <= 1000000; i++) {
            f[i] = ((f[i - 1] % mod) + (f[i - 2] % mod) + (f[i - 3] % mod)) % mod;
        }
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
