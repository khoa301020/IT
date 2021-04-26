import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomNumber number;
        CustomString str;
        int a,b;
        while (true) {
            try {
                System.out.print("Nhập số: ");
                number = new CustomNumber(input.nextInt());
                input.nextLine();
                break;
            }
            catch (Exception e) {
            }
        }
        if (number.isPrime()) {
            System.out.println("Là số nguyên tố");
        }
        else {
            System.out.println("Không phải là số nguyên tố");
        }
        if (number.isSquared()) {
            System.out.println("Là số chính phương");
        }
        else {
            System.out.println("Không phải là số chính phương");
        }
        if (number.isPerfect()) {
            System.out.println("Là số hoàn hảo");
        }
        else {
            System.out.println("Không phải là số hoàn hảo");
        }
        if (number.isArmstrong()) {
            System.out.println("Là số Armstrong");
        }
        else {
            System.out.println("Không phải là số Armstrong");
        }
        System.out.println("Tổng các chữ số: "+number.sumDigits());
        System.out.println("Tích các chữ số: "+number.multipleDigits());
        System.out.println("Tích UCLN, BCNN");
        while (true) {
            try {
                System.out.print("Nhập số thứ nhất: ");
                a = input.nextInt();
                input.nextLine();
                break;
            }
            catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.print("Nhập số thứ hai: ");
                b = input.nextInt();
                input.nextLine();
                break;
            }
            catch (Exception e) {
            }
        }
        System.out.println("UCLN: "+CustomNumber.gcd(a,b));
        System.out.println("BCNN: "+CustomNumber.lcm(a,b));
        while (true) {
            try {
                System.out.print("Nhập chuỗi: ");
                str = new CustomString(input.nextLine());
                break;
            }
            catch (Exception e) {
            }
        }

        System.out.println("Chuỗi đảo ngược: "+str.reverse());
        System.out.println("In hoa chuỗi: "+ str.toUpperCase());
        System.out.println("In thường chuỗi: "+str.toLowerCase());
        System.out.println("Đảo ngược in hoa in thường: "+str.toReverseCase());
        System.out.println("Đếm số từ: "+str.countWords());
        System.out.println("Các từ trong chuỗi:");
        ArrayList words = str.words();
        for (int i = 0; i< words.size(); i++) {
            System.out.println(words.get(i));
        }
        System.out.println("Tần số xuất hiện các kí tự: "+str.letterFrequency());
    }
}