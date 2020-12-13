/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.initDefaultDAO;

/**
 *
 * @author PC
 */
public class initDefaultBUS {
    initDefaultDAO Data;
    
    String txtMaSP;
    String txtMaNCC;
    String txtMaNSX;
    String txtMaLoaiSP;
    String txtMaNV;    
    
    public initDefaultBUS(){
        Data = new initDefaultDAO();
    }
    
    public String getTxtMaSP() throws Exception{
        return txtMaSP = Data.getTxtMaSP();
    }

    public String getTxtMaLoaiSP() throws Exception{
        return txtMaLoaiSP = Data.getTxtMaLoaiSP();
    }    

    public String getTxtMaNCC() throws Exception{
        return txtMaNCC = Data.getTxtMaNCC();
    }

    public String getTxtMaNSX() throws Exception{
        return txtMaNSX = Data.getTxtMaNSX();
    }    

    public String getTxtMaNV() throws Exception{
        return txtMaNV = Data.getTxtMaNV();
    }
}
