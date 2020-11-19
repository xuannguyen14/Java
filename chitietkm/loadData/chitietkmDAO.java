/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.chitietkmDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Tat Gia Vi
 */
public class chitietkmDAO {
    public static ArrayList<chitietkmDTO> showAllctkm(){
        ArrayList<chitietkmDTO> arr=new ArrayList<chitietkmDTO>();
        String sql="select * from chitietkm";
        loadData act=new loadData();
        try{
            act.openData();
            ResultSet rs=act.executeQuery(sql);
            while(rs.next()){
                chitietkmDTO km=new chitietkmDTO();
                km.setmakm(rs.getString("MaKM"));
                km.setmasp(rs.getString("MaSP"));
                km.settilekm(rs.getString("TiLeKM"));
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
