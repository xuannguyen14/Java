/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChitiethoadonDAO;
import DTO.ChitiethoadonDTO;
import java.util.List;

/**
 *
 * @author pc
 */
public class ChitiethoadonBUS {
    private  ChitiethoadonDAO chitiethoadonDAO;
    
    public ChitiethoadonBUS(){
        chitiethoadonDAO = new ChitiethoadonDAO();
    }
        
    public void addChitietHoadon(ChitiethoadonDTO chitietHD){
        chitiethoadonDAO.addChitietHoadon(chitietHD);
    }
    
    public List<ChitiethoadonDTO> getCTHDByMaHD(String maHD){
        return chitiethoadonDAO.getCTHDByMaHD(maHD);
    }
    
    public void deleteCTHD(String maHD){
        chitiethoadonDAO.deleteCTHD(maHD);
    }
}
