package file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SinhVien implements Serializable {
    private String name;
    private String gpa;

    public SinhVien(String name, String gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public String getGpa() {
        return this.gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "SinhVien{name='" + this.name + '\'' + ", gpa='" + this.gpa + '\'' + '}';
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
