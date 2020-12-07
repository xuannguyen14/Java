/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.HoadonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XuanNguyen
 */
public class HoadonDAO {
    
    public List<HoadonDTO> getAllHoaDon() {
        List<HoadonDTO> hoadons = new ArrayList<>();
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM HOADON";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoadonDTO hoadon = new HoadonDTO();
                
                hoadon.setMaHD(rs.getString("MAHOADON"));
                hoadon.setNgayxuat(rs.getString("NGAYXUAT"));
                hoadon.setMaKH(rs.getString("MAKHACHHANG"));
                hoadon.setMaNV(rs.getString("MANHANVIEN"));              
                hoadon.setTongtien(rs.getDouble("TONGTIEN"));
                hoadon.setTongKM(rs.getDouble("TONGKM"));
                hoadon.setTientra(rs.getDouble("TIENTRA"));
                
                hoadons.add(hoadon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return hoadons;
    }
    
    public HoadonDTO getHoadonByMaHoadon(String maHD) {
        
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM HOADON WHERE MAHOADON = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoadonDTO hoadon = new HoadonDTO();
                
                hoadon.setMaHD(rs.getString("MAHOADON"));
                hoadon.setNgayxuat(rs.getString("NGAYXUAT"));
                hoadon.setMaKH(rs.getString("MAKHACHHANG"));
                hoadon.setMaNV(rs.getString("MANHANVIEN"));              
                hoadon.setTongtien(rs.getDouble("TONGTIEN"));
                hoadon.setTongKM(rs.getDouble("TONGKM"));
                hoadon.setTientra(rs.getDouble("TIENTRA"));
                
                return hoadon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public List<HoadonDTO> getHoadonByMaKH(String maKH){
        List<HoadonDTO> hoadons = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM HOADON WHERE MAKHACHHANG = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKH);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoadonDTO hoadon = new HoadonDTO();
                
                hoadon.setMaHD(rs.getString("MAHOADON"));
                hoadon.setNgayxuat(rs.getString("NGAYXUAT"));
                hoadon.setMaKH(rs.getString("MAKHACHHANG"));
                hoadon.setMaNV(rs.getString("MANHANVIEN"));              
                hoadon.setTongtien(rs.getDouble("TONGTIEN"));
                hoadon.setTongKM(rs.getDouble("TONGKM"));
                hoadon.setTientra(rs.getDouble("TIENTRA"));
                
                hoadons.add(hoadon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return hoadons;
    }
    
    public List<HoadonDTO> getHoadonByMaNV(String maNV){
        List<HoadonDTO> hoadons = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM HOADON WHERE MANHANVIEN = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNV);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoadonDTO hoadon = new HoadonDTO();
                
                hoadon.setMaHD(rs.getString("MAHOADON"));
                hoadon.setNgayxuat(rs.getString("NGAYXUAT"));
                hoadon.setMaKH(rs.getString("MAKHACHHANG"));
                hoadon.setMaNV(rs.getString("MANHANVIEN"));              
                hoadon.setTongtien(rs.getDouble("TONGTIEN"));
                hoadon.setTongKM(rs.getDouble("TONGKM"));
                hoadon.setTientra(rs.getDouble("TIENTRA"));
                
                hoadons.add(hoadon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return hoadons;
    }

    
    public void insertHoadon(HoadonDTO hoadon){
        Connection connection = JDBCConnection.getConnection();
        String sql = "INSERT INTO HOADON (MAHOADON, NGAYXUAT, MAKHACHHANG, MANHANVIEN, TONGTIEN, TONGKM, TIENTRA) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoadon.getMaHD());
            preparedStatement.setString(2, hoadon.getNgayxuat());
            preparedStatement.setString(3, hoadon.getMaKH());
            preparedStatement.setString(4, hoadon.getMaNV());
            preparedStatement.setDouble(5, hoadon.getTongtien());
            preparedStatement.setDouble(6, hoadon.getTongKM());
            preparedStatement.setDouble(7, hoadon.getTientra());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteHoadon(String maHD){
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "DELETE FROM HOADON WHERE MAHOADON = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maHD);
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<HoadonDTO> getHoadonByDate(String tuNgay, String denNgay){
        List<HoadonDTO> hoadons = new ArrayList<>();
        Connection connection = JDBCConnection.getConnection();
        
        String sql = "SELECT * FROM HOADON WHERE NGAYXUAT BETWEEN ? AND ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tuNgay);
            preparedStatement.setString(2, denNgay);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                HoadonDTO hoadon = new HoadonDTO();
                
                hoadon.setMaHD(rs.getString("MAHOADON"));
                hoadon.setNgayxuat(rs.getString("NGAYXUAT"));
                hoadon.setMaKH(rs.getString("MAKHACHHANG"));
                hoadon.setMaNV(rs.getString("MANHANVIEN"));              
                hoadon.setTongtien(rs.getDouble("TONGTIEN"));
                hoadon.setTongKM(rs.getDouble("TONGKM"));
                hoadon.setTientra(rs.getDouble("TIENTRA"));
                
                hoadons.add(hoadon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return hoadons;
    }

}



