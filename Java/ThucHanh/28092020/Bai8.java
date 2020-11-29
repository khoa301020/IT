import java.util.Scanner;

public class Bai8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        System.out.printf("Chuoi \"%s\" co %d tu",str,count(str));
    }
    public static int count(String str) {
        int sum=0;
        str=str.trim();
        for (int i = 0; i < str.length(); i++) {
            sum++;
        }
        return sum;
    }
}
