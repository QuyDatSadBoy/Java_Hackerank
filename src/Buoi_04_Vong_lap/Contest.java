package Buoi_04_Vong_lap;

import java.util.*;

public class Contest {
    public static void main(String[] args) {
        Comparator<Long> cmp = new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return (int) (b - a);
            }
        };
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Map<Long, Long> mp = new LinkedHashMap<>();
        ArrayList<Long> a = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            long x = sc.nextLong();
            a.add(x);
        }
        Collections.sort(a);
        long res = Integer.MAX_VALUE;
        for (long i = 1; i < n; i++)
            res = Math.min(res, a.get((int) (i)) - a.get((int) (i) - 1));
        System.out.println(res);
        PriorityQueue<Long> qe = new PriorityQueue<>(cmp);
        qe.add(1L * 2);
        qe.add(1L * 1);
        qe.add(1L * 310);
        qe.add(1L * 4);
        while (qe.size() > 0) {
            Long top = qe.peek();
            qe.poll();
            System.out.print(top + " ");
        }
        System.out.println();
    }
}
