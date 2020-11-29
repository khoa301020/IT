
import java.util.Scanner;

public class Bai01_10102020 {
    public static Scanner scanner = new Scanner(System.in);

    public static int Max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Nhap a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Max la: " + Max(a, b, c));
    }
}
