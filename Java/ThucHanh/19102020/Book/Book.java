
package Book;
import java.util.Scanner;
public class Book {
    public static Scanner scanner = new Scanner(System.in);
    public String bookname, author;
    public int page, price;
    public void Constructor1() {
        System.out.println("Nhap ten sach, tac gia, so trang va gia tien");
        bookname = scanner.nextLine();
        author = scanner.nextLine();
        page = scanner.nextInt();
        price = scanner.nextInt();
        System.out.printf("%s, %s, %d, %d",bookname,author,page,price);
    }
    public void Constructor2(String bookname, String author, int page, int price) {
        System.out.printf("%s, %s, %d, %d",bookname,author,page,price);
    }
}

class BookTest {
    public static void main(String[] args) {
        Book dt1 = new Book();
        Book dt2 = new Book();
        dt1.Constructor1();
        dt2.Constructor2("\nHakoMari2", "Mikami Eiji", 300, 100000);
    }
}