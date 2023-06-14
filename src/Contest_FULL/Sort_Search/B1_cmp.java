package Contest_FULL.Sort_Search;

import java.util.*;


public class B1_cmp {
    public static long Cnt_chan(long n) {
        long chan = 0;
        String s = String.valueOf(n);
        for (char x : s.toCharArray()) {
            if ((x - '0') % 2 == 0) chan++;
        }
        return chan;
    }

    public static long Cnt_le(long n) {
        long chan = 0;
        String s = String.valueOf(n);
        for (char x : s.toCharArray()) {
            if ((x - '0') % 2 == 1) chan++;
        }
        return chan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Long, Long> mp = new TreeMap<>();
        int n = sc.nextInt();
        Long[] a = new Long[n];
        Long[] b = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            b[i] = a[i];
            if (mp.containsKey(a[i]) == true) {
                long cnt = mp.get(a[i]);
                mp.put(a[i], cnt + 1);
            } else mp.put(a[i], 1L * 1);
        }
        Arrays.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                if(Cnt_chan(a)==Cnt_chan(b))
                {
                    return (int)(a-b);
                }
                else return (int) (Cnt_chan(a) - Cnt_chan(b));
            }
        });
        Arrays.sort(b, new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return (int) (Cnt_le(a) - Cnt_le(b));
            }
        });
        for (long x : a) System.out.print(x + " ");
        System.out.println();
        for (long x : b) System.out.print(x + " ");

    }
}
