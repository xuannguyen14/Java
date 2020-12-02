/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhuyenmaiDAO;
import DTO.Khuyenmai1DTO;
import java.util.List;

/**
 *
 * @author pc
 */
public class Khuyenmai1BUS {
        private  KhuyenmaiDAO khuyenmaiDAO;
    
    public Khuyenmai1BUS(){
        khuyenmaiDAO = new KhuyenmaiDAO();
    }
    
    public List<Khuyenmai1DTO> getAllKhuyenmai(){
        return khuyenmaiDAO.getAllKhuyenmai();
    }
    
    public Khuyenmai1DTO getKhuyenmaiByMaKM(String maKM) {
        return khuyenmaiDAO.getKhuyenmaiByMaKM(maKM);
    }
}
