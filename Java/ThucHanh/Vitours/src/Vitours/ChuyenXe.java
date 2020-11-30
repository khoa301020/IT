package Vitours;

import java.util.Scanner;

public class ChuyenXe {

    private String maChuyenXe;
    private String tenTaiXe;
    private String soXe;
    private int doanhThu;

    final static Scanner sc = new Scanner(System.in);
    public ChuyenXe() {

    }

    public ChuyenXe(String maChuyenXe, String tenTaiXe, String soXe, int doanhThu) {
        super();
        this.maChuyenXe = maChuyenXe;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void inputInfo() {
        System.out.println("------------------------------");
        System.out.println("Moi ban nhap ma chuyen xe: ");
        maChuyenXe = sc.nextLine();

        System.out.println("Moi ban nhap ten tai xe: ");
        tenTaiXe = sc.nextLine();

        System.out.println("Moi ban nhap so xe: ");
        soXe = sc.nextLine();

        System.out.println("Moi ban nhap doanh thu: ");
        doanhThu = Integer.parseInt(sc.nextLine());
    }

    public void showInfo() {
        System.out.println("------------------------------");
        System.out.println("Ma chuyen xe : "+ maChuyenXe);
        System.out.println("Ten tai xe: "+ tenTaiXe);
        System.out.println("So xe: "+ soXe);
        System.out.println("Doanh thu: "+ doanhThu);
    }
}

