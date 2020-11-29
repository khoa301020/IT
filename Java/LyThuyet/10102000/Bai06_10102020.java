import java.util.Scanner;
public class Bai06_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int TinhTien(int a, int b) {
        if (b<18) {
            return (b-a)*45000;
        } else {
            return a<18?(18-a)*45000+(b-18)*60000:(b-a)*60000;
        }
    }
    public static void main(String[] args) {
        int a, b;
        do {
            System.out.println("Nhap a:");
            a = scanner.nextInt();
            System.out.println("Nhap b:");
            b = scanner.nextInt();
        } while (a>=b);
        System.out.printf("Tong tien la: "+TinhTien(a, b));
    }
}
