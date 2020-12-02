/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.LoaiSanPhamDTO;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ADmin
 */
public class Test {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("ml001");
        vector.add("iPhone");
        String s = vector.get(1).toString();
        System.out.println(s);
//        LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();
//        ArrayList<LoaiSanPhamDTO> danhSachLoaiSanPham = loaiSanPhamDAO.getDataFromDatabase();
//        
//        for (LoaiSanPhamDTO loaiSanPhamDTO : danhSachLoaiSanPham) {
//            loaiSanPhamDTO.display();
//        }
    }
}
