package Contest_FULL.Mang_cong_don;

import java.util.Arrays;
import java.util.Scanner;

public class b5_Prime_2 {
    public static long[] prime = new long[1000001];
    public static long[] f = new long[1000001];

    public static void init() {
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= (long) (Math.sqrt(1000000)); i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }

    static void sieve() {
        f[0] = 0;
        f[1] = 0;
        f[2] = 1;
        for (int i = 3; i <= 1000000; i++) {
            if (prime[i] == 1) {
                f[i] = f[i - 1] + 1;
            } else f[i] = f[i - 1];
        }
    }

    public static void main(String[] args) {
        init();
        sieve();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int l = sc.nextInt(),r=sc.nextInt();
            l = Math.max(l,1);
            System.out.println(f[r]-f[l-1]);
        }
    }
}
