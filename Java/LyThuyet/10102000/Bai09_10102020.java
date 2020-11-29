import java.util.Scanner;
import java.lang.Math;
public class Bai09_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int GiaiThua(int n) {
        int GT=1;
        for (int i = 1; i <= n; i++) {
            GT=GT*i;
        }
        return GT;
    }
    public static float sum(int n) {
        float s=15;
        for (int i = 1; i <= n; i++) {
            System.out.println(GiaiThua(i));
            s = (float) (s + (Math.pow(-1, i) * (1.0 / GiaiThua(i))));
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.printf("S = 15 - 1 + 1/2 - 1/3! + ... + (-1)^%d*1/%d! = %f",n,n,sum(n));
    }
}
