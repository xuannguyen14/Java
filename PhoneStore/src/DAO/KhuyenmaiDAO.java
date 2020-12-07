/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.KhuyenmaiDTO;
import DAO.JDBCConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author pc
 */
public class KhuyenmaiDAO {
    public ArrayList<KhuyenmaiDTO> showAllkm(){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from khuyenmai";
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.settenkm(rs.getString("TenKM"));
               km.setngaybd(rs.getString("NgayBD"));
               km.setngaykt(rs.getString("NgayKT"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
    }
    public void addkm(KhuyenmaiDTO km){
         Connection act=JDBCConnection.getConnection();
         String sql2="INSERT INTO CHITIETKM (MAKM,MASP,TILEKM) VALUES (?,?,?)";
         String sql="INSERT INTO KHUYENMAI (MAKM,TENKM,NGAYBD,NGAYKT) VALUES (?,?,?,?)";
         try{
             PreparedStatement ps1=act.prepareStatement(sql);
             ps1.setString(1, km.getmakm());
             ps1.setString(2, km.gettenkm());
             ps1.setString(3, km.getngaybd());
             ps1.setString(4, km.getngaykt());
             int rs=ps1.executeUpdate();
             PreparedStatement ps2=act.prepareStatement(sql2);
             ps2.setString(1, km.getmakm());
             ps2.setString(2, km.getmasp());
             ps2.setInt(3, km.gettile());
             ps2.executeUpdate();
             int rs2=ps2.executeUpdate();
             System.out.println(rs);
             System.out.println(rs2);
         }
         catch(SQLException ex){
             ex.printStackTrace();
         }
    }
    public void editkm(KhuyenmaiDTO km){
         Connection act=JDBCConnection.getConnection();
         String sql2="Update chitietkm Set TiLeKM=? Where MaKM=?";
         String sql="Update khuyenmai Set TenKM=?,NgayBD=?,NgayKT=? Where MaKM=?";
         try{
             PreparedStatement ps2=act.prepareStatement(sql);
             ps2.setString(1,km.gettenkm());
             ps2.setString(2,km.getngaybd());
             ps2.setString(3,km.getngaykt());
             ps2.setString(4,km.getmakm());
             ps2.executeUpdate();
             PreparedStatement ps1=act.prepareStatement(sql2);
             ps1.setInt(1,km.gettile());
             ps1.setString(2,km.getmakm());
             ps1.executeUpdate();
            
         }
         catch(SQLException ex){
             ex.printStackTrace();
         }
    }
    public void delkm(String makm){
        Connection act=JDBCConnection.getConnection();
        String sql="Delete from khuyenmai where MaKM=?";
        String sql2="Delete from chitietkm where MaKM=?";
        try{
            PreparedStatement ps1=act.prepareStatement(sql2);
            ps1.setString(1,makm);
            PreparedStatement ps2=act.prepareStatement(sql);
            ps2.setString(1,makm);
            ps1.executeUpdate();
            ps2.executeUpdate();
        }
        catch(SQLException ex){
             ex.printStackTrace();
         }
    }
    
    public ArrayList<KhuyenmaiDTO> findkm(String attri,String temp){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from khuyenmai where "+attri+" like '%"+temp+"%'";
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.settenkm(rs.getString("TenKM"));
               km.setngaybd(rs.getString("NgayBD"));
               km.setngaykt(rs.getString("NgayKT"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
    }
    public ArrayList<KhuyenmaiDTO> findnc(String ym){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from khuyenmai where NgayBD like '%"+ym+"%'";
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.settenkm(rs.getString("TenKM"));
               km.setngaybd(rs.getString("NgayBD"));
               km.setngaykt(rs.getString("NgayKT"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
        }
    public ArrayList<KhuyenmaiDTO> showAllct(){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from chitietkm";
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.setmasp(rs.getString("MaSP"));
               km.settile(rs.getInt("TiLeKM"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
    }
    public ArrayList<KhuyenmaiDTO> findctnc(String num){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from chitietkm where TiLeKM"+num;
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.setmasp(rs.getString("MaSP"));
               km.settile(rs.getInt("TiLeKM"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
    }
    public ArrayList<KhuyenmaiDTO> findct(String value){
        ArrayList<KhuyenmaiDTO> arr=new ArrayList<KhuyenmaiDTO>();
        String sql="select * from chitietkm where MaKM like '%"+value+"%'";
        try{
           Connection act=JDBCConnection.getConnection();
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           while(rs.next()){
               KhuyenmaiDTO km=new KhuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.setmasp(rs.getString("MaSP"));
               km.settile(rs.getInt("TiLeKM"));
               arr.add(km);
           }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return arr;
    }
}
