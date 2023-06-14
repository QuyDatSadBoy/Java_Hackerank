package OOP1.B17_WordSet;

import java.util.TreeSet;
import java.util.*;


public class WordSet {
    private TreeSet<String> se = new TreeSet<>();

    public WordSet(String s) {
        String[] arr = s.split("\\s+");
        for (String x : arr) se.add(x);
    }

    public WordSet() {
    }

    public WordSet union(WordSet b) {
        WordSet res = new WordSet();
        for (String x : this.se) res.se.add(x);
        for (String x : b.se) res.se.add(x);
        return res;
    }

    public WordSet intersection(WordSet b) {
        WordSet res = new WordSet();
        for (String x : this.se) {
            if (b.se.contains(x) == true) res.se.add(x);
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (String x : this.se) res += x + " ";
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordSet s1 = new WordSet(sc.nextLine());
        WordSet s2 = new WordSet(sc.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));

    }

}

