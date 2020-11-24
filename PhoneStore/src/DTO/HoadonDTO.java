
package DTO;

/**
 *
 * @author pc
 */
public class HoadonDTO {
    private String maHD, ngayxuat, maKH, maNV;
    private double tongtien, tongKM, tientra;

    public HoadonDTO() {
        this.maHD = "";
        this.ngayxuat = "";
        this.maKH = "";
        this.maNV = "";
        this.tongtien = 0;
        this.tongKM = 0;
        this.tientra = 0;
    }

    public HoadonDTO(String maHD, String ngayxuat, String maKH, String maNV, double tongtien, double tongKM, double tientra) {
        this.maHD = maHD;
        this.ngayxuat = ngayxuat;
        this.maKH = maKH;
        this.maNV = maNV;
        this.tongtien = tongtien;
        this.tongKM = tongKM;
        this.tientra = tientra;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getNgayxuat() {
        return ngayxuat;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public double getTongtien() {
        return tongtien;
    }

    public double getTongKM() {
        return tongKM;
    }

    public double getTientra() {
        return tientra;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public void setTongKM(double tongKM) {
        this.tongKM = tongKM;
    }

    public void setTientra(double tientra) {
        this.tientra = tientra;
    }

}
