package file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("output.dat");
            ObjectInputStream input = new ObjectInputStream(in);

            while(true) {
                try {
                    SinhVien s = (SinhVien)input.readObject();
                    System.out.println(s);
                } catch (EOFException var4) {
                    in.close();
                    input.close();
                    break;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
