/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.khuyenmaiDTO;
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
        String sql="select * from khuyenmai";
        loadData act=new loadData();
        try{
           act.openData();
           ResultSet rs=act.executeQuery(sql);
           while(rs.next()){
               khuyenmaiDTO km=new khuyenmaiDTO();
               km.setmakm(rs.getString("MaKM"));
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
}
