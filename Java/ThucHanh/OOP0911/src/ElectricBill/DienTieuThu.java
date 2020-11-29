package ElectricBill;

public class DienTieuThu implements InterfaceDien {
    int csc;
    int csm;

    public int getCsc() {
        return csc;
    }

    public void setCsc(int csc) {
        this.csc = csc;
    }

    public int getCsm() {
        return csm;
    }

    public void setCsm(int csm) {
        this.csm = csm;
    }

    public static int soTieuThu(int csm, int csc) {
        return csm - csc;
    }

    public int tinhTienDM1(int sc) {
        return sc<DM1?sc*TienDM1:DM1*TienDM1;
    }

    public int tinhTienDM2(int sc) {
        return sc<=DM2?(sc<=DM1?0:(sc-DM1)*TienDM2):(DM2-DM1)*TienDM2;
    }

    public int tinhTienDM3(int sc) {
        return sc>DM2?(sc-DM2)*TienDM3:0;
    }

    public double tongTien(int sc) {
        return (tinhTienDM1(sc) + tinhTienDM2(sc) + tinhTienDM3(sc))*(1.0+VAT);
    }

    public static void main(String[] args) {
        DienTieuThu obj = new DienTieuThu();
        obj.setCsc(300);
        obj.setCsm(500);
        System.out.println(obj.tongTien(soTieuThu(obj.getCsm(),obj.getCsc())));
    }
}
