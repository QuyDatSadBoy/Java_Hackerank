package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class text {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNext()) {
                int x = sc.nextInt();
                System.out.print(x + " ");
            }
            System.out.println();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
    }
}
