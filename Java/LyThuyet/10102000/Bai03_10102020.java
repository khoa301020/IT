import java.util.Scanner; 
public class Bai03_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap c: ");
        float c = scanner.nextFloat();
        PTB2(a, b, c);
    }

    public static void PTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                System.out.println("phuong trinh co 1 nghiem" + "x=" + (-c / b));
            }
            return;
        }
        float delta = b * b - a * c * 4;
        float x1, x2;
        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("phuong trinh co nghiem kep"+"x1=x2="+(-b/2*a));
        }else if(delta>0){
            x1 =(float) ((-b+Math.sqrt(delta))/2*a);
            x2=(float) ((-b-Math.sqrt(delta))/2*a);
            System.out.println("phuong trinh co 2 nghiem phan biet:" + "X1=" +x1+ "va x2=" +x2);
        }
    }
}
