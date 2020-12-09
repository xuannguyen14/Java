/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachhangDAO;
import DTO.KhachhangDTO;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author pc
 */
public class KhachhangBUS {
    
    //Sử dụng kết nối CSDL
    private KhachhangDAO khachHangDAO;
    
    //Lưu trữ để tránh lấy lại nhiều lần tăng tốc độ xử lý
    private ArrayList<KhachhangDTO> danhSachKhachHang;
    
    public KhachhangBUS() {
        khachHangDAO = new KhachhangDAO();
        danhSachKhachHang = khachHangDAO.getDanhSachKhachHang();
    }
    
    //Thêm khách hàng mới từ view
    public void addKhachHang(Vector khachHangMoi) {
        
        //thêm mã khách hàng mới
        setMaKhachHangMoi(khachHangMoi);
        
        //Thêm vào CSDL
        khachHangDAO.addKhachHang(toKhachHangDTO(khachHangMoi));
        
        //Thêm vào danh sách hiện tại
        danhSachKhachHang.add(toKhachHangDTO(khachHangMoi));
    }
    
    //Xóa khách hàng 
    public void removeKhachHang(Vector khachHang) {
        
        //Lấy mã khách hàng
        String maKhachHang = khachHang.get(0).toString();
        
        //Xóa trong CSDL
        khachHangDAO.deleteKhachHang(maKhachHang);
        
        //Xóa trong danh sách hiện tại
        danhSachKhachHang.remove(toKhachHangDTO(khachHang));
    }
    
    //Chỉnh sửa thông tin khách hàng
    public void updateKhachHang(Vector khachHangCu, Vector khachHangMoi) {
        
        //Ép kiểu sang DTO
        KhachhangDTO khachHangMoiDTO = toKhachHangDTO(khachHangMoi);
        KhachhangDTO khachHangCuDTO = toKhachHangDTO(khachHangCu);
        
        //Update trong CSDL
        khachHangDAO.upadateKhachHang(khachHangMoiDTO);
        
        //Tìm chỉ số trong danh sách hiện tại
        int index = danhSachKhachHang.indexOf(khachHangCuDTO);
        
        //Update trong danh sách hiện tại
        danhSachKhachHang.set(index, khachHangMoiDTO);
    }
    
    //Lấy thông tin khách hàng theo mã
    public Vector<Vector> getKhachHangByMaKhachHang(String maKhachHang) {
        
        //Tạo danh sách lưu kết quả
        Vector<Vector> danhSachKhachHang = new Vector<>();
        
        //Xử lý khi chỉ nhập số
        while (maKhachHang.length() < 3) {
            maKhachHang = "0" + maKhachHang;
        }
        if (maKhachHang.length() == 3) {
            maKhachHang = "KH" + maKhachHang;
        }
        
        //Tìm kiếm trong danh sách khách hàng hiện tại
        for (KhachhangDTO khachHangDTO : this.danhSachKhachHang) {
            
            //Khách hàng có mã trùng với mã cần tìm thì đưa vào danh sách kết quả
            if (khachHangDTO.getMaKhachHang().equals(maKhachHang)) {
                danhSachKhachHang.add(toVectorData(khachHangDTO));
            }
        }
        
        return danhSachKhachHang;
    }
    
