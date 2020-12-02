/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ChitietkhuyenmaiDAO;
import DTO.ChitietkhuyenmaiDTO;
import java.util.List;

/**
 *
 * @author pc
 */
public class ChitietkhuyenmaiBUS {
    private  ChitietkhuyenmaiDAO chitietkmDAO;
    
    public ChitietkhuyenmaiBUS(){
        chitietkmDAO = new ChitietkhuyenmaiDAO();
    }
    
    public List<ChitietkhuyenmaiDTO> getAllCTKM(){
        return chitietkmDAO.getAllCTKM();
    }
    
    public ChitietkhuyenmaiDTO getTileKM(String maKM, String maSP) {
        return chitietkmDAO.getTileKM(maKM, maSP);
    }
    
    public String getMakmByMasp(String maSP) {
        return chitietkmDAO.getMakmByMasp(maSP);
    }
//    public ChitietkhuyenmaiDTO getMaKM(String maSP) {
//        return chitietkmDAO.getMaKM(maSP);
//    }
}
