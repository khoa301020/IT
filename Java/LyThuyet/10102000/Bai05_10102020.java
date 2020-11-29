import java.util.Scanner;
import java.util.Arrays;
public class Bai05_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int STG(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        return Rearrange(arr)[1];
    }

    public static int[] Rearrange(int[] arr) {
        int tg;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (arr[i] > arr[j]) {
                    // Hoan vi 2 so a[i] va a[j]
                    tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        System.out.println("Nhap b: ");
        b = scanner.nextInt();
        System.out.println("Nhap c: ");
        c = scanner.nextInt();
        System.out.printf("So trung gian la %d",STG(a, b, c));
    }
}
