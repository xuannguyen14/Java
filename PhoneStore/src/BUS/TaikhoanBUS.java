
package BUS;

import DAO.TaikhoanDAO;
import DTO.TaikhoanDTO;
import java.util.List;

/**
 *
 * @author pc
 */
public class TaikhoanBUS {
    private  TaikhoanDAO taikhoanDAO;
    
    public TaikhoanBUS(){
        taikhoanDAO = new TaikhoanDAO();
    }
    
    public List<TaikhoanDTO> getAllTaikhoan(){
        return taikhoanDAO.getAllTaikhoan();
    }
    
    public void addTaikhoan(TaikhoanDTO taikhoan){
        taikhoanDAO.addTaikhoan(taikhoan);
    }
    
    public void deleteTaikhoan(String maHD){
        taikhoanDAO.deleteTaikhoan(maHD);
    }
    
    public void updateTaikhoan(TaikhoanDTO taikhoan){
        taikhoanDAO.updateTaikhoan(taikhoan);
    } 
      
    public TaikhoanDTO getTaikhoanByMaTK(String maTK){
        return taikhoanDAO.getTaikhoanByMaTK(maTK);
    }

}
