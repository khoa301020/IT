package Bai1_Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        ArrayList<NhanVien> ListStd = new ArrayList<NhanVien>();

        int i;
        System.out.println("Moi ban nhap so nhan vien can them: ");
        int n = Integer.parseInt(sc.nextLine());
        for (i = 0; i < n; i++) {
            NhanVien st = new NhanVien();
            st.inputInfo();
            ListStd.add(st);
            printArrayListToFile(ListStd.get(i));
        }

        for (i = 0; i < ListStd.size(); i++) {
            ListStd.get(i).showInfo();
        }
    }


public static void printArrayListToFile(ArrayList<NhanVien> arrayList) throws IOException {
    PrintWriter writer = new PrintWriter("D:\\IT\\Java\\ThucHanh\\java14122020\\src\\Bai1_Employee\\output.txt");
    for (NhanVien line : arrayList) {
        writer.println(line);
    }
        writer.close();
}}


