/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.KhachhangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class KhachhangDAO {
    
    private Connection connection = null;
    
    public KhachhangDAO() {
        connection = (Connection) MyJDBCConnection.getConnection();
    }
    
    public ArrayList<KhachhangDTO> getDanhSachKhachHang() {
        ArrayList<KhachhangDTO> danhSachKhachHang = new ArrayList<>();
        String query = "SELECT * FROM khachhang";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                danhSachKhachHang.add(toKhachHangDTO(resultSet));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachKhachHang;
    }
    
    public KhachhangDTO getKhachHangByMaKhachHang(String maKhachHang) {
        KhachhangDTO khachHangDTO = null;
        String query = "SELECT * FROM khachhang WHERE makhachhang = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1, maKhachHang);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                khachHangDTO = toKhachHangDTO(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khachHangDTO;
    }
    
    public void addKhachHang(KhachhangDTO khachHangMoi) {
        String query = "INSERT INTO khachhang VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            
            preparedStatement.setString(1, khachHangMoi.getMaKhachHang());
            preparedStatement.setString(2, khachHangMoi.getTenKhachHang());
            preparedStatement.setString(3, khachHangMoi.getDiaChi());
            preparedStatement.setString(4, khachHangMoi.getEmail());
            preparedStatement.setString(5, khachHangMoi.getSDT());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteKhachHang(String maKhachHang) {
        String query = "DELETE FROM khachhang WHERE makhachhang = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            
            preparedStatement.setString(1, maKhachHang);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void upadateKhachHang(KhachhangDTO khachHangMoi) {
        String query = "UPDATE khachhang set TenKhachHang = ?, DiaChi = ?, Email = ?, SDT = ? WHERE makhachhang = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            
            preparedStatement.setString(1, khachHangMoi.getTenKhachHang());
            preparedStatement.setString(2, khachHangMoi.getDiaChi());
            preparedStatement.setString(3, khachHangMoi.getEmail());
            preparedStatement.setString(4, khachHangMoi.getSDT());
            preparedStatement.setString(5, khachHangMoi.getMaKhachHang());
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private KhachhangDTO toKhachHangDTO(ResultSet resultSet) {
        KhachhangDTO khachHangDTO = null;
        try {
            String maKhachHang = resultSet.getString("makhachhang");
            String tenKhachHang = resultSet.getString("TenKhachHang");
            String diaChi = resultSet.getString("DiaChi");
            String email = resultSet.getString("Email");
            String SDT = resultSet.getString("SDT");
            khachHangDTO = new KhachhangDTO(maKhachHang, tenKhachHang, diaChi, email, SDT);
        } catch (SQLException ex) {
            Logger.getLogger(KhachhangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khachHangDTO;
    }

    

    
}
