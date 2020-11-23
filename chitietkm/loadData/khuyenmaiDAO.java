/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.khuyenmaiDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Tat Gia Vi
 */
public class khuyenmaiDAO {
    public static ArrayList<khuyenmaiDTO> showAllkm(){
        ArrayList<khuyenmaiDTO> arr=new ArrayList<khuyenmaiDTO>();
        String sql="select * from chitietkm inner join khuyenmai on (chitietkm.makm=khuyenmai.makm)";
        loadData act=new loadData();
        try{
           act.openData();
           ResultSet rs=act.excuteQuery(sql);
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
            displayError err= new displayError();
            err.displayError(ex);
        }
        finally{
            act.closeData();
        }
        return arr;
    }
    public static void addkm(khuyenmaiDTO km){
         loadData act=new loadData();
         String sql2="Insert into chitietkm values(";
         sql2=sql2+"'"+km.getmakm()+"'";
         sql2=sql2+",'"+km.getmasp()+"'";
         sql2=sql2+",'"+km.gettile()+"'";
         sql2=sql2+")";
         String sql="Insert into khuyenmai values(";
         sql=sql+"'"+km.getmakm()+"'";
         sql=sql+",'"+km.gettenkm()+"'";
         sql=sql+",'"+km.getngaybd()+"'";
         sql=sql+",'"+km.getngaykt()+"'";
         sql=sql+")";
         act.openData();
         act.executeQuery2(sql);
         act.executeQuery2(sql2);
         act.closeData();
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
}
