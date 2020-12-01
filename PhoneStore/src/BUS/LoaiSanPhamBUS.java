/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.LoaiSanPhamDAO;
import DTO.LoaiSanPhamDTO;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class LoaiSanPhamBUS {
    
    private ArrayList<LoaiSanPhamDTO> danhSachLoaiSanPham;
    private LoaiSanPhamDAO loaiSanPhamDAO;
    
    public LoaiSanPhamBUS() {
        loaiSanPhamDAO = new LoaiSanPhamDAO();
        danhSachLoaiSanPham = loaiSanPhamDAO.getDataFromDatabase();
    }
    
    public ArrayList<LoaiSanPhamDTO> getDanhSachLoaiSanPham() {
        return danhSachLoaiSanPham;
    }
    
    public void add(LoaiSanPhamDTO loaiSanPhamMoi) {
        loaiSanPhamDAO.add(loaiSanPhamMoi);
        danhSachLoaiSanPham.add(loaiSanPhamMoi);
    }
    
    public String getLastId() {
        int size = danhSachLoaiSanPham.size();
        return danhSachLoaiSanPham.get(size - 1).getMaLoai();
    }
    
    public String getNextId() {
        String lastId = getLastId();
        int count = Integer.parseInt(lastId.substring(4, 6));
        ++count;
        String end = count + "";
        if (count < 10) {
            end = "0" + count;
        }
        return "loai" + end;
    }
    
}
