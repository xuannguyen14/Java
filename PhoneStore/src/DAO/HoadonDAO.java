/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.HoadonDTO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    /*
    public List<Student> getStudentsByName(String name) {
        List<Student> students = new ArrayList<>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM SINHVIEN WHERE NAME = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Student student = new Student();
                
                student.setMSSV(rs.getInt("MSSV"));
                student.setFirstName(rs.getString("FIRSTNAME"));
                student.setName(rs.getString("NAME"));
                student.setBirthday(rs.getString("BIRTHDAY"));              
                student.setSClass(rs.getString("CLASS"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                student.setSex(rs.getString("SEX"));
                
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return students;
    }
    public void addStudent(Student student){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "INSERT INTO SINHVIEN (MSSV, FIRSTNAME, NAME, BIRTHDAY, CLASS, ADDRESS, PHONE, SEX) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getMSSV());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getName());
            preparedStatement.setString(4, student.getBirthday());
            preparedStatement.setString(5, student.getSClass());
            preparedStatement.setString(6, student.getAddress());
            preparedStatement.setString(7, student.getPhone());
            preparedStatement.setString(8, student.getSex());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
        */
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
    /*
    public void updateStudent(Student student){
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "UPDATE SINHVIEN SET FIRSTNAME = ?,NAME = ?,BIRTHDAY = ?,CLASS = ?,ADDRESS = ?,PHONE = ?,SEX = ? WHERE MSSV = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);       
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getBirthday());
            preparedStatement.setString(4, student.getSClass());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.setString(6, student.getPhone());
            preparedStatement.setString(7, student.getSex());
            preparedStatement.setInt(8, student.getMSSV());            

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }
    
    public Student findStudentsMSSV(int mssv) {
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM SINHVIEN WHERE MSSV LIKE %'?'%";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, mssv);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Student student = new Student();
                
                student.setMSSV(rs.getInt("MSSV"));
                student.setFirstName(rs.getString("FIRSTNAME"));
                student.setName(rs.getString("NAME"));
                student.setBirthday(rs.getString("BIRTHDAY"));              
                student.setSClass(rs.getString("CLASS"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                student.setSex(rs.getString("SEX"));
                
                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Student> findStudentsName(String name) {
        List<Student> students = new ArrayList<>();
        
        Connection connection = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM SINHVIEN WHERE NAME LIKE ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                Student student = new Student();
                
                student.setMSSV(rs.getInt("MSSV"));
                student.setFirstName(rs.getString("FIRSTNAME"));
                student.setName(rs.getString("NAME"));
                student.setBirthday(rs.getString("BIRTHDAY"));              
                student.setSClass(rs.getString("CLASS"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                student.setSex(rs.getString("SEX"));
                
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return students;
    }
    
    public List<Student> findStudentByName(String name) throws SQLException{
        List<Student> students = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String query = "select * from SinhVien where name like'%" + name + "%'";
        
        
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                Student student = new Student();
                
                student.setMSSV(rs.getInt("MSSV"));
                student.setFirstName(rs.getString("FIRSTNAME"));
                student.setName(rs.getString("NAME"));
                student.setBirthday(rs.getString("BIRTHDAY"));              
                student.setSClass(rs.getString("CLASS"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                student.setSex(rs.getString("SEX"));
                
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return students;
    }
*/
}



