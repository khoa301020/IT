package ElectricBill;

public interface InterfaceDien {
    int DM1 = 60;
    int DM2 = 100;
    int TienDM1 = 600;
    int TienDM2 = 1000;
    int TienDM3 = 2000;
    double VAT = 0.1;
    int tinhTienDM1(int sc);
    int tinhTienDM2(int sc);
    int tinhTienDM3(int sc);
    double tongTien(int sc);
}
