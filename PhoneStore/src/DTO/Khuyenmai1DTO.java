/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author pc
 */
public class Khuyenmai1DTO {
    private String maKM, tenKM, ngayBD, ngayKT;
    
    public Khuyenmai1DTO() {
        this.maKM = "";
        this.tenKM = "";
        this.ngayBD = "";
        this.ngayKT = "";
    }

    public Khuyenmai1DTO(String maKM, String tenKM, String ngayBD, String ngayKT) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaKM() {
        return maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }

    public boolean soSanhNgay(String ngayHT){
        if(ngayHT.compareTo(ngayBD) >= 0 && ngayHT.compareTo(ngayKT) <= 0){
            return true;
        }
        return false;
    }
           
}
