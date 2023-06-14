package Contest_FULL.Sort_Search;

import java.util.Scanner;

public class Day_con_dai_nhat_cac_phan_tu_lien_ke_khac_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int res = 1, ans = a[0], cnt = 1, sum = a[0], index = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                cnt++;
                sum += a[i];
            }
            else
            {
                cnt=1;
                sum=a[i];
            }
            if (cnt > res) {
                index = i;
                ans = sum;
                res = cnt;
            } else if (cnt == res) {
                if (sum > ans) {
                    ans = sum;
                    index = i;
                }
            }
        }
        System.out.println(res);
        for (int i = index - res + 1; i <= index; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
