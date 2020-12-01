/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiSanPhamDTO;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;

/**
 *
 * @author ADmin
 */
public class Test {
    public static void main(String[] args) {
        LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();
        ArrayList<LoaiSanPhamDTO> danhSachLoaiSanPham = loaiSanPhamDAO.getDataFromDatabase();
        
        for (LoaiSanPhamDTO loaiSanPhamDTO : danhSachLoaiSanPham) {
            loaiSanPhamDTO.display();
        }
    }
}
