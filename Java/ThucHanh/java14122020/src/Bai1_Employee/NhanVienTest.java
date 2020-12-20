package Bai1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter("output.txt");

        ArrayList<NhanVien> ListStd = new ArrayList<NhanVien>();

        int i;
        System.out.println("Moi ban nhap so nhan vien can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (i = 0; i < n; i++) {
            NhanVien st = new NhanVien();
            st.inputInfo();
            ListStd.add(st);
        }

        for (i = 0; i < ListStd.size(); i++) {
            ListStd.get(i).showInfo();
        }


    }
}
