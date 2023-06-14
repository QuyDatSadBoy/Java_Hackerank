package Contest_FULL.De_qui;

import java.util.Scanner;

public class B20_Dem_so_thao_tac {
    public static  long res = Integer.MAX_VALUE;
    public static void back_track(long i , long n)
    {
        if(n==1)
        {
            res=Math.min(res,i);
            return;
        }
        if(n%2==0 && i<res) back_track(i+1,n/2);
        if(n%3==0 && i<res) back_track(i+1,n/3);
        if(n>1 && i<res) back_track(i+1,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        back_track(0,n);
        System.out.println(res);
    }
}
