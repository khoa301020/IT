package Book;

import java.util.Scanner;

public class Book {
    public static Scanner scanner = new Scanner(System.in);
    private String tensach, tacgia;
    private int sotrang, giatien;

    public Book() {

    }

    public Book(String tensach, String tacgia, int sotrang, int giatien) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.sotrang = sotrang;
        this.giatien = giatien;
    }

    public void Set() {
        this.tensach = scanner.nextLine();
        this.tacgia = scanner.nextLine();
        this.sotrang = scanner.nextInt();
        this.giatien = scanner.nextInt();
    }

    public void Show() {
        System.out.printf("%s - %s - %d - %d\n", tensach, tacgia, sotrang, giatien);
    }
}

class BookTest {
    public static void main(String[] args) {
        Book obj1 = new Book();
        obj1.Set();
        obj1.Show();
        Book obj2 = new Book("c", "d", 3, 4);
        obj2.Show();
    }
}
