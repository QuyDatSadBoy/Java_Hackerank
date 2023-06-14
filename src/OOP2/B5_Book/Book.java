package OOP2.B5_Book;

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
        String res = "Author Information :\n";
        res = res + name + '\n' + email + '\n' + gender;
        return res;
    }
}

public class Book {
    public String name;
    Author author;
    double price;
    int soLuong;

    public Book(String name, double price, int soLuong, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.soLuong = soLuong;
    }

    public String toString() {
        String res = "Book Details :\n" + name + '\n' + String.format("%.0f", price) + '\n' + soLuong + '\n' + author.toString() + "\n--------------------";
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Book[] a = new Book[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Book(sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()), new Author(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Arrays.sort(a, new Comparator<Book>() {
            @Override
            public int compare(Book a, Book b) {
                if (a.price != b.price) {
                    if (a.price > b.price) return -1;
                    else return 1;
                } else {
                    return a.name.compareTo(b.name);
                }
            }
        });
        for (int i = 0; i < n; i++) System.out.println(a[i]);
    }
}
