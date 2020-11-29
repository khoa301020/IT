import java.util.Scanner;
import java.lang.Math;
class Bai15_10102020 {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhap P:");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();
        if (checkPerfectSquare(num))
            System.out.println(num+ " la so chinh phuong");
        else
            System.out.println(num+ " khong phai so chinh phuong");
    }
}