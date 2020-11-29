import java.util.Scanner;
public class Bai12_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int Tong(int m) {
        int sum=0;
        while (m > 0) {
            sum += m % 10;
            m = m / 10;
        }
        return sum;
    }
    public static int Tich(int m) {
        int multi=1;
        while (m > 0) {
            multi *= m % 10;
            m = m / 10;
        }
        return multi;
    }
    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = scanner.nextInt();
        System.out.printf("Tong cac chu so cua %d la %d",m,Tong(m));
        System.out.printf("\nTich cac chu so cua %d la %d",m,Tich(m));
    }
}
