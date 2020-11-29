package Person;

public class Student extends Person {

    private String id;
    private float mark;
    private String email;

    public Student() {

    }

    public Student(String id, float mark, String email) {
        super();
        this.id = id;
        this.mark = mark;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(id != null && id.length()==8) {
            this.id = id;
            return true;
        } else {
            System.err.println("Moi ban nhap lai ma sinh vien (do dai = 8 ki tu): ");
            return false;
        }

    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("Moi ban nhap lai diem(diem >= 0 && diem <= 10): ");
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && !email.contains(" ") && email.contains("@")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Moi ban nhap lai email(email khong de trong, khong chua khoang trang va chua dau @): ");
            return false;
        }

    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        System.out.println("Moi ban nhap ma sinh vien: ");
        while(true) {
            String masv = sc.nextLine();
            boolean check = setId(masv);
            if (check) {
                break;
            }
        }

        System.out.println("Moi ban nhap diem trung binh: ");
        while(true) {
            float diemTB = Float.parseFloat(sc.nextLine());
            boolean check = setMark(diemTB);
            if(check) {
                break;
            }
        }

        System.out.println("Moi ban nhap email: ");
        while(true) {
            String email = sc.nextLine();
            boolean check = setEmail(email);
            if(check) {
                break;
            }
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ma sinh vien: "+id);
        System.out.println("Diem trung binh: "+mark);
        System.out.println("Email: "+email);
        System.out.println();
    }

    public boolean checkScholarship() {
        if(mark > 8.0) {
            return true;
        }
        return false;
    }
}