import java.util.Scanner;
public class Bai16_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean Check(int num) {
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Nhap so M:");
        num=scanner.nextInt();
        if (Check(num)==true)
            System.out.println(num + " la so doi xung.");
        else
            System.out.println(num + " khong phai so doi xung.");
    }
}