import java.util.Scanner;
public class Bai10_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int GiaiThua(int n) {
        int GT=1;
        for (int i = 1; i <= n; i++) {
            GT=GT*i;
        }
        return GT;
    }
    public static float sum(int n) {
        float s=0;
        for (int i = 1; i <= n; i++) {
            s+=1.0/GiaiThua((2*i)-1);
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.printf("S = 1 + 1/3! + 1/5! + ... + 1/(2*%d-1)! = %f",n,sum(n));
    }
}
