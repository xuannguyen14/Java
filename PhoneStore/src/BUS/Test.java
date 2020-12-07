/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import DTO.LoaiSanPhamDTO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ADmin
 */
public class Test {
    
    public static void main(String[] args) {
        KhachHangBUS khachHangBUS = new KhachHangBUS();
        khachHangBUS.showKetQuaTimKiem(khachHangBUS.getDanhSachKhachHangByDiaChi("Đà Nẵng"));
//        
//        khachHangBUS.showKetQuaTimKiem(khachHangBUS.getKhachHangByMaKhachHang("KH004"));
        
        
//        Vector khachHangCu = new Vector();
//        khachHangCu.add("KH002");
//        khachHangCu.add("Nguyễn Thị Huệ");
//        khachHangCu.add("TP.HCM");
//        khachHangCu.add("kh002@gmail.com");
//        khachHangCu.add("0213456789");
//        
//        Vector KhachHangMoi = new Vector();
//        KhachHangMoi.add("KH002");
//        KhachHangMoi.add("test");
//        KhachHangMoi.add("test");
//        KhachHangMoi.add("test");
//        KhachHangMoi.add("test");
//        
//        khachHangBUS.suaKhachHang(khachHangCu, KhachHangMoi);
//        khachHangBUS.showDanhSachKhachHang();

    }
    
}
