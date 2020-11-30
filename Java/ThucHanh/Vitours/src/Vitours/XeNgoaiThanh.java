package Vitours;

public class XeNgoaiThanh extends ChuyenXe {

    private String noiDen;
    private int soNgay;

    public XeNgoaiThanh() {

    }

    public XeNgoaiThanh(String noiDen, int soNgay) {
        super();
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setnoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public float getSoNgay() {
        return soNgay;
    }

    public boolean setSoNgay(int soNgay) {
        if(soNgay >= 0) {
            this.soNgay = soNgay;
            return true;
        } else {
            System.err.println("Moi ban nhap lai so ngay (soNgay>=0): ");
            return false;
        }

    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        System.out.println("Moi ban nhap noi den: ");
        noiDen = sc.nextLine();

        System.out.println("Moi ban nhap so ngay: ");
        while(true) {
            int soNgay = Integer.parseInt(sc.nextLine());
            boolean check = setSoNgay(soNgay);
            if(check) {
                break;
            }
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Noi den: "+ noiDen);
        System.out.println("So ngay: "+ soNgay);
        System.out.println();
    }
}