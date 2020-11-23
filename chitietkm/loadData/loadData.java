/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tat Gia Vi
 */
public class loadData {
    Connection con;
    public void openData() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phonestore?useUnicode=yes&characterEncoding=UTF-8","root","");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void closeData(){
        try{
            if(con!=null){
               con.close();
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public ResultSet excuteQuery(String sql){// danh cho cau lenh secect
       ResultSet rs = null;
       try {
           Statement stm = (Statement) con.createStatement();
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           displayError err= new displayError();
           err.displayError(ex);
       }
       return rs;
   }
    public void executeQuery2(String sql){
        try{
            Statement stm = (Statement) con.createStatement();
            stm.executeUpdate(sql);
        }
        catch(SQLException ex){
            displayError err= new displayError();
            err.displayError(ex);
        }
    }
}
