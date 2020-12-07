/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BUS.SanphamBUS;
import DTO.SanPhamDTO;

/**
 *
 * @author PC
 */
public class SanPhamGUI extends javax.swing.JFrame {

    /**
     * Creates new form SanPham_Form
     */
    public SanPhamGUI() throws Exception {
        initComponents();
        
        SanphamBUS bus = new SanphamBUS();
        
        if(SanphamBUS.getDSSanPham() == null)
                bus.docDSSP();
        
        Vector header = new Vector();
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        header.add("Số Lượng");
        header.add("Đơn Giá");
        
        model = new DefaultTableModel(header,0);
        
        for(SanPhamDTO sp : SanphamBUS.getDSSanPham()){
            Vector row = new Vector();
            row.add(sp.getMaSP());
            row.add(sp.getTenSP());
            row.add(sp.getSoLuong());
            row.add(sp.getDonGia());
            model.addRow(row);
            }
        tbl_DSSP.setModel(model);

        txt_Find.requestFocus();
    }
    
    DefaultTableModel model = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DSSP = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBanhang = new javax.swing.JButton();
        btnNhaphang = new javax.swing.JButton();
        btnSanpham = new javax.swing.JButton();
        btnKhuyenmai = new javax.swing.JButton();
        btnNhanvien = new javax.swing.JButton();
        btnKhachhang = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        btnTaikhoan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnTrangchu = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Find = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        linkAdvancedSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tbl_DSSP.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tbl_DSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá"
            }
        ));
        tbl_DSSP.setRowHeight(24);
        jScrollPane1.setViewportView(tbl_DSSP);
        if (tbl_DSSP.getColumnModel().getColumnCount() > 0) {
            tbl_DSSP.getColumnModel().getColumn(1).setMinWidth(50);
        }

        btnThem.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 0, 20)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\icon thêm.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setFocusPainted(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 0, 20)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\xóa.png")); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setFocusPainted(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 0, 20)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\sửa.png")); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setFocusPainted(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(204, 255, 153));
        btnThoat.setText("Thoát");
        btnThoat.setFocusPainted(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnLammoi.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 0, 20)); // NOI18N
        btnLammoi.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\làm mới.png")); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.setFocusPainted(false);
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnThem)
                .addGap(30, 30, 30)
                .addComponent(btnXoa)
                .addGap(45, 45, 45)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnLammoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnBanhang.setBackground(new java.awt.Color(204, 255, 153));
        btnBanhang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBanhang.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\bán hàng.png")); // NOI18N
        btnBanhang.setText("Bán hàng");
        btnBanhang.setFocusPainted(false);

        btnNhaphang.setBackground(new java.awt.Color(204, 255, 153));
        btnNhaphang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhaphang.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\nhập hàng.png")); // NOI18N
        btnNhaphang.setText("Nhập hàng");
        btnNhaphang.setFocusPainted(false);

        btnSanpham.setBackground(new java.awt.Color(204, 255, 153));
        btnSanpham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSanpham.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\sản phẩm.png")); // NOI18N
        btnSanpham.setText("Sản phẩm");
        btnSanpham.setFocusPainted(false);

        btnKhuyenmai.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKhuyenmai.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\khuyến mãi1.png")); // NOI18N
        btnKhuyenmai.setText("Khuyến mãi");
        btnKhuyenmai.setFocusPainted(false);

        btnNhanvien.setBackground(new java.awt.Color(204, 255, 153));
        btnNhanvien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhanvien.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\nhân viên.png")); // NOI18N
        btnNhanvien.setText("Nhân viên");
        btnNhanvien.setFocusPainted(false);

        btnKhachhang.setBackground(new java.awt.Color(204, 255, 153));
        btnKhachhang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKhachhang.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\khách hàng.png")); // NOI18N
        btnKhachhang.setText("Khách hàng");
        btnKhachhang.setFocusPainted(false);

        btnThongke.setBackground(new java.awt.Color(204, 255, 153));
        btnThongke.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThongke.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\thống kê.png")); // NOI18N
        btnThongke.setText("Thống kê");
        btnThongke.setFocusPainted(false);

        btnTaikhoan.setBackground(new java.awt.Color(204, 255, 153));
        btnTaikhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTaikhoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Java\\PhoneStore\\src\\img\\icon\\tài khoản.png")); // NOI18N
        btnTaikhoan.setText("Tài khoản");
        btnTaikhoan.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhuyenmai)
                .addGap(18, 18, 18)
                .addComponent(btnNhanvien)
                .addGap(18, 18, 18)
                .addComponent(btnKhachhang)
                .addGap(18, 18, 18)
                .addComponent(btnThongke)
                .addGap(18, 18, 18)
                .addComponent(btnTaikhoan)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));

        btnTrangchu.setText("Trang chủ");
        btnTrangchu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        btnTrangchu.setFocusPainted(false);

        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản Lý Sản Phẩm");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_Find.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        btnTimkiem.setFont(new java.awt.Font("000 Blambot Casual [TeddyBear]", 0, 18)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        linkAdvancedSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkAdvancedSearch.setText("Nâng cao");
        linkAdvancedSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.MatteBorder(null)));
        linkAdvancedSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkAdvancedSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(txt_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkAdvancedSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Find)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(linkAdvancedSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        try {
            new ThemSPGUI().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
            
        model = (DefaultTableModel) tbl_DSSP.getModel();
        
        SanphamBUS bus = new SanphamBUS();
        
        int vitri = tbl_DSSP.getSelectedRow();
            
        if(vitri == -1) 
           JOptionPane.showMessageDialog(null, "Chưa chọn dòng cần xóa!");
        else{
            if(JOptionPane.showConfirmDialog(null,"Bạn muốn xóa sản phẩm này?","Xác nhận xóa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
           model.removeRow(vitri);

                try {
                    bus.xoa(vitri);
                } catch (Exception ex) {
                    Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        tbl_DSSP.setModel(model);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        model = (DefaultTableModel) tbl_DSSP.getModel();
        
        SanphamBUS bus = new SanphamBUS();        
        
        if(SanphamBUS.getDSSanPham() == null)

                try {
                    bus.docDSSP();
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        int vitri = tbl_DSSP.getSelectedRow();
        
        if(vitri == -1) 
           JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm muốn sửa!");
        else{            
            SanPhamDTO sp = SanphamBUS.getDSSanPham().get(vitri);
            new SuaSPGUI(sp).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        SanphamBUS bus = new SanphamBUS();
        ArrayList<SanPhamDTO> KetQua = new ArrayList<>();
        
        if(SanphamBUS.getDSSanPham() == null)

                try {
                    bus.docDSSP();
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String key = txt_Find.getText();

        try {
            KetQua = bus.timKiemTheoMaTenSP(key);
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        Vector header = new Vector();
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        header.add("Số Lượng");
        header.add("Đơn Giá");
        
        model = new DefaultTableModel(header,0);
        
        for(SanPhamDTO sp : KetQua){
            Vector row = new Vector();
            row.add(sp.getMaSP());
            row.add(sp.getTenSP());
            row.add(sp.getSoLuong());
            row.add(sp.getDonGia());
            model.addRow(row);
            }
        tbl_DSSP.setModel(model);
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        SanphamBUS bus = new SanphamBUS();
        
        if(SanphamBUS.getDSSanPham() == null)

                try {
                    bus.docDSSP();
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        Vector header = new Vector();
        header.add("Mã Sản Phẩm");
        header.add("Tên Sản Phẩm");
        header.add("Số Lượng");
        header.add("Đơn Giá");
        
        model = new DefaultTableModel(header,0);
        
        for(SanPhamDTO sp : SanphamBUS.getDSSanPham()){
            Vector row = new Vector();
            row.add(sp.getMaSP());
            row.add(sp.getTenSP());
            row.add(sp.getSoLuong());
            row.add(sp.getDonGia());
            model.addRow(row);
            }
        tbl_DSSP.setModel(model);
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void linkAdvancedSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkAdvancedSearchMouseClicked
        try {
            new AdvancedSearchGUI().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_linkAdvancedSearchMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SanPhamGUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SanPhamGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanhang;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnKhachhang;
    private javax.swing.JButton btnKhuyenmai;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnNhanvien;
    private javax.swing.JButton btnNhaphang;
    private javax.swing.JButton btnSanpham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaikhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongke;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnTrangchu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel linkAdvancedSearch;
    private javax.swing.JTable tbl_DSSP;
    private javax.swing.JTextField txt_Find;
    // End of variables declaration//GEN-END:variables
}
