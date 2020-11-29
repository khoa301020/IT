
/**
 * Bai1
 */
import java.util.Scanner;
import java.util.Arrays;

public class Bai1 {
    public static Scanner scanner = new Scanner(System.in);

    public static int[] Check(int a[], int n) {
        int j = 0, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && a[i] % 5 == 0) {
                count++;
            }
        }
        int m[] = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && a[i] % 5 == 0) {
                m[j] = a[i];
                j++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so phan tu:");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Cac phan tu cua mang la:");
        System.out.println(Arrays.toString(a));
        System.out.printf("Cac so chia le chia het cho 5 la:");
        for (int i = 0; i < Check(a, n).length; i++) {
            System.out.println(Check(a, n)[i]);
        }
    }

}