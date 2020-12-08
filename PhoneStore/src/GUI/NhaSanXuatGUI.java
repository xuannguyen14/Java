/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.NhasanxuatBUS;
import java.awt.Font;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADmin
 */
public class NhaSanXuatGUI extends javax.swing.JFrame {
    
    private ThemNhaSanXuatGUI themNhaSanXuatGUI;
    private SuaNhaSanXuatGUI suaNhaSanXuatGUI;
    private NhasanxuatBUS nhaSanXuatBUS;
    private int luaChonLoc = 0;
    private DefaultTableModel model;

    /**
     * Creates new form NhaSanXuatGUI
     */
    public NhaSanXuatGUI() {
        themNhaSanXuatGUI = new ThemNhaSanXuatGUI();
        suaNhaSanXuatGUI = new SuaNhaSanXuatGUI();
        nhaSanXuatBUS = new NhasanxuatBUS();
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnSanpham = new javax.swing.JButton();
        btnNhanvien = new javax.swing.JButton();
        btnKhuyenmai1 = new javax.swing.JButton();
        btnKhuyenmai2 = new javax.swing.JButton();
        btnKhuyenmai3 = new javax.swing.JButton();
        btnKhuyenmai4 = new javax.swing.JButton();
        btnBanhang = new javax.swing.JButton();
        btnNhaphang = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnTrangchu = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        topPanel16 = new javax.swing.JPanel();
        titleLabel16 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchTextfield = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        thoatButton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        suaButton5 = new javax.swing.JButton();
        xoaButton5 = new javax.swing.JButton();
        themButton5 = new javax.swing.JButton();
        lamMoiButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nhaSanXuatTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        leftPanel.setBackground(new java.awt.Color(204, 255, 204));
        leftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnSanpham.setBackground(new java.awt.Color(204, 255, 153));
        btnSanpham.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSanpham.setText("Sản phẩm");
        btnSanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanphamActionPerformed(evt);
            }
        });

        btnNhanvien.setBackground(new java.awt.Color(204, 255, 153));
        btnNhanvien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNhanvien.setText("Nhân viên");
        btnNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanvienActionPerformed(evt);
            }
        });

        btnKhuyenmai1.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKhuyenmai1.setText("Khách hàng");
        btnKhuyenmai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenmai1ActionPerformed(evt);
            }
        });

        btnKhuyenmai2.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKhuyenmai2.setText("Thống kê");

        btnKhuyenmai3.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKhuyenmai3.setText("Tài khoản");

        btnKhuyenmai4.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKhuyenmai4.setText("Khuyến mãi");
        btnKhuyenmai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenmai4ActionPerformed(evt);
            }
        });

        btnBanhang.setBackground(new java.awt.Color(204, 255, 153));
        btnBanhang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBanhang.setText("Bán hàng");
        btnBanhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanhangActionPerformed(evt);
            }
        });

        btnNhaphang.setBackground(new java.awt.Color(204, 255, 153));
        btnNhaphang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNhaphang.setText("Nhập hàng");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenmai4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhuyenmai4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhuyenmai1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhuyenmai2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhuyenmai3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        btnTrangchu.setBackground(new java.awt.Color(204, 255, 153));
        btnTrangchu.setText("Trang chủ");
        btnTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangchuActionPerformed(evt);
            }
        });

        btnDangxuat.setBackground(new java.awt.Color(204, 255, 153));
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(798, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrangchu)
                    .addComponent(btnDangxuat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topPanel16.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel16.setBackground(new java.awt.Color(204, 255, 153));
        titleLabel16.setFont(new java.awt.Font("SVN-Segoe Print", 1, 30)); // NOI18N
        titleLabel16.setForeground(new java.awt.Color(0, 153, 0));
        titleLabel16.setText("NHÀ SẢN XUẤT");

        javax.swing.GroupLayout topPanel16Layout = new javax.swing.GroupLayout(topPanel16);
        topPanel16.setLayout(topPanel16Layout);
        topPanel16Layout.setHorizontalGroup(
            topPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanel16Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(titleLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanel16Layout.setVerticalGroup(
            topPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextfieldActionPerformed(evt);
            }
        });

        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(124, 124, 124))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTextfield)
                        .addComponent(searchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thoatButton.setText("Thoát");
        thoatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 804, Short.MAX_VALUE)
                .addComponent(thoatButton))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(thoatButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        suaButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        suaButton5.setText("Sửa");
        suaButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButton5ActionPerformed(evt);
            }
        });

        xoaButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        xoaButton5.setText("Xóa");
        xoaButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButton5ActionPerformed(evt);
            }
        });

        themButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        themButton5.setText("Thêm");
        themButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButton5ActionPerformed(evt);
            }
        });

        lamMoiButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lamMoiButton5.setText("Làm mới");
        lamMoiButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamMoiButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lamMoiButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(themButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(xoaButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(suaButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(themButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(lamMoiButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(suaButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nhaSanXuatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(nhaSanXuatTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(topPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSanphamActionPerformed

    private void btnNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanvienActionPerformed

    private void btnKhuyenmai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhuyenmai1ActionPerformed

    private void btnKhuyenmai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhuyenmai4ActionPerformed

    private void btnBanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanhangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBanhangActionPerformed

    private void btnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangchuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrangchuActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void searchTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextfieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        timKiem();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void thoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_thoatButtonActionPerformed

    private void suaButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButton5ActionPerformed
        // TODO add your handling code here:
        sua();
    }//GEN-LAST:event_suaButton5ActionPerformed

    private void xoaButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButton5ActionPerformed
        // TODO add your handling code here:
        xoa();
    }//GEN-LAST:event_xoaButton5ActionPerformed

    private void themButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButton5ActionPerformed
        // TODO add your handling code here:
        them();
    }//GEN-LAST:event_themButton5ActionPerformed

    private void lamMoiButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamMoiButton5ActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_lamMoiButton5ActionPerformed

    public void addHeaderTable() {
        nhaSanXuatTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
        Vector header = new Vector();
        header.add("Mã NSX");
        header.add("Tên NSX");
        header.add("Địa chỉ");
        header.add("SĐT");
        model = new DefaultTableModel(header, 0);
        nhaSanXuatTable.setModel(model);
    }
    
    public void loadData() {
        Vector<Vector> allData = nhaSanXuatBUS.getDanhSachNhaSanXuat();
        showResultSearchTable(allData);
    }
    
    private void showResultSearchTable(Vector<Vector> rows) {
        addHeaderTable();
        for (Vector row : rows) {
            model.addRow(row);
        }
        nhaSanXuatTable.setModel(model);
    }
    
    private void removeRowAt(int index) {
        model.removeRow(index);
        nhaSanXuatTable.setModel(model);
    }
    
    public void addNewRow(Vector newRow) {
        String maNhaSanXuatMoi = nhaSanXuatBUS.getMaNhaSanXuatMoi();
        newRow.set(0, maNhaSanXuatMoi);
        model.addRow(newRow);
        nhaSanXuatBUS.add(newRow);
        nhaSanXuatTable.setModel(model);
    }
    
    public void updateNewRow(Vector newRow, int rowIsSelected) {
        nhaSanXuatBUS.update(newRow, rowIsSelected);
        model.setValueAt(newRow.get(1).toString(), rowIsSelected, 1);
        model.setValueAt(newRow.get(2).toString(), rowIsSelected, 2);
        model.setValueAt(newRow.get(3).toString(), rowIsSelected, 3);
    }
    
    private void show1Row(Vector row) {
        addHeaderTable();
        model.addRow(row);
        nhaSanXuatTable.setModel(model);
    }
    
    private Vector getRowAt(int index) {
        Vector row = new Vector();
        row.add(model.getValueAt(index, 0));
        row.add(model.getValueAt(index, 1));
        row.add(model.getValueAt(index, 2));
        row.add(model.getValueAt(index, 3));
        return row;
    }
    
    public void run() {
        setVisible(true);
    }
    
    private void them() {
        dispose();
        themNhaSanXuatGUI.run(this);
    }
    
    private void xoa() {
        int rowIsSelected = nhaSanXuatTable.getSelectedRow();
        if (rowIsSelected >= 0) {
            nhaSanXuatBUS.delete(rowIsSelected);
            removeRowAt(rowIsSelected);
        }
        else {
            JOptionPane.showMessageDialog(this, "Chọn nhà cung cấp cần xóa!");
        }
    }
    
    private void sua() {
        int rowIsSelected = nhaSanXuatTable.getSelectedRow();
        if (rowIsSelected < 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn nhà cung cấp cần sửa!");
            return;
        }
        Vector data = getRowAt(rowIsSelected);
        suaNhaSanXuatGUI.run(this, data, rowIsSelected);
        dispose();
    }
    
    private void timKiem() {
        String maNhaSanXuat = searchTextfield.getText();
        if (nhaSanXuatBUS.getNhaSanXuatByMaNhaSanXuat(maNhaSanXuat) != null) {
            Vector data = nhaSanXuatBUS.getNhaSanXuatByMaNhaSanXuat(maNhaSanXuat);
            show1Row(data);
            return;
        }
        String tenNhaSanXuat = searchTextfield.getText();
        if (nhaSanXuatBUS.getDanhSachNhaSanXuatByTen(tenNhaSanXuat) != null) {
            Vector<Vector> data = nhaSanXuatBUS.getDanhSachNhaSanXuatByTen(tenNhaSanXuat);
            showResultSearchTable(data);
            return;
        }
        String SDT = searchTextfield.getText();
        if (nhaSanXuatBUS.getNhaSXBySDT(SDT) != null) {
            Vector data = nhaSanXuatBUS.getNhaSanXuatBySDT(SDT);
            show1Row(data);
            return;
        }


    }
    
    private void timKiemCu() {
                if (searchTextfield.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập từ khóa cần tìm kiếm!");
            return;
        }
        if (luaChonLoc == 0) {
            String maNhaSanXuat = searchTextfield.getText();
            if (nhaSanXuatBUS.getNhaSanXuatByMaNhaSanXuat(maNhaSanXuat) == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
                return;
            }
            Vector data = nhaSanXuatBUS.getNhaSanXuatByMaNhaSanXuat(maNhaSanXuat);
            show1Row(data);
            return;
        }
        if (luaChonLoc == 2) {
            String SDT = searchTextfield.getText();
            if (nhaSanXuatBUS.getNhaSXBySDT(SDT) == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
                return;
            }
            Vector data = nhaSanXuatBUS.getNhaSanXuatBySDT(SDT);
            show1Row(data);
            return;
        }
        if (luaChonLoc == 1) {
            String tenNhaSanXuat = searchTextfield.getText();
            if (nhaSanXuatBUS.getDanhSachNhaSanXuatByTen(tenNhaSanXuat) == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
                return;
            }
            Vector<Vector> data = nhaSanXuatBUS.getDanhSachNhaSanXuatByTen(tenNhaSanXuat);
            showResultSearchTable(data);
            return;
        }
    }
    
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
            java.util.logging.Logger.getLogger(NhaSanXuatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaSanXuatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaSanXuatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaSanXuatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhaSanXuatGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanhang;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnKhuyenmai1;
    private javax.swing.JButton btnKhuyenmai2;
    private javax.swing.JButton btnKhuyenmai3;
    private javax.swing.JButton btnKhuyenmai4;
    private javax.swing.JButton btnNhanvien;
    private javax.swing.JButton btnNhaphang;
    private javax.swing.JButton btnSanpham;
    private javax.swing.JButton btnTrangchu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lamMoiButton5;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTable nhaSanXuatTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextfield;
    private javax.swing.JButton suaButton5;
    private javax.swing.JButton themButton5;
    private javax.swing.JButton thoatButton;
    private javax.swing.JLabel titleLabel16;
    private javax.swing.JPanel topPanel16;
    private javax.swing.JButton xoaButton5;
    // End of variables declaration//GEN-END:variables
}
