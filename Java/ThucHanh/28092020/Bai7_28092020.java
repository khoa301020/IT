import java.util.Scanner;

public class Bai7_28092020 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Nhap so x: ");
        int x = scanner.nextInt();
        System.out.printf("Phan tu %d xuat hien %d lan", x, check(InputArray(), x));
    }

    public static int[] InputArray() {
        System.out.printf("Nhap so phan tu n: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]=", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int check(int arr[], int x) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                sum++;
            }
        }
        return sum;
    }
}
