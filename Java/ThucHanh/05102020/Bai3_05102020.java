/**
 * Bai3_05102020
 */
import java.util.Scanner;
public class Bai3_05102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        if (EvenOdd(n)==0) {
            System.out.println("Nah");
        } else {
            System.out.println("Yeah");
        }
    }
    public static int EvenOdd(int n) {
        if (n%2==0) {
            return 1;
        } else {
            return 0;
        }
    }
}