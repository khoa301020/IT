import java.util.Scanner;

public class Bai6_28092020 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("So dao nguoc cua " + a + " la " + Reverse(a));
    }

    public static int Reverse(int a) {
        int sum = 0;
        do {
            sum = sum * 10 + a % 10;
            a = a / 10;
        } while (a != 0);
        return sum;
    }
}
