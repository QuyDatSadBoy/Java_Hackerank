package OOP2.B9;

import java.util.*;
import java.math.*;

class Author {
    public String name, email, gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Name : " + name + "\nEmail : " + email + "\nGender : " + gender;
    }
}

class Book {
    public String name;
    public long gia, sl;
    public Author[] a;

    public Book(String name, long gia, long sl, Author[] a) {
        this.name = name;
        this.gia = gia;
        this.sl = sl;
        this.a = a;
    }

    public String toString() {
        String res = "-----------------------\nBook information :\nName : " + this.name + "\nPrice : " + gia + "\nQuantity : " + sl + "\nAuthor information :\n";
        for (int i = 0; i < this.a.length; i++) {
            res += "#" + (i + 1) + '\n' + a[i].toString();
            if (i != this.a.length - 1) res += '\n';
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        Book[] b = new Book[n];
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Author[] a = new Author[k];
            for (int j = 0; j < k; j++) {
                a[j] = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            b[i] = new Book(s1, Long.parseLong(s2), Long.parseLong(s3), a);
            String s4 = sc.nextLine();
        }
        Arrays.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book a, Book b) {
                return a.name.compareTo(b.name);
            }
        });
        for (int i = 0; i < n; i++) System.out.println(b[i]);
    }
}
