import java.util.Scanner;

public class Bai3_28092020 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap a, b, c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("So be nhat trong 3 so " + a + " , " + b + " , " + c + " la: " + Min(a, b, c));
    }

    public static int Min(int a, int b, int c) {
        int min;
        min = a;
        if (b < min) {
            min = b;
        } else if (c < min) {
            min = c;
        }
        return min;
    }
}
