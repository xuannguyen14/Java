/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.ChitiethoadonBUS;
import BUS.HoadonBUS;
import DTO.HoadonDTO;
import java.awt.Color;
import java.lang.System.Logger;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class HoadonGUI extends javax.swing.JFrame {

    HoadonBUS hoadonBUS;
    ChitiethoadonBUS chitiethoadonBUS;
    DefaultTableModel defaultTableModel;
    
    public HoadonGUI() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        hoadonBUS = new HoadonBUS();
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            // ham ben duoi duoc xay dung de khong cho user edit du lieu, day nhu la mot anonymous
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tblHoaDon.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("MAHOADON");
        defaultTableModel.addColumn("NGAYXUAT");
        defaultTableModel.addColumn("MAKHACHHANG");
        defaultTableModel.addColumn("MANHANVIEN");
        defaultTableModel.addColumn("TONGTIEN (triệu đồng)");
        defaultTableModel.addColumn("TONGKM (triệu đồng)");
        defaultTableModel.addColumn("TIENTRA (triệu đồng)");
        
        setTableData(hoadonBUS.getAllHoadon());
        
        
    }
    
    private void setTableData(List<HoadonDTO> hoadons){
        for(HoadonDTO hoadon : hoadons){
            defaultTableModel.addRow(new Object[]{hoadon.getMaHD(), hoadon.getNgayxuat(), hoadon.getMaKH(), 
            hoadon.getMaNV(),hoadon.getTongtien(), hoadon.getTongKM(), hoadon.getTientra()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelChuyen = new javax.swing.JPanel();
        btnSanpham = new javax.swing.JButton();
        btnNhanvien = new javax.swing.JButton();
        btnKhuyenmai1 = new javax.swing.JButton();
        btnKhuyenmai2 = new javax.swing.JButton();
        btnKhuyenmai3 = new javax.swing.JButton();
        btnKhuyenmai4 = new javax.swing.JButton();
        btnBanhang = new javax.swing.JButton();
        btnNhaphang = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnLammoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnChitiet = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnTrangchu = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hóa đơn");

        panelChuyen.setBackground(new java.awt.Color(204, 255, 204));
        panelChuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

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
        btnKhuyenmai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenmai2ActionPerformed(evt);
            }
        });

        btnKhuyenmai3.setBackground(new java.awt.Color(204, 255, 153));
        btnKhuyenmai3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKhuyenmai3.setText("Tài khoản");
        btnKhuyenmai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenmai3ActionPerformed(evt);
            }
        });

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
        btnNhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaphangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChuyenLayout = new javax.swing.GroupLayout(panelChuyen);
        panelChuyen.setLayout(panelChuyenLayout);
        panelChuyenLayout.setHorizontalGroup(
            panelChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuyenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
        panelChuyenLayout.setVerticalGroup(
            panelChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuyenLayout.createSequentialGroup()
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 153));
        jLabel1.setFont(new java.awt.Font("SVN-Segoe Print", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFind)
                        .addComponent(btnFind)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        btnLammoi.setBackground(new java.awt.Color(255, 255, 255));
        btnLammoi.setText("Làm mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnChitiet.setBackground(new java.awt.Color(255, 255, 255));
        btnChitiet.setText("Xem chi tiết");
        btnChitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnChitiet)
                        .addGap(85, 85, 85)
                        .addComponent(btnThem)
                        .addGap(68, 68, 68)
                        .addComponent(btnXoa)
                        .addGap(87, 87, 87)
                        .addComponent(btnLammoi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnLammoi)
                    .addComponent(btnChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnThoat.setBackground(new java.awt.Color(204, 255, 153));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnThoat)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat))
                    .addComponent(panelChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        chitiethoadonBUS = new ChitiethoadonBUS();
        
        int row = tblHoaDon.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(HoadonGUI.this, "Vui lòng chọn hóa đơn trước", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(HoadonGUI.this,"Bạn có chắc chắn muốn xóa không?");

            if(confirm == JOptionPane.YES_OPTION){
                String maHD = String.valueOf(tblHoaDon.getValueAt(row, 0));

                chitiethoadonBUS.deleteCTHD(maHD);
                hoadonBUS.deleteHoadon(maHD);
                
                
                defaultTableModel.setRowCount(0);
                setTableData(hoadonBUS.getAllHoadon());
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        defaultTableModel.setRowCount(0);// xoa het du lieu hien tai

        //lay lai du lieu moi tu csdl
        setTableData(hoadonBUS.getAllHoadon());
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseClicked
        // TODO add your handling code here:        
                
    }//GEN-LAST:event_tblHoadonMouseClicked

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        String find = txtFind.getText();
        hoadonBUS = new HoadonBUS();
        model.setRowCount(0);
        List<HoadonDTO> hoadons = hoadonBUS.getAllHoadon();
        int check = 0;

        try {
            for(HoadonDTO hoadon : hoadons){
                if(hoadon.getMaHD().contains(find) || hoadon.getMaKH().contains(find) || hoadon.getMaNV().contains(find) || hoadon.getNgayxuat().contains(find) || (String.valueOf(hoadon.getTientra())).contains(find)) {
                    model.addRow(new Object[]{hoadon.getMaHD(), hoadon.getNgayxuat(), hoadon.getMaKH(), 
                    hoadon.getMaNV(),hoadon.getTongtien(), hoadon.getTongKM(), hoadon.getTientra()});
                    check = 1;
                }
            }
            
            if(check == 0){
                JOptionPane.showMessageDialog(HoadonGUI.this, "Không tìm thấy hóa đơn!!!", "Error", JOptionPane.ERROR_MESSAGE);
        
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new ThemHDGUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanvienActionPerformed
        try {
            new NhanvienGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanvienActionPerformed

    private void btnKhuyenmai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai1ActionPerformed
        try {
            new KhachHangGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnKhuyenmai1ActionPerformed

    private void btnBanhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanhangActionPerformed
        try {
            new HoadonGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBanhangActionPerformed

    private void btnSanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanphamActionPerformed
        try {
            new SanPhamGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); 
    }//GEN-LAST:event_btnSanphamActionPerformed

    private void btnKhuyenmai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai4ActionPerformed
        try {
            new KhuyenmaiGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); 
        
    }//GEN-LAST:event_btnKhuyenmai4ActionPerformed

    private void btnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangchuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrangchuActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        txtFind.setText("");
        defaultTableModel.setRowCount(0);

        setTableData(hoadonBUS.getAllHoadon());
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnChitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChitietActionPerformed
        // TODO add your handling code here:
        int row = tblHoaDon.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(HoadonGUI.this, "Vui lòng chọn hóa đơn trước", "Error", JOptionPane.ERROR_MESSAGE);   
        }
        else{
            String maHD = String.valueOf(tblHoaDon.getValueAt(row, 0));
            
            new ChitietHDGUI(maHD).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnChitietActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        new FindNC().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaphangActionPerformed
        try {
            new PhieuNhapGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnNhaphangActionPerformed

    private void btnKhuyenmai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai2ActionPerformed
        try {
            new ThongKeChiGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnKhuyenmai2ActionPerformed

    private void btnKhuyenmai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenmai3ActionPerformed
        try {
            new DSTaikhoanGUI().setVisible(true);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(HoadonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnKhuyenmai3ActionPerformed


    public static void main(String args[]) {
        new HoadonGUI().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanhang;
    private javax.swing.JButton btnChitiet;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnKhuyenmai1;
    private javax.swing.JButton btnKhuyenmai2;
    private javax.swing.JButton btnKhuyenmai3;
    private javax.swing.JButton btnKhuyenmai4;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnNhanvien;
    private javax.swing.JButton btnNhaphang;
    private javax.swing.JButton btnSanpham;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTrangchu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelChuyen;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}

