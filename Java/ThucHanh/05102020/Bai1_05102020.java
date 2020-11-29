import java.util.Scanner;
public class Bai1_05102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Tong cua %i va %i la %i",a,b,sum(a,b));
        System.out.printf("Tich cua %i va %i la %i",a,b,multi(a,b));
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int multi(int a, int b) {
        return a*b;
    }
}
