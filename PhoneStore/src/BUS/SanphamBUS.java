/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import DAO.SanPhamDAO;
import DTO.SanPhamDTO;

/**
 *
 * @author PC
 */
public class SanPhamBUS {
    private static ArrayList<SanPhamDTO> DSSanPham;

    public static ArrayList<SanPhamDTO> getDSSanPham() {
        return DSSanPham;
    }

    public static void setDSSanPham(ArrayList<SanPhamDTO> DSSanPham) {
        SanPhamBUS.DSSanPham = DSSanPham;
    }    
    
    public SanPhamBUS(){ DSSanPham = null; }
    
    public void docDSSP() throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        if(DSSanPham == null) {
            DSSanPham = new ArrayList<>();
        }
    
        DSSanPham = Data.docDSSP();
    }
    
    public void them (SanPhamDTO sp) throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        Data.them(sp);
        DSSanPham = Data.docDSSP();
    }
    
    public void xoa (int vitri) throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        DSSanPham = Data.docDSSP();
        SanPhamDTO sp = DSSanPham.get(vitri);
        
        Data.xoa(sp.getMaSP());
        DSSanPham = Data.docDSSP();
    }
    
    public void sua (SanPhamDTO sp) throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        
        Data.sua(sp);
        DSSanPham = Data.docDSSP();
    }
    
    public ArrayList<SanPhamDTO> timKiemTheoMaTenSP(String key) throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        ArrayList<SanPhamDTO> Result = new ArrayList<>();

        DSSanPham = Data.docDSSP();
        
        for(SanPhamDTO sp : DSSanPham){
            if(sp.getMaSP().contains(key) || sp.getTenSP().contains(key))
                Result.add(sp);                
        }
        return Result;
    }
    
    public String taoMaSP() throws Exception{
        
        SanPhamDAO Data = new SanPhamDAO();
        DSSanPham = Data.docDSSP();
        
        String MaSPCuoi = DSSanPham.get(DSSanPham.size()-1).getMaSP();
        
        String KeyString = "";
        int vitri = 0;
        
        while(vitri < MaSPCuoi.length()){
            if(MaSPCuoi.charAt(vitri) != 's' && MaSPCuoi.charAt(vitri) != 'p'){
                KeyString += MaSPCuoi.charAt(vitri);
            }
            vitri++;
        }
        
        int KeyCode = parseInt(KeyString);
        KeyCode++;
        
        if(KeyCode >= 100){
            KeyString = "sp" + KeyCode;
        }
        else 
            if(KeyCode >=10){
            KeyString = "sp0" + KeyCode;
        }
            else{
                KeyString = "sp00" + KeyCode;
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
    
    public SanPhamDTO getSanphamByMaSP(String maSP) throws Exception{
        SanPhamDAO Data = new SanPhamDAO();
        
        return Data.getSanphamByMaSP(maSP);
    }
}
