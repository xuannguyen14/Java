/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.chitietkmDTO;
import chitietkm.loadData.chitietkmDAO;
import java.util.ArrayList;
/**
 *
 * @author Tat Gia Vi
 */
public class chitietkmBUS {
    public static ArrayList<chitietkmDTO> showAllctkm(){
        return chitietkmDAO.showAllctkm();
    }
}
