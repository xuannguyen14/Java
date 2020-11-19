/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham.SanPhamDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import quanlysanpham.SanPhamDTO;

/**
 *
 * @author PC
 */
public class SanPhamDAO {
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/phonestore";
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public SanPhamDAO() throws SQLException, ClassNotFoundException{
        if(conn == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url,user,password);    
            }
            catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL!");
            }
        }
    }

public ArrayList docDSSP() throws SQLException{
    ArrayList dssp = new ArrayList<>();

    String qry = "Select * From sanpham";
    st = conn.createStatement();
    rs = st.executeQuery(qry);
    while(rs.next()){
        SanPhamDTO sp = new SanPhamDTO();
        sp.setMaSP(rs.getString(1));
        sp.setTenSP(rs.getString(2));
        sp.setSoLuong(rs.getInt(3));
        sp.setDonGia(rs.getFloat(4));
        sp.setMaLoai(rs.getString(5));
        sp.setMaNSX(rs.getString(6));
        dssp.add(sp);
    }
        return dssp;
}

public void them (SanPhamDTO sp) throws SQLException{
    String qry = "Insert Into sanpham Values('";
    qry += sp.getMaSP() + "','";
    qry += sp.getTenSP() +"','";
    qry += sp.getSoLuong() + "','";
    qry += sp.getDonGia() + "','";
    qry += sp.getMaLoai() + "','";
    qry += sp.getMaNSX()+ "')";
    
    st = conn.createStatement();
    st.executeUpdate(qry);
}

public void xoa (String masp) throws SQLException{
        String qry = "Delete from sanpham where masp ='" + masp +"'";
        st = conn.createStatement();
        st.executeUpdate(qry);
}

}