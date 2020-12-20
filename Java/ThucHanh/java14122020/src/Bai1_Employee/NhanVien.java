package Bai1;

import java.io.*;
import java.util.*;
import java.text.*;

public class NhanVien {
    final static Scanner sc = new Scanner(System.in);

    String MaNV;
    String TenNV;
    int Age;
    int Salary;

    public NhanVien(String maNV, String tenNV, int age, int salary) {
        this.MaNV = maNV;
        this.TenNV = tenNV;
        this.Age = age;
        this.Salary = salary;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public NhanVien() {
    }

    public void inputInfo() {
        System.out.println("------------------------------");

        System.out.println("Moi ban nhap ma NV: ");
        MaNV = sc.nextLine();

        System.out.println("Moi ban nhap ten NV: ");
        TenNV = sc.nextLine();

        System.out.println("Moi ban nhap tuoi: ");
        Age = Integer.parseInt(sc.nextLine());

        System.out.println("Moi ban nhap luong: ");
        Salary = Integer.parseInt(sc.nextLine());
    }

    public void showInfo() {
        System.out.println("------------------------------");
        System.out.println("Ma NV : "+MaNV);
        System.out.println("Ten NV: "+TenNV);
        System.out.println("Tuoi: "+Age);
        System.out.println("Luong: "+Salary);
    }
}
