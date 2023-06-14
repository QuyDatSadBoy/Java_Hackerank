package OOP2.B4_Nha;

import java.util.*;
import java.math.*;

public class cmp implements Comparator<Nha> {

    @Override
    public int compare(Nha a, Nha b) {
        if(a.diem!=b.diem) return (int)(b.diem-a.diem);
        if(a.hs!=b.hs) return (int)(b.hs-a.hs);
        return a.ma.compareTo(b.ma);
    }
}
