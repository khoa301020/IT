import java.util.Scanner;
public class Bai20_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        if (fibonacci(n)==0) {
            System.out.println("Khong ton tai");
        } else {
            System.out.printf("Co ton tai, o vi tri thu %d",fibonacci(n));
        }
    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        int i=2;
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            while (fn<n) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                i++;
            }
        }
        if (fn==n) {
            return i;
        } else {
            return 0;
        }
    }
}