
package BUS;

import DAO.HoadonDAO;
import DTO.HoadonDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author XuanNguyen
 */
public class HoadonBUS {
    
    private  HoadonDAO hoadonDAO;
    
    public HoadonBUS(){
        hoadonDAO = new HoadonDAO();
    }
    
    public List<HoadonDTO> getAllHoadon(){
        return hoadonDAO.getAllHoaDon();
    }
    /*
    public void addStudent(Student student){
        hoadonDAO.addStudent(student);
    }
    */
    public void deleteHoadon(String maHD){
        hoadonDAO.deleteHoadon(maHD);
    }
    /*
    public void updateStudent(Student student){
        hoadonDAO.updateStudent(student);
    } 
      */  
    public HoadonDTO getHoadonByMaHoadon(String maHD){
        return hoadonDAO.getHoadonByMaHoadon(maHD);
    }
/*
    public List<Student> findStudentsName(String name) {
        return hoadonDAO.findStudentsName(name);
    }
    
    public List<Student> getStudentsByName(String name){
        return hoadonDAO.getStudentsByName(name);
    }
    
    public List<Student> findStudentByName(String name) throws SQLException{
        return hoadonDAO.findStudentByName(name);
    }
*/
}

