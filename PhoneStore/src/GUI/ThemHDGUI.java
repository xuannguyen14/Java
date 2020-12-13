/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.ChitiethoadonBUS;
import BUS.ChitietkhuyenmaiBUS;
import BUS.HoadonBUS;
import BUS.KhachhangBUS;
import BUS.Khuyenmai1BUS;
import BUS.NhanvienBUS;
import BUS.Sanpham1BUS;
import BUS.TaikhoanBUS;
import DTO.ChitiethoadonDTO;
import DTO.ChitietkhuyenmaiDTO;
import DTO.HoadonDTO;
import DTO.KhachhangDTO;
import DTO.Khuyenmai1DTO;
import DTO.NhanvienDTO;
import DTO.SanPhamDTO;
import DTO.TaikhoanDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class ThemHDGUI extends javax.swing.JFrame {

    HoadonDTO hoadon;
    ChitiethoadonDTO chitietHD;
    HoadonBUS hoadonBUS;
    Sanpham1BUS sanphamBUS;
    ChitietkhuyenmaiBUS chitietkhuyenmaiBUS;
    Khuyenmai1BUS khuyenmaiBUS;
    ChitiethoadonBUS chitiethoadonBUS;
    KhachhangBUS khachHangBUS;
    NhanvienBUS nhanvienBUS;
    DefaultTableModel defaultTableModel;
    TaikhoanDTO taikhoan;
    TaikhoanBUS taikhoanBUS;
    List<ChitiethoadonDTO> chitietHDs = new ArrayList<>();
    
    public ThemHDGUI(String username) throws Exception {
        
        initComponents();
        this.getContentPane().setBackground(Color.white);
        
        taikhoanBUS = new TaikhoanBUS();
        taikhoan = taikhoanBUS.getTaiKhoanByMaTK(username);
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            // ham ben duoi duoc xay dung de khong cho user edit du lieu, day nhu la mot anonymous
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tblSanpham.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("MÃ SẢN PHẨM");
        defaultTableModel.addColumn("TÊN SẢN PHẨM");
        defaultTableModel.addColumn("MÃ LOẠI");
        defaultTableModel.addColumn("MÃ NHÀ SẢN XUẤT");
        defaultTableModel.addColumn("SỐ LƯỢNG MUA");
        defaultTableModel.addColumn("ĐƠN GIÁ (Triệu đồng)");
        defaultTableModel.addColumn("THÀNH TIỀN (Triệu đồng)");
        
        loadData();
        
        //Them Popup cho usertable
        tblSanpham.setComponentPopupMenu(jPopupMenuDSHH);
        
        txtMaHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    txtMaKH.requestFocus();
                }
            }
        });
        
        txtMaKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    txtMaNV.requestFocus();
                }
            }
        });
        
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    comboboxMaSp.requestFocus();
                }
            }
        });
        
        comboboxMaSp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                    txtSoluong.requestFocus();
                }
            }
        });
    }
    private void loadData() throws Exception{
        //lấy ngày hiện tại
        txtNgayxuat.setText(String.valueOf(java.time.LocalDate.now()));
        
        sanphamBUS = new Sanpham1BUS();
        List<SanPhamDTO> sanphams = sanphamBUS.getAllSanpham();
        for(SanPhamDTO sanPham : sanphams){
            comboboxMaSp.addItem(sanPham.getMaSP());
        }
        
        khachHangBUS = new KhachhangBUS();
        List<KhachhangDTO> khachhangs = khachHangBUS.getAllKhachHang();
        for(KhachhangDTO khachhang : khachhangs){
            comboMaKH.addItem(khachhang.getMaKhachHang());
        }
        
        nhanvienBUS = new NhanvienBUS();
        List<NhanvienDTO> nhanviens = nhanvienBUS.showAll();
        for(NhanvienDTO nhanvien : nhanviens){
            comboMaNV.addItem(nhanvien.getmanv());
        }
    }
    
    private void loadDataTable(String maSP){
        DefaultTableModel model = (DefaultTableModel) tblSanpham.getModel();
        SanPhamDTO sanpham = new SanPhamDTO();
        sanpham = sanphamBUS.getSanphamBYMaSP(maSP);
        
        model.addRow(new Object[]{sanpham.getMaSP(), sanpham.getTenSP(), sanpham.getMaLoai(), sanpham.getMaNSX(),
            txtSoluong.getText(), sanpham.getDonGia(), txtThanhtien.getText()});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuDSHH = new javax.swing.JPopupMenu();
        jMenuItemXoa = new javax.swing.JMenuItem();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanpham = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnThoat3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtNgayxuat = new javax.swing.JTextField();
        comboMaNV = new javax.swing.JComboBox<>();
        comboMaKH = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JTextField();
        txtTongKM = new javax.swing.JTextField();
        txtTientra = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        comboboxMaSp = new javax.swing.JComboBox<>();
        txtTienKm = new javax.swing.JTextField();
        txtDongia = new javax.swing.JTextField();
        txtThanhtien = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        btnChonmua = new javax.swing.JButton();

        jMenuItemXoa.setText("Xóa");
        jMenuItemXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemXoaActionPerformed(evt);
            }
        });
        jPopupMenuDSHH.add(jMenuItemXoa);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm hóa đơn");
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel12.setBackground(new java.awt.Color(204, 255, 204));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 0));
        jLabel26.setText("THÊM HÓA ĐƠN");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel27.setText("Danh sách hàng hóa");

        tblSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanphamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSanpham);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon("D:\\Đồ án Java\\icon\\icon thêm.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat3.setBackground(new java.awt.Color(204, 255, 153));
        btnThoat3.setText("Trở lại");
        btnThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnThoat3))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(395, 395, 395))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem)
                .addGap(2, 2, 2)
                .addComponent(btnThoat3))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel28.setText("Thông tin chung");

        jPanel15.setBackground(new java.awt.Color(204, 255, 153));

        jLabel29.setText("Mã hóa đơn: ");

        jLabel30.setText("Ngày xuất:");

        jLabel31.setText("Mã khách hàng:");

        jLabel32.setText("Mã nhân viên: ");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        txtNgayxuat.setEditable(false);
        txtNgayxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayxuatActionPerformed(evt);
            }
        });

        comboMaNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        comboMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaNVActionPerformed(evt);
            }
        });

        comboMaKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        comboMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMaKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtNgayxuat)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtMaKH))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMaKH, 0, 75, Short.MAX_VALUE)
                    .addComponent(comboMaNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtNgayxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(204, 255, 153));
        jPanel16.setToolTipText("");

        jLabel34.setText("Tổng tiền: ");

        jLabel35.setText("Tổng khuyến mãi: ");

        jLabel36.setText("Tiền trả: ");

        txtTongtien.setEditable(false);
        txtTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongtienActionPerformed(evt);
            }
        });

        txtTongKM.setEditable(false);

        txtTientra.setEditable(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(362, 362, 362))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTientra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongKM, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTongKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(txtTientra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Chi tiết hóa đơn");

        jLabel21.setText("Mã sản phẩm: ");

        jLabel22.setText("Đơn giá: ");

        jLabel23.setText("Số lượng mua: ");

        jLabel24.setText("Thành tiền: ");

        jLabel25.setText("Tiền khuyến mãi: ");

        comboboxMaSp.setMaximumRowCount(50);
        comboboxMaSp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn sản phẩm" }));
        comboboxMaSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxMaSpActionPerformed(evt);
            }
        });

        txtTienKm.setEditable(false);
        txtTienKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKmActionPerformed(evt);
            }
        });

        txtDongia.setEditable(false);

        txtThanhtien.setEditable(false);
        txtThanhtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhtienActionPerformed(evt);
            }
        });

        txtSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongActionPerformed(evt);
            }
        });

        btnChonmua.setBackground(new java.awt.Color(204, 255, 153));
        btnChonmua.setText("Chọn mua");
        btnChonmua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonmuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienKm, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboboxMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtThanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChonmua)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(comboboxMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTienKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtThanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChonmua))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat3ActionPerformed
        // TODO add your handling code here:
        new HoadonGUI(taikhoan.getMaTK()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoat3ActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongtienActionPerformed

    // cách không cho combobox chọn trước: chọn cho edit -> thêm chữ chọn sản phẩm -> tắt cho edit
    private void comboboxMaSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxMaSpActionPerformed
        // TODO add your handling code here:
        SanPhamDTO sanpham = new SanPhamDTO();
        sanpham = sanphamBUS.getSanphamBYMaSP(String.valueOf(comboboxMaSp.getSelectedItem()));
        txtDongia.setText(String.valueOf(sanpham.getDonGia())); // lấy đơn giá của sản phẩm dc chọn
        

    }//GEN-LAST:event_comboboxMaSpActionPerformed

    private void txtNgayxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayxuatActionPerformed
        // TODO add your handling code here:
        txtNgayxuat.setText(String.valueOf(java.time.LocalDate.now()));
    }//GEN-LAST:event_txtNgayxuatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        hoadon = new HoadonDTO();
        hoadonBUS = new HoadonBUS();
        chitiethoadonBUS = new ChitiethoadonBUS();
        
        hoadon.setMaHD(txtMaHD.getText());
        hoadon.setNgayxuat(txtNgayxuat.getText());
        hoadon.setMaKH(txtMaKH.getText());
        hoadon.setMaNV(txtMaNV.getText());
        hoadon.setTongtien(tongtien);
        hoadon.setTongKM(tongkm);
        hoadon.setTientra(tientra);
        
        hoadonBUS.insertHoadon(hoadon);
        
        for(ChitiethoadonDTO CTHD : chitietHDs){
            chitiethoadonBUS.addChitietHoadon(CTHD); 
        }
        
        new HoadonGUI(taikhoan.getMaTK()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThemActionPerformed

    private float layTileKM(String maSP){
        ChitietkhuyenmaiDTO chitietkm = new ChitietkhuyenmaiDTO();
        Khuyenmai1DTO khuyenmai = new Khuyenmai1DTO();
        chitietkhuyenmaiBUS = new ChitietkhuyenmaiBUS();
        khuyenmaiBUS = new Khuyenmai1BUS();
        
        String maKM = chitietkhuyenmaiBUS.getMakmByMasp(maSP);// lấy mã khuyến mãi theo mã sản phẩm
        khuyenmai = khuyenmaiBUS.getKhuyenmaiByMaKM(maKM);//lấy khuyến mãi theo mã khuyến mãi bên trên
        
        chitietkm = chitietkhuyenmaiBUS.getTileKM(maKM, maSP);
        String ngayHT = txtNgayxuat.getText(); //lấy ngày hiện tại
        int tileKM = chitietkm.getTileKM();
        float dongia = Float.parseFloat(txtDongia.getText());

        //so sánh ngày hiện tại có trong khoảng được khuyến mãi hay không
        if(ngayHT.compareTo(khuyenmai.getNgayBD()) >= 0 && ngayHT.compareTo(khuyenmai.getNgayKT()) <= 0){
            return (tileKM * dongia / 100);
        }
        else{
            return 0;
        }
    }

    float tongtien = 0, tongkm = 0, tientra = 0;
    
    private void tinhTien(){
        tongtien += Float.parseFloat(txtThanhtien.getText()) + Float.parseFloat(txtTienKm.getText());
        tongkm += Float.parseFloat(txtTienKm.getText());
        tientra += Float.parseFloat(txtThanhtien.getText());
        
        txtTongtien.setText(String.valueOf(tongtien));
        txtTongKM.setText(String.valueOf(tongkm));
        txtTientra.setText(String.valueOf(tientra));
    }
    
    private void suaSoluong(String maSP, int check){
        SanPhamDTO sanpham = new SanPhamDTO();
        sanpham = sanphamBUS.getSanphamBYMaSP(String.valueOf(comboboxMaSp.getSelectedItem()));
        if(check == 1){
            sanpham.setSoLuong(sanpham.getSoLuong() - Integer.parseInt(txtSoluong.getText()));
            sanphamBUS.updateSoluongSP(sanpham);
        }
        else{
            sanpham.setSoLuong(sanpham.getSoLuong() + Integer.parseInt(txtSoluong.getText()));
            sanphamBUS.updateSoluongSP(sanpham);
        }
        
    }
    
    private void themChitiet(){
        chitietHD = new ChitiethoadonDTO();
        
        chitietHD.setMahd(txtMaHD.getText());
        chitietHD.setMasp(String.valueOf(comboboxMaSp.getSelectedItem()));
        chitietHD.setSoluongmua(Integer.parseInt(txtSoluong.getText()));
        chitietHD.setDongia(Float.parseFloat(txtDongia.getText()));
        chitietHD.setThanhtien(Float.parseFloat(txtThanhtien.getText()));
        chitietHD.setTienkm(Float.parseFloat(txtTienKm.getText()));

        chitietHDs.add(chitietHD);

    }
    
    private void txtSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongActionPerformed
        // TODO add your handling code here:
        float tienKM = layTileKM(String.valueOf(comboboxMaSp.getSelectedItem())) * Float.parseFloat(txtSoluong.getText());
        
        txtTienKm.setText(String.valueOf(tienKM));
        
        //thành tiền = đơn giá * số lượng - tiền khuyến mãi
        txtThanhtien.setText(String.valueOf(Float.parseFloat(txtDongia.getText()) * Float.parseFloat(txtSoluong.getText()) - tienKM));
        
    }//GEN-LAST:event_txtSoluongActionPerformed

    private void txtThanhtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThanhtienActionPerformed

    private void btnChonmuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonmuaActionPerformed
        // TODO add your handling code here:

        tinhTien();
        
        loadDataTable(String.valueOf(comboboxMaSp.getSelectedItem()));
        
        suaSoluong(String.valueOf(comboboxMaSp.getSelectedItem()), 1);
        
        themChitiet();

    }//GEN-LAST:event_btnChonmuaActionPerformed

    private void jMenuItemXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemXoaActionPerformed
        // TODO add your handling code here:
        int i = tblSanpham.getSelectedRow();
        chitietHDs.remove(i);
        defaultTableModel.removeRow(i);
        suaSoluong(String.valueOf(comboboxMaSp.getSelectedItem()), 0);
    }//GEN-LAST:event_jMenuItemXoaActionPerformed

    private void tblSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanphamMouseClicked
        // TODO add your handling code here:
        int i = tblSanpham.getSelectedRow();
        if(i >= 0){
            ChitiethoadonDTO chitietHD = new ChitiethoadonDTO();
            chitietHD = chitietHDs.get(i);
            //comboboxMaSp.setSelectedIndex(WIDTH);
            txtDongia.setText(String.valueOf(chitietHD.getDongia()));
            txtSoluong.setText(String.valueOf(chitietHD.getSoluongmua()));
            txtTienKm.setText(String.valueOf(chitietHD.getTienkm()));
            txtThanhtien.setText(String.valueOf(chitietHD.getThanhtien()));
        }
    }//GEN-LAST:event_tblSanphamMouseClicked

    private void comboMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaNVActionPerformed
        // TODO add your handling code here:
        txtMaNV.setText(String.valueOf(comboMaNV.getSelectedItem()));
    }//GEN-LAST:event_comboMaNVActionPerformed

    private void comboMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMaKHActionPerformed
        // TODO add your handling code here:
        txtMaKH.setText(String.valueOf(comboMaKH.getSelectedItem()));
    }//GEN-LAST:event_comboMaKHActionPerformed

    private void txtTienKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienKmActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ThemHDGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonmua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat3;
    private javax.swing.JComboBox<String> comboMaKH;
    private javax.swing.JComboBox<String> comboMaNV;
    private javax.swing.JComboBox<String> comboboxMaSp;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuItem jMenuItemXoa;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPopupMenu jPopupMenuDSHH;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblSanpham;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayxuat;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtThanhtien;
    private javax.swing.JTextField txtTienKm;
    private javax.swing.JTextField txtTientra;
    private javax.swing.JTextField txtTongKM;
    private javax.swing.JTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
