/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class NhacungcapBUS {
    private ArrayList<NhaCungCapDTO> danhSachNhaCungCap;
    private NhaCungCapDAO nhaCungCapDAO;
    
    
    public NhacungcapBUS() {
        nhaCungCapDAO = new NhaCungCapDAO();
        danhSachNhaCungCap = nhaCungCapDAO.getDanhSachNhaCungCap();
    }
    
    
    
      public ArrayList<NhaCungCapDTO> getDanhSachNhaCungCap() {
        return danhSachNhaCungCap;
    }
    
    public void add(NhaCungCapDTO nhaCungCapMoi) {
        nhaCungCapDAO.add(nhaCungCapMoi);
        danhSachNhaCungCap.add(nhaCungCapMoi);
    }
    
    public void delete(String maNhaCungCap) {
        nhaCungCapDAO.deleteById(maNhaCungCap);
    }
    
    public void update(NhaCungCapDTO nhaCungCap) {
        nhaCungCapDAO.update(nhaCungCap);
    }

}
