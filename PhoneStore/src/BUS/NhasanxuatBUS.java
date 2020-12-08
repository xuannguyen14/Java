/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;


import DAO.NhaSanXuatDAO;
import DTO.NhaSanXuatDTO;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author pc
 */
public class NhasanxuatBUS {
    private ArrayList<NhaSanXuatDTO> danhSachNhaSanXuat;
    private NhaSanXuatDAO nhaSanXuatDAO;
    
    
    public NhasanxuatBUS() {
        nhaSanXuatDAO = new NhaSanXuatDAO();
        danhSachNhaSanXuat = nhaSanXuatDAO.getDanhSachNhaSanXuat();
    }
    
    
    
    public ArrayList<NhaSanXuatDTO> getDanhSachNhaSX() {
        return danhSachNhaSanXuat;
    }
    
    public Vector<Vector> getDanhSachNhaSanXuat() {
        Vector<Vector> data = new Vector<>();
        for (NhaSanXuatDTO nhaSanXuat : danhSachNhaSanXuat) {
            Vector row = convertToVector(nhaSanXuat);
            data.add(row);
        }
        return data;
    }
    
    private Vector convertToVector(NhaSanXuatDTO nhaSanXuat) {
        Vector data = new Vector();
        data.add(nhaSanXuat.getMaNSX());
        data.add(nhaSanXuat.getTenNSX());
        data.add(nhaSanXuat.getDiaChi());
        data.add(nhaSanXuat.getSDT());
        return data;
    }
    
    public void add(Vector newData) {
        String maNhaSanXuatMoi = getMaNhaSanXuatMoi();
        String tenNhaSanXuatMoi = newData.get(1).toString();
        String diaChiNhaSanXuatMoi = newData.get(2).toString();
        String SDTNhaSanXuatMoi = newData.get(3).toString();
        NhaSanXuatDTO nhaSanXuatMoi = new NhaSanXuatDTO(maNhaSanXuatMoi, tenNhaSanXuatMoi, diaChiNhaSanXuatMoi, SDTNhaSanXuatMoi);
        nhaSanXuatDAO.add(nhaSanXuatMoi);
        danhSachNhaSanXuat.add(nhaSanXuatMoi);
    }
    
    public void delete(int index) {
        String maNhaSanXuat = getMaNhaSanXuatByIndex(index);
        nhaSanXuatDAO.deleteById(maNhaSanXuat);
        danhSachNhaSanXuat.remove(index);
    }
    
    public void update(Vector newData, int index) {
        String maNhaSanXuatMoi = getMaNhaSanXuatByIndex(index);
        String tenNhaSanXuatMoi = newData.get(1).toString();
        String diaChiNhaSanXuatMoi = newData.get(2).toString();
        String SDTNhaSanXuatMoi = newData.get(3).toString();
        NhaSanXuatDTO nhaSanXuatMoi = new NhaSanXuatDTO(maNhaSanXuatMoi, tenNhaSanXuatMoi, diaChiNhaSanXuatMoi, SDTNhaSanXuatMoi);
        nhaSanXuatDAO.update(nhaSanXuatMoi);
        danhSachNhaSanXuat.set(index, nhaSanXuatMoi);
    }
    
    public String getMaNhaSanXuatCuoi() {
        int numberOfNhaCC = danhSachNhaSanXuat.size();
        return danhSachNhaSanXuat.get(numberOfNhaCC - 1).getMaNSX();
    }
    
    public String getMaNhaSanXuatMoi() {
        String maNhaSanXuatCuoi = getMaNhaSanXuatCuoi();
        String duoiMaCuoi = maNhaSanXuatCuoi.substring(3, 5);
        int num = Integer.parseInt(duoiMaCuoi);
        ++num;
        String duoiMaMoi = num + "";
        while (duoiMaMoi.length() < 2) {
            duoiMaMoi = "0" + duoiMaMoi;
        }
        String maNhaSanXuatMoi = "nsx" + duoiMaMoi;
        return maNhaSanXuatMoi;
    }
    
    public String getMaNhaSanXuatByIndex(int index) {
        String maNhaSanXuat = danhSachNhaSanXuat.get(index).getMaNSX();
        return maNhaSanXuat;
    }
    
    public NhaSanXuatDTO getNhaSanXuatByMaNSX(String maNhaSanXuat) {
        while (maNhaSanXuat.length() < 2) {
            maNhaSanXuat = "0" + maNhaSanXuat;
        }
        if (maNhaSanXuat.length() == 2) {
            maNhaSanXuat = "nsx" + maNhaSanXuat;
        }
        NhaSanXuatDTO result = null;
        for (NhaSanXuatDTO nhaSanXuat : danhSachNhaSanXuat) {
            if (nhaSanXuat.getMaNSX().equals(maNhaSanXuat)) {
                result = nhaSanXuat;
            }
        }
        return result;
    }
    
    public Vector getNhaSanXuatByMaNhaSanXuat(String maNhaSanXuat) {
        if (getNhaSanXuatByMaNSX(maNhaSanXuat) == null) {
            return null;
        }
        return convertToVector(getNhaSanXuatByMaNSX(maNhaSanXuat));
    }
    
    public NhaSanXuatDTO getNhaSXBySDT(String SDT) {
        NhaSanXuatDTO result = null;
        for (NhaSanXuatDTO nhaSanXuat : danhSachNhaSanXuat) {
            if (nhaSanXuat.getSDT().contains(SDT.trim())) {
                result = nhaSanXuat;
            }
        }
        return result;
    }
    
    public Vector getNhaSanXuatBySDT(String SDT) {
        if (getNhaSXBySDT(SDT) == null) {
            return null;
        }
        return convertToVector(getNhaSXBySDT(SDT));
    }
    
    private boolean isCorrect(String tenNhaSanXuat, NhaSanXuatDTO nhaSanXuat) {
        String tenNSX = nhaSanXuat.getTenNSX().toLowerCase();
        tenNhaSanXuat = tenNhaSanXuat.toLowerCase();
        for (int i = 0; i < tenNhaSanXuat.length(); ++i) {
            if (tenNSX.indexOf(Character.toString(tenNhaSanXuat.charAt(i))) < 0) {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<NhaSanXuatDTO> getDanhSachNSXByTen(String tenNhaSanXuat) {
        ArrayList<NhaSanXuatDTO> result = new ArrayList<>();
        for (NhaSanXuatDTO nhaSanXuat : danhSachNhaSanXuat) {
            if (isCorrect(tenNhaSanXuat, nhaSanXuat)) {
                result.add(nhaSanXuat);
            }
        }
        if (result.size() == 0) {
            return null;
        }
        return result;
    }
    
    public Vector<Vector> getDanhSachNhaSanXuatByTen(String tenNhaSanXuat) {
        Vector<Vector> result = new Vector<>();
        for (NhaSanXuatDTO nhaSanXuat : danhSachNhaSanXuat) {
            if (isCorrect(tenNhaSanXuat, nhaSanXuat)) {
                Vector row = convertToVector(nhaSanXuat);
                result.add(row);
            }
        }
        if (result.size() == 0) {
            return null;
        }
        
        return result;
    }
    

}
