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
public class NhaSanXuatDTO {
    private String maNSX;
    private String tenNSX;
    private String diaChi;
    private String SDT;

    public NhaSanXuatDTO(String maNSX, String tenNSX, String diaChi, String SDT) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public NhaSanXuatDTO() {
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    public void display() {
        System.out.println(maNSX + "  " + tenNSX + "  " + diaChi + "  " + SDT);
    }
    
    
}
