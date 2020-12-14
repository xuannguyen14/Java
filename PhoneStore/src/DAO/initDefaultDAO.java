/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author PC
 */
public class initDefaultDAO {
    MyConnection MyConn;
    
    String host = "localhost";
    String user = "root";
    String password = "";
    String db = "phonestore";
    String txt;
    
    public initDefaultDAO(){
        MyConn = new MyConnection(host,user,password,db);
    }
    
    private ResultSet getResultSet() throws Exception{
        String qry = "Select * From initchooseid";
        ResultSet rs = MyConn.excuteQuery(qry);
        
        return rs;
    }

    public String getTxtMaSP() throws Exception {
        ResultSet rs = getResultSet();

        while(rs.next()){
            txt = rs.getString(1);
        }
        
        return txt;
    }

    public String getTxtMaNCC() throws Exception{
        ResultSet rs = getResultSet();

        while(rs.next()){
            txt = rs.getString(2);
        }        
        
        return txt;
    }

    public String getTxtMaNSX() throws Exception{
        ResultSet rs = getResultSet();

        while(rs.next()){
            txt = rs.getString(3);
        }
        
        return txt;
    }

    public String getTxtMaLoaiSP() throws Exception{
        ResultSet rs = getResultSet();      
        
        while(rs.next()){
            txt = rs.getString(5);
        }
        
        return txt;
    }

    public String getTxtMaNV() throws Exception{
        ResultSet rs = getResultSet();

        while(rs.next()){
            txt = rs.getString(4);
        }
        
        return txt;
    }    
}
