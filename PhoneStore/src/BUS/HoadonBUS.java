
package BUS;

import DAO.HoadonDAO;
import DTO.HoadonDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author XuanNguyen
 */
public class HoadonBUS {
    
    private  HoadonDAO hoadonDAO;
    
    public HoadonBUS(){
        hoadonDAO = new HoadonDAO();
    }
    
    public List<HoadonDTO> getAllHoadon(){
        return hoadonDAO.getAllHoaDon();
    }
    
    public void insertHoadon(HoadonDTO hoadon){
        hoadonDAO.insertHoadon(hoadon);
    }
    public void deleteHoadon(String maHD){
        hoadonDAO.deleteHoadon(maHD);
    }
 
    public HoadonDTO getHoadonByMaHoadon(String maHD){
        return hoadonDAO.getHoadonByMaHoadon(maHD);
    }
    
    public List<HoadonDTO> getHoadonByMaKH(String maKH){
        return hoadonDAO.getHoadonByMaKH(maKH);
    }
    
    public List<HoadonDTO> getHoadonByDate(String tuNgay, String denNgay){
        return hoadonDAO.getHoadonByDate(tuNgay, denNgay);
    }
}

