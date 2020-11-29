public class Bai5_28092020 {
    public static void main(String[] args) {
        int sum = EvenCount();
        System.out.println("So cac so chan tu 1 den 100 la: " + sum);
    }

    public static int EvenCount() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}
