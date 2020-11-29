package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> listStd = new ArrayList<Student>();

        int choose;
        boolean exit = false;
        int i;
        do {
            Menu();
            System.out.println("Moi ban nhap lua chon: ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose) {

                case 1:
                    System.out.println("1. Nhap vao n sinh vien");

                    System.out.println("Moi ban nhap so sinh vien can them: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for(i = 0; i <n; i++) {
                        Student st = new Student();
                        st.inputInfo();
                        listStd.add(st);
                    }
                    break;

                case 2:
                    System.out.println("2. Hien thi tat ca cac sinh vien ra man hinh");

                    for( i = 0; i < listStd.size(); i++) {
                        listStd.get(i).showInfo();
                    }
                    break;

                case 3:
                    System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat \n va sinh vien co diem trung binh thap nhat");

                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;

                    minMark = listStd.get(0).getMark();
                    maxMark = listStd.get(0).getMark();

                    for( i = 1; i < listStd.size(); i++) {
                        if(listStd.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = listStd.get(i).getMark();
                        }
                        if(listStd.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = listStd.get(i).getMark();
                        }
                    }

                    System.out.println("Sinh vien co diem cao nhat la: ");
                    listStd.get(maxIndex).showInfo();

                    System.out.println("Sinh vien co diem thap nhat la: ");
                    listStd.get(minIndex).showInfo();
                    break;

                case 4:
                    System.out.println("4. Tim kiem sinh vien theo ma sinh vien");

                    System.out.println("Moi ban nhap ma sinh vien can tim: ");
                    String id = sc.nextLine();
                    int dem = 0;

                    for(Student st : listStd) {
                        if (st.getId().equalsIgnoreCase(id)) {
                            st.showInfo();
                            dem++;
                        }
                    }
                    if(dem == 0) {
                        System.out.println("Khong tim thay sinh vien nao co id = "+id);
                    }
                    break;

                case 5:
                    System.out.println("5. Hiem thi tat ca cac sinh vien theo thu tu ten trong bang chu cai");

                    Collections.sort(listStd, new Comparator<Student>() {

                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if(cmp >= 0) {
                                return 1;
                            }
                            return -1;
                        }
                    });

                    for( i = 0; i < listStd.size(); i++) {
                        listStd.get(i).showInfo();
                    }
                    break;

                case 6:
                    System.out.println("6. Hien thi tat ca cac sinh vien duoc hoc bong \n va sap xep theo thu tu diem cao xuong thap ");

                    listStd.sort(new Comparator<Student>() {

                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getMark() >= o2.getMark() ? -1 : 1;
                        }
                    });

                    for(i = 0; i <listStd.size(); i++) {
                        if(listStd.get(i).checkScholarship()) {
                            listStd.get(i).showInfo();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Bye!");
                    exit = true;
                    break;

                default:
                    System.err.println("Nhap sai! Moi ban nhap lai lua chon");
                    break;
            }
        } while(choose != 7);
    }

    static void Menu() {
        System.out.println("=========================================================================");
        System.out.println("1. Nhap vao n sinh vien");
        System.out.println("2. Hien thi thong tin tat ca sinh vien ra man hinh");
        System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat \n va sinh vien co diem trung binh thap nhat");
        System.out.println("4. Tim kiem sinh vien theo ma sinh vien");
        System.out.println("5. Hien thi tat ca cac sinh vien theo thu tu ten trong bang chu cai");
        System.out.println("6. Hien thi tat ca cac sinh vien duoc hoc bong \n va sap xep theo thu tu diem cao xuong thap ");
        System.out.println("7. Thoat");
        System.out.println("=========================================================================");
    }
}