    //Lấy danh sách khách hàng hiện tại trả về kiểu Vector
    public Vector<Vector> getDanhSachKhachHang() {
        Vector<Vector> danhSachKhachHangKQ = new Vector<>();
        for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
            Vector row = toVectorData(khachHangDTO);
            danhSachKhachHangKQ.add(row);
        }
        return danhSachKhachHangKQ;
    }
    
    //Ép kiểu từ DTO -> Vector
    public Vector toVectorData(KhachhangDTO khachHang) {
        Vector result = new Vector();
        result.add(khachHang.getMaKhachHang());
        result.add(khachHang.getTenKhachHang());
        result.add(khachHang.getDiaChi());
        result.add(khachHang.getEmail());
        result.add(khachHang.getSDT());
        return result;
    }
    
    //Ép kiểu từ Vector -> DTO
    public KhachhangDTO toKhachHangDTO(Vector khachHang) {
        KhachhangDTO result = new KhachhangDTO();
        result.setMaKhachHang(khachHang.get(0).toString());
        result.setTenKhachHang(khachHang.get(1).toString());
        result.setDiaChi(khachHang.get(2).toString());
        result.setEmail(khachHang.get(3).toString());
        result.setSDT(khachHang.get(4).toString());
        return result;
    }
    
    //Thêm mã mới cho khách hàng mới
    private void setMaKhachHangMoi(Vector khachHangMoi) {
        
        //Tạo mã mới
        String maKhachHangMoi = createMaKhachHangMoi();
        
        //Thêm vào vị trí mã
        khachHangMoi.set(0, maKhachHangMoi);
    }
    
    //Lấy mã khách hàng cuỗi trong danh sách khách hàng hiện tại
    private String getMaKhachHangCuoi() {
        
        String maKhachHangCuoi = null;
        int soLuongKhachHang = danhSachKhachHang.size();
        
        //Kiểm tra nếu danh sách khách hàng hiện tại rỗng thì trả về null
        if (soLuongKhachHang > 0) {
            maKhachHangCuoi = danhSachKhachHang.get(soLuongKhachHang - 1).getMaKhachHang();
        }
        return maKhachHangCuoi;
        
    }
    
    //Tạo mã khách hàng mới
    private String createMaKhachHangMoi() {
        
        //Lấy mã khách hàng cuối
        String maKhachHangCuoi = getMaKhachHangCuoi();
        
        //Nếu mã cuối = null thì mã mới là KH001
        if (maKhachHangCuoi == null) {
            return "KH001";
        }
        
        //Lấy phần đuôi mã
        String duoiMaCuoi = maKhachHangCuoi.substring(2, 5);
        
        //Ép qua kiểu int
        int stt = Integer.parseInt(duoiMaCuoi);
        
        //Tăng lên 1
        ++stt;
        
        //Tạo ra đuôi mã mới length = 3
        String duoiMaMoi = stt + "";
        while (duoiMaMoi.length() < 3) {            
            duoiMaMoi = "0" + duoiMaMoi;
        }
        
        //Ghép thêm phần đầu mã vào
        return "KH" + duoiMaMoi;
    }
    
    //Xóa khoảng cách
    private String deleteSpace(String string) {
        
        //Trường hợp chuỗi = null
        if (string == null) {
            return null;
        }
        
        //Tạo biến kiểu StringBuilder để lưu kết quả
        StringBuilder result = new StringBuilder();
        
        //Lấy độ dài chuỗi
        int length = string.length();
        char charAtIndex;
        
        //Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < length; i++) {
            charAtIndex = string.charAt(i);
            
            //Nếu khác khoảng cách thì đưa vào kết quả
            if (charAtIndex != ' ') {
                result.append(charAtIndex);
            }
        }
        
        //Ép lại sang kiểu String
        return result.toString();
    }
    
