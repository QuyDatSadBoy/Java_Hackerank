package OOP1.B20_time;

import java.util.*;

public class sort_time implements Comparator<time> {
    @Override
    public int compare(time t1, time t2) {
        if (t1.getH() != t2.getH()) return (int) (t1.getH() - t2.getH());
        if (t1.getP() != t2.getP()) return (int) (t1.getP() - t2.getP());
        return (int) (t1.getS() - t2.getS());
    }
}
