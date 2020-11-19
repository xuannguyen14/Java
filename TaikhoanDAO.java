
package DAO;

import DTO.TaikhoanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xuannguyen
 */
public class TaikhoanDAO {
    public List<TaikhoanDTO> getAllTaikhoan() {
        List<TaikhoanDTO> taikhoans = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM TAIKHOAN";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                TaikhoanDTO taikhoan = new TaikhoanDTO();
                
                taikhoan.setMaTK(rs.getString("MATAIKHOAN"));
                taikhoan.setPassword(rs.getString("PASSWORD"));
                taikhoans.add(taikhoan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return taikhoans;
    }
    
    public TaikhoanDTO getTaikhoanByMaTK(String maTK) {
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM TAIKHOAN WHERE MATAIKHOAN = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maTK);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                TaikhoanDTO taikhoan = new TaikhoanDTO();
                
                taikhoan.setMaTK(rs.getString("MATAIKHOAN"));
                taikhoan.setPassword(rs.getString("PASSWORD"));
                
                return taikhoan;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    public void addTaikhoan(TaikhoanDTO taikhoan){
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "INSERT INTO TAIKHOAN (MATAIKHOAN, PASSWORD) VALUES (?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, taikhoan.getMaTK());
            preparedStatement.setString(2, taikhoan.getPassword());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
        
    public void deleteTaikhoan(String maTK){
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "DELETE FROM TAIKHOAN WHERE MATAIKHOAN = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maTK);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateTaikhoan(TaikhoanDTO taikhoan){
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "UPDATE TAIKHOAN SET MATAIKHOAN = ?,PASSWORD = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);       
            preparedStatement.setString(1, taikhoan.getMaTK());
            preparedStatement.setString(2, taikhoan.getPassword());          

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }    
}