//    private boolean tenIsCorrect(String tenKhachHang, KhachHangDTO khachHangDTO) {
//        String tenKH = khachHangDTO.getTenKhachHang().toLowerCase();
//        tenKhachHang = deleteSpace(tenKhachHang);
//        tenKhachHang = tenKhachHang.toLowerCase();
//        for (int i = 0; i < tenKhachHang.length(); ++i) {
//            if (tenKH.indexOf(Character.toString(tenKhachHang.charAt(i))) < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    
    
    //Lấy danh sách khách hàng theo tên
    public Vector<Vector> getDanhSachKhachHangByTen(String tenKhachHang) {
        
        //Tạo biến kiểu Vector để lưu kết quả
        Vector<Vector> danhSachKetQua = new Vector<>();
        
        //Nếu danh sách khách hàng hiện tại trống thì trả về danh sách rỗng
        if (danhSachKhachHang.size() == 0) {
            return danhSachKetQua;
        }
        
        //Loại bỏ dấu tiếng Việt
        tenKhachHang = VNCharacterUtils.removeAccent(tenKhachHang);
        
        //Xóa khoảng cách và chuyển thành chữ thường
        tenKhachHang = deleteSpace(tenKhachHang).toLowerCase();
        
        //Duyệt danh sách khách hàng hiện tại
        for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
            
            //Lấy tên từng khách hàng và bỏ dấu tiếng Việt
            String tenKH = VNCharacterUtils.removeAccent(khachHangDTO.getTenKhachHang());
            
            //Chuyển thành chữ thường
            tenKH = deleteSpace(tenKH).toLowerCase();
            
            //Nếu chứa tên khách hàng cần tìm kiếm thì đưa vào kết quả
            if (tenKH.contains(tenKhachHang)) {
                Vector khachHang = toVectorData(khachHangDTO);
                danhSachKetQua.add(khachHang);
            }
        }
        
        return danhSachKetQua;
    }
    
    //Lấy danh sách theo email
    public Vector<Vector> getDanhSachKhachHangByEmail(String emailKhachHang) {
        
        //Tạo biến kiểu Vector để lưu kết quả
        Vector<Vector> danhSachKetQua = new Vector<>();
        
        //Trả về danh sách rỗng nếu danh sách khách hàng hiện tại rỗng
        if (danhSachKhachHang.size() == 0) {
            return danhSachKetQua;
        }
        
        //Xử lý trường hợp nhập đầy đủ
        if (emailKhachHang.contains("@")) {
            
            //Duyệt danh sách khách hàng hiện tại
            for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
                
                //Lấy email từng khách hàng chuyển thành chữ thường nếu chứa email nhập vào thì thêm vào kết quả
                if (khachHangDTO.getEmail().toLowerCase().contains(emailKhachHang.toLowerCase())) {
                    danhSachKetQua.add(toVectorData(khachHangDTO));
                }
            }
        }
        
        //Xử lý trường hợp chỉ nhập tên
        else {
            
            //Chuyển thành chữ thường
            emailKhachHang = emailKhachHang.toLowerCase();
            
            //Duyệt danh sách khách hàng hiện tại
            for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
                
                //Lấy phần tên email từng khách hàng chuyển thành chữ thường nếu chứa tên nhập vào thì thêm vào kết quả
                if (khachHangDTO.getEmail().split("@")[0].toLowerCase().contains(emailKhachHang)) {
                    
                    //Ép kiểu sang Vector
                    danhSachKetQua.add(toVectorData(khachHangDTO));
                    
                }
            }
        }
        
        return danhSachKetQua;
    }
    
    //Lấy danh sách theo địa chỉ
    public Vector<Vector> getDanhSachKhachHangByDiaChi(String diaChiKhachHang) {
        
        //Tạo biến kiểu Vector để lưu kết quả
        Vector<Vector> danhSachKetQua = new Vector<>();
        
        //Trả về danh sách rỗng nếu danh sách khách hàng hiện tại rỗng
        if (danhSachKhachHang.size() == 0) {
            return danhSachKetQua;
        }
        
        //Bỏ dấu tiếng Việt địa chỉ nhập vào
        diaChiKhachHang = VNCharacterUtils.removeAccent(diaChiKhachHang);
        
        //Xóa khoảng cách và chuyển thành chữ thường
        diaChiKhachHang = deleteSpace(diaChiKhachHang).toLowerCase();
        
        //Duyệt danh sách khách hàng hiện tại
        for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
            
            //Lấy địa chỉ từng khách hàng xóa dấu tiếng Việt
            String diaChi = VNCharacterUtils.removeAccent(khachHangDTO.getDiaChi());
            
            //Xóa khoảng cách và chuyển thành chữ thường
            diaChi = deleteSpace(diaChi).toLowerCase();
            
            //Nếu chứa địa chỉ nhập vào thì ép kiểu sang Vector và thêm vào kết quả
            if (diaChi.contains(diaChiKhachHang)) {
                
                //Ép kiểu sang Vector
                Vector khachHang = toVectorData(khachHangDTO);
                
                //Thêm vào kết quả
                danhSachKetQua.add(khachHang);
            }
        }
        
        return danhSachKetQua;
    }
    
    //Lấy danh sách khách hàng theo SĐT trả về kiểu Vector
    public Vector<Vector> getDanhSachKhachHangBySDT(String SDTKhachHang) {
        
        //Tạo danh sách kết quả để lưu kết quả tìm kiếm có kiểu Vector
        Vector<Vector> danhSachKetQua = new Vector<>();
        
        //Trả về kết quả Vector rỗng nếu danh sách khách hàng hiện tại trống
        if (danhSachKhachHang.size() == 0) {
            return danhSachKetQua;
        }
        
        //Xóa khoảng cách của chuỗi đưa vào
        SDTKhachHang = deleteSpace(SDTKhachHang);
        
        //Duyệt hết danh sách khách hàng
        for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
            
            //Khách hàng có SĐT chứa chuỗi đã đưa vào thì thêm vào danh sách kết quả
            if (khachHangDTO.getSDT().contains(SDTKhachHang)) {
                danhSachKetQua.add(toVectorData(khachHangDTO));
            }
            
        }
        
        return danhSachKetQua;
    }
    
    //Dùng để kiểm tra danh sách khách hàng hiện có
    public void showDanhSachKhachHang() {
        for (KhachhangDTO khachHangDTO : danhSachKhachHang) {
            khachHangDTO.display();
        }
    }
    
    //Dùng để kiểm tra kết quả các chức năng tìm kiếm
    public void showKetQuaTimKiem(Vector<Vector> danhSachKetQua) {
        for (Vector ketQua : danhSachKetQua) {
            toKhachHangDTO(ketQua).display();
        }
    }
    
}
