package Person;

import java.util.Scanner;

public class Person {

    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    final static Scanner sc = new Scanner(System.in);
    public Person() {

    }

    public Person(String name, String gender, String dateOfBirth, String address) {
        super();
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        System.out.println("Moi ban nhap ten: ");
        name = sc.nextLine();

        System.out.println("Moi ban nhap gioi tinh: ");
        gender = sc.nextLine();

        System.out.println("Moi ban nhap ngay sinh: ");
        dateOfBirth = sc.nextLine();

        System.out.println("Moi ban nhap dia chi: ");
        address = sc.nextLine();
    }

    public void showInfo() {
        System.out.println("------------------------------");
        System.out.println("Ten : "+name);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Ngay sinh: "+dateOfBirth);
        System.out.println("Dia chi: "+address);
    }
}

