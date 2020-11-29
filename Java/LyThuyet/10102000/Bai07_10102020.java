import java.util.Scanner;
public class Bai07_10102020 {
    public static Scanner scanner = new Scanner(System.in);
    public static int Day(int Year, int Month) {
        int Day=0;
        switch (Month) {
            case 1:
                Day = 31;
                break;
            case 2:
                if (Year%4==0) {
                    Day = 29;
                    break;
                } else {
                    Day = 28;
                    break;
                }
            case 3:
                Day = 31;
                break;
            case 4:
                Day = 30;
                break;
            case 5:
                Day = 31;
                break;
            case 6:
                Day = 30;
                break;
            case 7:
                Day = 31;
                break;
            case 8:
                Day = 31;
                break;
            case 9:
                Day = 30;
                break;
            case 10:
                Day = 31;
                break;
            case 11:
                Day = 30;
                break;
            case 12:
                Day = 31;
                break;
        }
        return Day;
    }
    public static void main(String[] args) {
        int Year, Month;
        do {
            System.out.println("Nhap nam:");
            Year = scanner.nextInt();
            System.out.println("Nhap thang:");
            Month = scanner.nextInt();
        } while (Month<1 || Month>12 || Year<0);
        System.out.printf("Thang %d nam %d co %d ngay",Month,Year,Day(Year, Month));
    }
}
