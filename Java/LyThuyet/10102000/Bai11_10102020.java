import java.util.Scanner;
public class Bai11_10102020 {
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
        if (n%2==0) {
            for (int i = 2; i <= n; i+=2) {
                s+=GiaiThua(i);
            }
            
        } else {
            for (int i = 1; i <= n; i+=2) {
                s+=GiaiThua(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        if (n%2==0) {
            System.out.printf("S = 2! + 4! + ... + %d! = %f",n,sum(n));
        } else {
            System.out.printf("S = 1! + 3! + ... + %d! = %f",n,sum(n));
        }
        
    }
}
