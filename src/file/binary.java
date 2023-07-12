//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class binary {
    public binary() {
    }

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("input.dat");
        BufferedInputStream input = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("output.dat", true);
        BufferedOutputStream output = new BufferedOutputStream(out);

        int c;
        String tam;
        char x;
        for(tam = ""; (c = input.read()) != -1; tam = tam + x) {
            x = (char)c;
        }

        System.out.println("Name = " + tam);
        output.write("\nCo len Tran Quy Dat".getBytes());
        input.close();
        output.close();
    }
}
