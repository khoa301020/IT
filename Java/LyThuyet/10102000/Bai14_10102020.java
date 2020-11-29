
import java.util.Scanner;

public class Bai14_10102020 {
    public static Scanner scanner = new Scanner(System.in);

    boolean kiemtranguyento(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        System.out.printf("Nhap vao so nguyen duong \n");
        int n = scanner.nextInt();
        Bai14_10102020 snt = new Bai14_10102020();
        if (snt.kiemtranguyento(n)) {
            System.out.printf("So : " + n + " la so nguyen to");
        } else {
            System.out.printf("So : " + n + " khong phai la so nguyen to");
        }
    }
}
