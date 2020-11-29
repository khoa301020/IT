import java.util.Scanner;
public class Bai4_28092020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("UCLN va BCNN cua "+a+" va "+b+" la: "+UCLN(a, b)+ " va "+BCNN(a, b));
    }
    public static int UCLN(int a, int b) {  
        if (a == 0 || b == 0) {
            return a+b;
        }
        while (a!=b){
            if (a>b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    } 
    public static int BCNN(int a, int b) {
        return (a*b)/UCLN(a, b);
    }
}
