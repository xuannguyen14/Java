/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.PhieuNhapDTO;

/**
 *
 * @author PC
 */
public class PhieuNhapDAO {
    String host = "localhost";
    String user = "root";
    String password = "";
    String db = "phonestore";   
    
    MyConnection MyConn;
    
    public PhieuNhapDAO() throws Exception{
            MyConn = new MyConnection(host,user,password,db);
    }

public ArrayList docDSPN() throws Exception{
    ArrayList dspn = new ArrayList<>();

    String qry = "Select * From phieunhap";
    ResultSet rs = MyConn.excuteQuery(qry);

    while(rs.next()){
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPN(rs.getString(1));
        pn.setNgayNhap(rs.getDate(2));
        pn.setMaNCC(rs.getString(3));
        pn.setMaNV(rs.getString(4));
        pn.setTongTien(rs.getInt(5));
        dspn.add(pn);
    }
        return dspn;
}

public void them (PhieuNhapDTO pn) throws Exception{
    String qry = "Insert Into phieunhap Values('";
    qry += pn.getMaPN() + "',";
    qry += "NOW() ,'";
    qry += pn.getMaNCC() + "','";
    qry += pn.getMaNV() + "','";
    qry += BigInteger.valueOf(pn.getTongTien()) + "')";
    
    MyConn.excuteUpdate(qry);
}

public void xoa (String mapn) throws Exception{
        String qry = "Delete from phieunhap where maphieunhap ='" + mapn +"'";
        MyConn.excuteUpdate(qry);
}

public void sua (PhieuNhapDTO pn) throws Exception{
    String qry = "Update phieunhap SET ";
    qry += "ngaynhap = '" + pn.getNgayNhap() +"',";
    qry += "mancc = '" + pn.getMaNCC() + "',";
    qry += "manhanvien = '" + pn.getMaNV() + "',";
    qry += "tongtien = '" + pn.getTongTien()+ "' where maphieunhap ='" + pn.getMaPN() + "'";
    
    MyConn.excuteUpdate(qry);
}
}