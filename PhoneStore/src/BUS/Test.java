/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.util.Vector;

/**
 *
 * @author ADmin
 */
public class Test {
    
    public static void main(String[] args) {
        KhachHangBUS BUS = new KhachHangBUS();
        Vector<Vector> result = BUS.getKhachHangByMaKhachHang("KH009");
        for (Vector vector : result) {
            BUS.toKhachHangDTO(vector).display();
        }
    }
    
}
