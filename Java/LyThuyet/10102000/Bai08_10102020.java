import java.util.Scanner;
public class Bai08_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    static float sum(int n) {
        float sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=1.0/i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.printf("S = 1 + 1/2 + ... + 1/%d = %f",n,sum(n));
    }
}
