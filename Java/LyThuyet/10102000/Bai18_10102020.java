import java.util.Scanner;
public class Bai18_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int b = scanner.nextInt();
        for(int i = 1;i<b;i++)
        {
            int tong=0;
            for(int j=1; j<i;j++)
            {
            if(i%j==0) tong+=j;
            }
            if(i==tong)
            {
            System.out.println(i);
            }
        }  
    }
}