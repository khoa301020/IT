package Rectangle;
import java.util.Scanner;
public class Rectangle1 {
    public static Scanner scanner = new Scanner(System.in);
    public static int Area(int a, int b) {
        return a*b;
    }
    public static int Perimeter(int a, int b) {
        return (a+b)*2;
    }
    public static void main(String[] args) {
        System.out.println("Nhap chieu dai a, chieu rong b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Dien tich hinh chu nhat la: "+Area(a,b));
        System.out.println("Chu vi hinh chu nhat la: "+Perimeter(a,b));
    }
}