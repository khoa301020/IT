import java.util.Scanner;
public class Bai13_10102020 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
