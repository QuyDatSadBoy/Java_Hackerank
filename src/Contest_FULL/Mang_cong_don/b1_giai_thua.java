package Contest_FULL.Mang_cong_don;

import java.util.Scanner;

public class b1_giai_thua {
    public static long[] f = new long[1000001];
    public static long mod = (long)(1e9+7);
    public static void init()
    {
        f[0]=1;
        for(int i=1;i<=1000000;i++)
        {
            f[i]=((i%mod)*(f[i-1]%mod))%mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        init();
        while(T--!=0)
        {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
