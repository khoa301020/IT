import java.util.Scanner;
public class Bai04_10102020 {
    public static Scanner scanner = new Scanner(System.in); 
    
    public static void HePTB1(double a1, double b1, double c1, double a2, double b2, double c2) {
        double D = a1*b2-a2*b1;
        double Dx = c1*b2 - b1*c2;
        double Dy = a1*c2- a2*c1;
        double x=Dx/D;
        double y=Dy/D;
        System.out.println("\n"+a1+"x + "+b1+"y = "+c1);
        System.out.println("\n"+a2+"x + "+b2+"y = "+c2);
        System.out.printf("x = "+x);
        System.out.printf("\ny = "+y);
    }
    public static void main(String[] args) {
        double a1, b1, c1, a2, b2, c2;
        System.out.println("Nhap hpt thu nhat: ");
        a1 = scanner.nextDouble();
        b1 = scanner.nextDouble();
        c1 = scanner.nextDouble();
        System.out.println("Nhap hpt thu nhat: ");
        a2 = scanner.nextDouble();
        b2 = scanner.nextDouble();
        c2 = scanner.nextDouble();
        HePTB1(a1, b1, c1, a2, b2, c2);
    }
}
