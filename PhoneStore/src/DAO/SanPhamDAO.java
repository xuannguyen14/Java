/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.SanPhamDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */

public class SanPhamDAO {

public SanPhamDTO getSanphamByMaSP(String maSP) {
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM SANPHAM WHERE MASP = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                SanPhamDTO sanpham = new SanPhamDTO();
                
                sanpham.setMaSP(rs.getString("MASP"));
                sanpham.setTenSP(rs.getString("TENSP"));
                sanpham.setSoLuong(rs.getInt("SOLUONG"));
                sanpham.setMaLoai(rs.getString("MALOAI"));              
                sanpham.setDonGia(rs.getFloat("DONGIA"));
                sanpham.setMaNSX(rs.getString("MANSX"));
                
                return sanpham;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    public List<SanPhamDTO> getAllSanpham() {
        List<SanPhamDTO> sanphams = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM SANPHAM";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                SanPhamDTO sanpham = new SanPhamDTO();
                
                sanpham.setMaSP(rs.getString("MASP"));
                sanpham.setTenSP(rs.getString("TENSP"));
                sanpham.setMaLoai(rs.getString("MALOAI"));
                sanpham.setDonGia(rs.getFloat("DONGIA"));              
                sanpham.setSoLuong(rs.getInt("SOLUONG"));
                sanpham.setMaNSX(rs.getString("MANSX"));
                
                sanphams.add(sanpham);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return sanphams;
    }
    
    public List<String> getMaSanpham() {
        List<String> sanphams = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT MASP FROM SANPHAM";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                sanphams.add(rs.getString(sql));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return sanphams;
    }
}