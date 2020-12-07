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
public class KhachHangDTO {
    
    private String maKhachHang;
    private String tenKhachHang;
    private String diaChi;
    private String email;
    private String SDT;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String maKhachHang, String tenKhachHang, String diaChi, String email, String SDT) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.email = email;
        this.SDT = SDT;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    public void display() {
        System.out.println(maKhachHang + " " + tenKhachHang + " " + diaChi + " " + email + " " + SDT);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof KhachHangDTO)) return false;
        KhachHangDTO o = (KhachHangDTO) obj;
        if (!o.getMaKhachHang().equals(maKhachHang)) return false;
        if (!o.getTenKhachHang().equals(tenKhachHang)) return false;
        if (!o.getDiaChi().equals(diaChi)) return false;
        if (!o.getEmail().equals(email)) return false;
        if (!o.getSDT().equals(SDT)) return false;
        return true;
}
    

    
    
    
    
}
