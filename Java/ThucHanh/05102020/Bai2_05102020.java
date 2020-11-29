import java.util.Scanner;

public class Bai2_05102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("Chu vi la: %i",chuvi(a,b));
        System.out.printf("Dien tich la: %i",dientich(a, b));
    }
    public static int chuvi(int a, int b){
        return (a+b)*2;
    }
    public static int dientich(int a, int b){
        return a*b;
    }
}
