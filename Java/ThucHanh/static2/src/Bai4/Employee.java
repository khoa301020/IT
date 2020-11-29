package Bai4;

public class Employee {
    public static String eName = "Nguyen Tuan Anh";
    public static int eID;
    public static int age;
    public static String companyName = "ADB";

    static {
        eID = 1556;
        System.out.println(eID);
    }

    static {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}
