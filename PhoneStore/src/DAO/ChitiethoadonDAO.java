
package DAO;

import DTO.ChitiethoadonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xuannguyen
 */
public class ChitiethoadonDAO {
    public void addChitietHoadon(ChitiethoadonDTO chitietHD){
        Connection connection = JDBCConnection.getConnection();
        String sql = "INSERT INTO CHITIETHOADON (MASP, MAHD, SOLUONG, DONGIA, THANHTIEN, TIENKM) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, chitietHD.getMasp());
            preparedStatement.setString(2, chitietHD.getMahd());
            preparedStatement.setInt(3, chitietHD.getSoluongmua());
            preparedStatement.setFloat(4, chitietHD.getDongia());
            preparedStatement.setFloat(5, chitietHD.getThanhtien());
            preparedStatement.setFloat(6, chitietHD.getTienkm());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public List<ChitiethoadonDTO> getCTHDByMaHD(String maHD) {
        List<ChitiethoadonDTO> chitietHDs = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM CHITIETHOADON WHERE MAHD = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChitiethoadonDTO chitietHD = new ChitiethoadonDTO();
                
                chitietHD.setMahd(rs.getString("MAHD"));
                chitietHD.setMasp(rs.getString("MASP"));
                chitietHD.setSoluongmua(rs.getInt("SOLUONG"));
                chitietHD.setThanhtien(rs.getFloat("THANHTIEN"));              
                chitietHD.setDongia(rs.getFloat("DONGIA"));
                chitietHD.setTienkm(rs.getFloat("TIENKM"));
                
                chitietHDs.add(chitietHD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return chitietHDs;
    }
    
    public void deleteCTHD(String maHD){
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "DELETE FROM CHITIETHOADON WHERE MAHD = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
