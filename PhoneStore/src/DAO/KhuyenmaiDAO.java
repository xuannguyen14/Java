/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
/*public class KhuyenmaiDAO {
    public static ArrayList<khuyenmaiDTO> showAllkm(){
        ArrayList<khuyenmaiDTO> arr=new ArrayList<khuyenmaiDTO>();
        String sql="select * from chitietkm inner join khuyenmai on (chitietkm.makm=khuyenmai.makm)";
        Connection act=JDBCConnection.getConnection();
        try{
           Statement stmt=act.createStatement();
           ResultSet rs=stmt.excuteQuery(sql);
           while(rs.next()){
               khuyenmaiDTO km=new khuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
               km.setmasp(rs.getString("MaSP"));
               km.settile(rs.getInt("TiLeKM"));
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
    public static void addkm(khuyenmaiDTO km){
         Connection act=JDBCConnection.getConnection();
         String sql="Insert into chitietkm (MaKM,MaSP,TiLeKM) values (?,?,?)";
         String sql2="Insert into khuyenmai (MaKM,TenKM,NgayBD,NgayKT) values (?,?,?,?)";
         try{
             PrepareStatement ps1=act.preparedStatement(sql);
             ps1.setString(1, km.getmakm());
             ps1.setString(2, km.getmasp());
             ps1.setString(3, km.gettilekm());
             ps1.executeUpdate();
             PrepareStatement ps2=act.preparedStatement(sql2);
             ps2.setString(1, km.getmakm());
             ps2.setString(2, km.gettenkm());
             ps2.setString(3, km.getngaybd());
             ps2.setString(4, km.getngaykt());
             ps2.executeUpdate();
         catch(SQLException ex){
             ex.printStackTrace();
         }
    }
    public static void editkm(khuyenmaiDTO km){
         loadData act=new loadData();
         String sql2="Update chitietkm Set";
         sql2=sql2+" TiLeKM='"+km.gettile()+"'";
         sql2=sql2+" Where MaKM='"+km.getmakm()+"'";
         String sql="Update khuyenmai Set";
         sql=sql+" TenKM='"+km.gettenkm()+"'";
         sql=sql+",NgayBD='"+km.getngaybd()+"'";
         sql=sql+",NgayKT='"+km.getngaykt()+"'";
         sql=sql+" Where MaKM='"+km.getmakm()+"'";
         act.openData();
         act.executeQuery2(sql);
         act.executeQuery2(sql2);
         act.closeData();
    }
    public static void delkm(String makm){
        loadData act=new loadData();
        String sql="Delete from khuyenmai where MaKM='"+makm+"'";
        String sql2="Delete from chitietkm where MaKM='"+makm+"'";
        act.openData();
        act.executeQuery2(sql2);
        act.executeQuery2(sql);
        act.closeData();
    }
    public static void findkm(String temp){
        
    }
}*/
