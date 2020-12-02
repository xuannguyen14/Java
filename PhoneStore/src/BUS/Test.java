/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.LoaiSanPhamDTO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ADmin
 */
public class Test {
    public static void main(String[] args) {
        NhaCungCapBUS nhaCungCapBUS = new NhaCungCapBUS();
        //nhaCungCapBUS.getNhaCungCapBySDT("190018876").display();
        Vector data = new Vector();
        data.add("Test");
        data.add("Test");
        data.add("Test");
        data.add("Test");
        nhaCungCapBUS.update(data, 3);
        ArrayList<NhaCungCapDTO> ds = nhaCungCapBUS.getDanhSachNhaCungCap();
        for (NhaCungCapDTO d : ds) {
            d.display();
        }
    }
}
