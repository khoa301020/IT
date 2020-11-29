import java.util.Scanner;

public class Bai2_28092020 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chieu dai: ");
        int a = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        int b = scanner.nextInt();
        System.out.println("Dien tich hinh chu nhat la: " + (a * b));
    }
}
