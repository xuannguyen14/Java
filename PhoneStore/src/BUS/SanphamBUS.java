
package BUS;

import DAO.SanPhamDAO;
import DTO.SanPhamDTO;
import java.sql.SQLException;
import java.util.List;

public class SanphamBUS {
    private SanPhamDAO sanphamDAO;

    public SanphamBUS() {
        sanphamDAO = new SanPhamDAO();
    }
    
    public SanPhamDTO getSanphamByMaSP(String maSP){
        return sanphamDAO.getSanphamByMaSP(maSP);
    }
    
    public List<SanPhamDTO> getAllSanpham(){
        return sanphamDAO.getAllSanpham();
    }
    
    public List<String> getMaSanpham() {
        return sanphamDAO.getMaSanpham();
    }
}
