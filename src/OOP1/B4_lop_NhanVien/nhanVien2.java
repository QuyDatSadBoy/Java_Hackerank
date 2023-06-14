package OOP1.B4_lop_NhanVien;

import java.util.Scanner;

public class nhanVien2 {
    private String ma, name, gt, ns, sdt, ns2;

    public nhanVien2(String ma, String name, String gt, String ns, String sdt, String ns2) {
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.sdt = sdt;
        this.ns2 = ns2;
    }

    public static String fullName(String s) {
        s = s.toLowerCase();
        String res = "";
        String[] arr = s.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            res = res + Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) {
                res += arr[i].charAt(j);
            }
            res += " ";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }

    public static String chuanHoa(String s) {
        StringBuilder ss = new StringBuilder(s);
        if (ss.charAt(2) != '/') ss.insert(0, "0");
        if (ss.charAt(5) != '/') ss.insert(3, "0");
        return ss.toString();
    }

    @Override
    public String toString() {
        return ("00001 " + fullName(ma) + " " + name + " " + chuanHoa(gt) + " " + ns + " " + sdt + " " + chuanHoa(ns2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanVien2 nv = new nhanVien2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}
