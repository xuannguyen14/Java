
package DTO;

import DTO.ChitietkhuyenmaiDTO;
/**
 *
 * @author xuannguyen
 */
public class ChitiethoadonDTO {
    private String masp, mahd;
    private int soluongmua;
    private float dongia, thanhtien, tienkm;

    public ChitiethoadonDTO() {
        this.masp = "";
        this.mahd = "";
        this.soluongmua = 0;
        this.dongia = 0;
        this.thanhtien = 0;
        this.tienkm = 0;
    }

    public ChitiethoadonDTO(String masp, String mahd, int soluong, float dongia, float thanhtien, float tienkm) {
        this.masp = masp;
        this.mahd = mahd;
        this.soluongmua = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.tienkm = tienkm;
    }

    public String getMasp() {
        return masp;
    }

    public String getMahd() {
        return mahd;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public float getDongia() {
        return dongia;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public float getTienkm() {
        return tienkm;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public void setTienkm(float tienkm) {
        this.tienkm = tienkm;
    }
    
    public float thanhTien(){
        return dongia * soluongmua;
    }
}
