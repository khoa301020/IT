package Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> listStd = new ArrayList<Student>();

        int choose;
        boolean exit = false;
        int i;

        System.out.println("=== Nhap vao n sinh vien ===");

        System.out.println("=== Moi ban nhap so sinh vien can them: ===");
        int n = Integer.parseInt(sc.nextLine());
        for(i = 0; i <n; i++) {
            Student st = new Student();
            st.inputInfo();
            listStd.add(st);
        }

        System.out.println("\n=== Cac sinh vien co hoc bong la ===");

        listStd.sort(new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                return o1.getMark() >= o2.getMark() ? -1 : 1;
            }
        });

        for (i = 0; i < listStd.size(); i++) {
            if (listStd.get(i).checkScholarship()) {
                listStd.get(i).showInfo();
            }
        }

    }
}