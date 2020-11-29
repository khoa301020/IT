import java.util.Scanner;

public class Bai02_10102020 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + PTB1(a, b) + ".");
        }
    }

    public static double PTB1(int a, int b) {
        return (double) -b / a;
    }
}
