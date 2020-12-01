/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package BUS;
import DTO.NhaSanXuatDTO;
import DAO.NhaSanXuatDAO;
import DTO.NhaSanXuatDTO;
import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class NhasanxuatBUS {
    private ArrayList<NhaSanXuatDTO> danhSachNhaSanXuat;
    private NhaSanXuatDAO nhaSanXuatDAO;
    
    
    public NhasanxuatBUS() {
        nhaSanXuatDAO = new NhaSanXuatDAO();
        danhSachNhaSanXuat = nhaSanXuatDAO.getDanhSachNhaSanXuat();
    }
    
    
    
      public ArrayList<NhaSanXuatDTO> getDanhSachNhaSanXuat() {
        return danhSachNhaSanXuat;
    }
    
    public void add(NhaSanXuatDTO nhaSanXuatMoi) {
        nhaSanXuatDAO.add(nhaSanXuatMoi);
        danhSachNhaSanXuat.add(nhaSanXuatMoi);
    }
    
    public void delete(String maNhaSanXuat) {
        nhaSanXuatDAO.deleteById(maNhaSanXuat);
    }
    
    public void update(NhaSanXuatDTO nhaSanXuat) {
        nhaSanXuatDAO.update(nhaSanXuat);
    }
}
