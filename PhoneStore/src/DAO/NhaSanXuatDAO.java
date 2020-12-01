/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhaSanXuatDTO;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class NhaSanXuatDAO {
    
    private Connection connection = null;
    
    public NhaSanXuatDAO() {
        connection = (Connection) JDBCConnection.getConnection();
    }
    
    public ArrayList<NhaSanXuatDTO> getDanhSachNhaSanXuat() {
        ArrayList<NhaSanXuatDTO> danhSachNhaSanXuat = null;
        
        String query = "SELECT * FROM nhasx";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            danhSachNhaSanXuat = new ArrayList<NhaSanXuatDTO>();
            while(resultSet.next()) {
                String maNSX = resultSet.getString("mansx");
                String tenNSX = resultSet.getString("TenSX");
                String diaChi = resultSet.getString("DiaChi");
                String SDT = resultSet.getString("SDT");
                NhaSanXuatDTO nhaSanXuat = new NhaSanXuatDTO(maNSX, tenNSX, diaChi, SDT);
                danhSachNhaSanXuat.add(nhaSanXuat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaSanXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return danhSachNhaSanXuat;
    }
    
    public void add(NhaSanXuatDTO nhaSanXuat) {
        String query = "INSERT INTO nhasx VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, nhaSanXuat.getMaNSX());
            preparedStatement.setString(2, nhaSanXuat.getTenNSX());
            preparedStatement.setString(3, nhaSanXuat.getDiaChi());
            preparedStatement.setString(4, nhaSanXuat.getSDT());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaSanXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteById(String maNSX) {
        String query = "DELETE FROM nhasx WHERE mansx = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, maNSX);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaSanXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void update(NhaSanXuatDTO nhaSanXuat) {
        String query = "UPDATE nhasx SET TenSX = ?, DiaChi = ?, SDT = ? WHERE mansx = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, nhaSanXuat.getTenNSX());
            preparedStatement.setString(2, nhaSanXuat.getDiaChi());
            preparedStatement.setString(3, nhaSanXuat.getSDT());
            preparedStatement.setString(4, nhaSanXuat.getMaNSX());
            
            int i = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaSanXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public NhaSanXuatDTO getNhaSanXuatById(String maNSX) {
        NhaSanXuatDTO nhaSanXuat = null;
        String query = "SELECT * FROM nhasx WHERE mansx = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, maNSX);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                String tenSX = resultSet.getString("TenSX");
                String diaChi = resultSet.getString("DiaChi");
                String SDT = resultSet.getString("SDT");
                nhaSanXuat = new NhaSanXuatDTO(maNSX, tenSX, diaChi, SDT);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaSanXuatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhaSanXuat;
    }
    
}
