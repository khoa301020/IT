package Vitours;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChuyenXe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<XeNgoaiThanh> listStd = new ArrayList<XeNgoaiThanh>();

        int i;
        System.out.println("1. Nhap vao n xe ngoai thanh");

        System.out.println("Moi ban nhap so xe ngoai thanh can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (i = 0; i < n; i++) {
            XeNgoaiThanh st = new XeNgoaiThanh();
            st.inputInfo();
            listStd.add(st);
        }

        System.out.println("2. Hien thi tat ca cac xe ngoai thanh");

        for (i = 0; i < listStd.size(); i++) {
            listStd.get(i).showInfo();
        }

        System.out.println("3. Hien thi xe co so ngay chay nhieu nhat");
        int maxIndex = 0;
        float maxSoNgay;

        maxSoNgay = listStd.get(0).getSoNgay();

        for (i = 1; i < listStd.size(); i++) {
            if (listStd.get(i).getSoNgay() > maxSoNgay) {
                maxIndex = i;
                maxSoNgay = listStd.get(i).getSoNgay();
            }
        }

        System.out.println("Xe co so ngay chay nhieu nhat la: ");
        listStd.get(maxIndex).showInfo();
    }
}