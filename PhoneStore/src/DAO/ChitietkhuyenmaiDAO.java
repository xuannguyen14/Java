package DAO;

import DTO.ChitietkhuyenmaiDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ChitietkhuyenmaiDAO {
    
    
    public List<ChitietkhuyenmaiDTO> getAllCTKM() {
        List<ChitietkhuyenmaiDTO> chitietKMs = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM CHITIETKHUYEMMAI";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChitietkhuyenmaiDTO chitietKM = new ChitietkhuyenmaiDTO();
                
                chitietKM.setMaKM(rs.getString("MAKM"));
                chitietKM.setMaSP(rs.getString("MASP"));
                chitietKM.setTileKM(rs.getInt("TILEKM"));
                
                chitietKMs.add(chitietKM);
            }
        } catch (SQLException e) {
        }
        
        return chitietKMs;
    }
    
    public ChitietkhuyenmaiDTO getTileKM(String maKM, String maSP) {
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT TILEKM FROM CHITIETKM WHERE MAKM = ? AND MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKM);
            preparedStatement.setString(2, maSP);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChitietkhuyenmaiDTO chitietKM = new ChitietkhuyenmaiDTO();
                
                chitietKM.setTileKM(rs.getInt("TILEKM"));
                
                return chitietKM;
            }
        } catch (SQLException e) {
        }
        
        return null;
    }
    
    public String getMakmByMasp(String maSP) {
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT MAKM FROM CHITIETKM WHERE MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                ChitietkhuyenmaiDTO chitietKM = new ChitietkhuyenmaiDTO();
                String maKM;
                maKM = rs.getString("MAKM");
                
                return maKM;
            }
        } catch (SQLException e) {
        }
        
        return "error";
    }
    
//    public ChitietkhuyenmaiDTO getMakmByMasp(String maSP) {
//        
//        Connection connection = JDBCConnection.getConnection();
//        
//        String sql = "SELECT MAKM FROM CHITIETKM WHERE MASP = ?";
//        
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, maSP);
//            ResultSet rs = preparedStatement.executeQuery();
//            
//            while(rs.next()){
//                ChitietkhuyenmaiDTO chitietKM = new ChitietkhuyenmaiDTO();
//                
//                chitietKM.setMaKM(rs.getString("MAKM"));
//                
//                return chitietKM;
//            }
//        } catch (SQLException e) {
//        }
//        
//        return null;
//    }
}
