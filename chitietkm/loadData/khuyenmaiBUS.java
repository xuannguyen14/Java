/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.khuyenmaiDTO;
import chitietkm.loadData.khuyenmaiDAO;
import java.util.ArrayList;
/**
 *
 * @author Tat Gia Vi
 */
public class khuyenmaiBUS {
    public static ArrayList<khuyenmaiDTO> showAllkm(){
        return khuyenmaiDAO.showAllkm();
    }
    public static void addkm(khuyenmaiDTO km){
        khuyenmaiDAO.addkm(km);
    }
    public static void editkm(khuyenmaiDTO km){
        khuyenmaiDAO.editkm(km);
    }
    public static void delkm(String makm){
        khuyenmaiDAO.delkm(makm);
    }
}
