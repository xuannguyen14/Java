/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.util.ArrayList;
import DTO.KhuyenmaiDTO;
import DAO.KhuyenmaiDAO;
/**
 *
 * @author pc
 */
public class KhuyenmaiBUS {
    private KhuyenmaiDAO km;
    public KhuyenmaiBUS(){
        km= new KhuyenmaiDAO();
    }
    public ArrayList<KhuyenmaiDTO> showAllkm(){
        return km.showAllkm();
    }
    public void addkm(KhuyenmaiDTO mk){
        km.addkm(mk);
    }
    public void editkm(KhuyenmaiDTO mk){
        km.editkm(mk);
    }
    public void delkm(String makm){
        km.delkm(makm);
    }
    public ArrayList<KhuyenmaiDTO> findkm(String attri,String temp){
        return km.findkm(attri,temp);
    }
    public ArrayList<KhuyenmaiDTO> findnc(String ym){
        return km.findnc(ym);
    }
    public ArrayList<KhuyenmaiDTO> showAllct(){
        return km.showAllct();
    }
    public ArrayList<KhuyenmaiDTO> findctnc(String num){
        return km.findctnc(num);
    }
    public ArrayList<KhuyenmaiDTO> findct(String attr,String value){
        return km.findct(attr,value);
    }
}
