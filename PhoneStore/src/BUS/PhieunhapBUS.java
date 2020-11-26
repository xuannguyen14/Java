/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import DAO.PhieunhapDAO;
import DTO.PhieuNhapDTO;

/**
 *
 * @author PC
 */
public class PhieunhapBUS {
    private static ArrayList<PhieuNhapDTO> DSPhieuNhap;

    public static ArrayList<PhieuNhapDTO> getDSPhieuNhap() {
        return DSPhieuNhap;
    }

    public static void setDSPhieuNhap(ArrayList<PhieuNhapDTO> DSPhieuNhap) {
        PhieunhapBUS.DSPhieuNhap = DSPhieuNhap;
    }    
    
    public PhieunhapBUS(){ DSPhieuNhap = null; }
    
    public void docDSPN() throws Exception{
        PhieunhapDAO Data = new PhieunhapDAO();
        if(DSPhieuNhap == null) {
            DSPhieuNhap = new ArrayList<>();
        }
    
        DSPhieuNhap = Data.docDSPN();
    }
    
    public void them (PhieuNhapDTO pn) throws Exception{
        PhieunhapDAO Data = new PhieunhapDAO();
        Data.them(pn);
        DSPhieuNhap = Data.docDSPN();
    }
    
    public void xoa (int vitri) throws Exception{
        PhieunhapDAO Data = new PhieunhapDAO();
        DSPhieuNhap = Data.docDSPN();
        PhieuNhapDTO pn = DSPhieuNhap.get(vitri);
        
        Data.xoa(pn.getMaPN());
        DSPhieuNhap = Data.docDSPN();
    }
    
    public void sua (PhieuNhapDTO pn) throws Exception{
        PhieunhapDAO Data = new PhieunhapDAO();
        
        Data.sua(pn);
        DSPhieuNhap = Data.docDSPN();
    }
    
    public ArrayList<PhieuNhapDTO> timKiemTheoMaTenPN(String key) throws Exception{
        PhieunhapDAO Data = new PhieunhapDAO();
        ArrayList<PhieuNhapDTO> Result = new ArrayList<>();

        DSPhieuNhap = Data.docDSPN();
        
        for(PhieuNhapDTO pn : DSPhieuNhap){
            if(pn.getMaPN().contains(key))
                Result.add(pn);                
        }
        return Result;
    }
    
    public String taoMaPN() throws Exception{
        
        PhieunhapDAO Data = new PhieunhapDAO();
        DSPhieuNhap = Data.docDSPN();
        
        String MaPNCuoi = DSPhieuNhap.get(DSPhieuNhap.size()-1).getMaPN();
        
        String KeyString = "";
        int vitri = 0;
        
        while(vitri < MaPNCuoi.length()){
            if(MaPNCuoi.charAt(vitri) != 'p' && MaPNCuoi.charAt(vitri) != 'n'){
                KeyString += MaPNCuoi.charAt(vitri);
            }
            vitri++;
        }
        
        int KeyCode = parseInt(KeyString);
        KeyCode++;
        
        if(KeyCode >= 100){
            KeyString = "pn" + KeyCode;
        }
        else 
            if(KeyCode >=10){
            KeyString = "pn0" + KeyCode;
        }
            else{
                KeyString = "pn00" + KeyCode;
            }
        
        return KeyString;
    }
    
    public boolean validString(String Ten){
        for(int i = 0; i < Ten.length(); i++){
            if(Ten.charAt(i) == (int)Ten.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean validNumber(String Num){
        for(int i = 0; i < Num.length(); i++){
            if(Num.charAt(i) < '0' || Num.charAt(i) > '9'){
                return false;
            }
        }
        
        return parseInt(Num) > 0;        
    }
}
