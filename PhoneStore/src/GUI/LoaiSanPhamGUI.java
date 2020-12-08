/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LoaiSanPhamBUS;
import DTO.LoaiSanPhamDTO;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADmin
 */
public class LoaiSanPhamGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoaiSanPhamGUI
     */
    
    private DefaultTableModel model;
    private LoaiSanPhamBUS loaiSanPhamBUS;
    private ArrayList<LoaiSanPhamDTO> danhSachLoaiSanPham;
    private ThemLoaiSanPhamGUI themLoaiSanPhamGUI;
    private SuaLoaiSanPhamGUI suaLoaiSanPhanGUI;
    private int luaChonLoc = 0;
    
    public LoaiSanPhamGUI() {
        themLoaiSanPhamGUI = new ThemLoaiSanPhamGUI(this);
        suaLoaiSanPhanGUI = new SuaLoaiSanPhamGUI(this);
        initComponents();
        loaiSanPhamBUS = new LoaiSanPhamBUS();
        danhSachLoaiSanPham = loaiSanPhamBUS.getDanhSachLoaiSanPham();
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

        headPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        leftPanel = new javax.swing.JPanel();
        themButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        midPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        searchTextfield = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        tableContainer = new javax.swing.JScrollPane();
        loaiSanPhamTable = new javax.swing.JTable();
        boLocComboBox = new javax.swing.JComboBox<>();
        lamMoiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        headPanel.setBackground(new java.awt.Color(204, 255, 204));

        homeButton.setText("Trang chủ");

        logoutButton.setText("Đăng xuất");

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(logoutButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftPanel.setBackground(new java.awt.Color(204, 255, 204));

        themButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        themButton.setText("Thêm");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        suaButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suaButton.setText("Sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        xoaButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        xoaButton.setText("Xóa ");
        xoaButton.setActionCommand("Xóa loại");
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(suaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xoaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
        );

        midPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("SVN-Segoe Print", 1, 30)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 153, 0));
        titleLabel.setText("LOẠI SẢN PHẨM");

        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        loaiSanPhamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        loaiSanPhamTable.setRowHeight(24);
        tableContainer.setViewportView(loaiSanPhamTable);

        boLocComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boLocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo mã", "Theo tên", " ", " " }));
        boLocComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boLocComboBoxActionPerformed(evt);
            }
        });

        lamMoiButton.setText("Làm mới");
        lamMoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamMoiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midPanelLayout.createSequentialGroup()
                .addComponent(boLocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lamMoiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(tableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boLocComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamMoiButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(758, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        // TODO add your handling code here:

        int rowIsSelected = loaiSanPhamTable.getSelectedRow();

        if (rowIsSelected >= 0) {
            Vector data = getDataInTableAt(rowIsSelected);
            suaLoaiSanPhanGUI.run(data, rowIsSelected);
            //JOptionPane.showMessageDialog(this, data.get(0).toString() + "  " + data.get(1).toString() + "  " + rowIsSelected);

        }
        else {
            JOptionPane.showMessageDialog(this, "Chọn loại sản phẩm cần sửa!");
        }
    }//GEN-LAST:event_suaButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        // TODO add your handling code here:
        int index = loaiSanPhamTable.getSelectedRow();
        if (index >= 0) {
            model.removeRow(index);
            loaiSanPhamTable.setModel(model);
            loaiSanPhamBUS.deleteLoaiSanPham(index);
        }
        else {
            JOptionPane.showMessageDialog(this, "Chọn loại sản phẩm cần xóa!");
        }
    }//GEN-LAST:event_xoaButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        themLoaiSanPhamGUI.setVisible(true);
    }//GEN-LAST:event_themButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boLocComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boLocComboBoxActionPerformed
        // TODO add your handling code here:
        luaChonLoc = boLocComboBox.getSelectedIndex();
    }//GEN-LAST:event_boLocComboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if (searchTextfield.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin cần tìm kiếm!");
        }
        else {
            
            if (luaChonLoc >= 0) {
                if (luaChonLoc == 0) {
                    String maLoai = searchTextfield.getText();
                    if (loaiSanPhamBUS.getLoaiSanPhamById(maLoai) == null) {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
                    }
                    else {
                        String tenLoai = loaiSanPhamBUS.getLoaiSanPhamById(maLoai).getTenLoai();
                        maLoai = loaiSanPhamBUS.getLoaiSanPhamById(maLoai).getMaLoai();
                        //JOptionPane.showMessageDialog(this, luaChonLoc + "  " + maLoai);
                        Vector data = new Vector();
                        data.add(maLoai);
                        data.add(tenLoai);
                        showRowInTable(data);
                    }

                } else {
                    String tenLoai = searchTextfield.getText();
                    if(loaiSanPhamBUS.getDanhSachLoaiSanPhamSearchByName(tenLoai) == null) {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào!");
                    }
                    else {
                        int numberOfRow = loaiSanPhamBUS.getDanhSachLoaiSanPhamSearchByName(tenLoai).size();
                        Vector<Vector> data = new Vector();
                        for (int index = 0; index < numberOfRow; ++index) {
                            Vector row = new Vector();
                            String maLoai = loaiSanPhamBUS.getDanhSachLoaiSanPhamSearchByName(tenLoai).get(index).getMaLoai();
                            String tenLoaiMoi = loaiSanPhamBUS.getDanhSachLoaiSanPhamSearchByName(tenLoai).get(index).getTenLoai();
                            row.add(maLoai);
                            row.add(tenLoaiMoi);
                            data.add(row);
                        }
                        showResultSearchTable(data);
                    }
                }

            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void lamMoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamMoiButtonActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_lamMoiButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void loadData() {
        addHeaderTable();
        for (LoaiSanPhamDTO loaiSanPham : danhSachLoaiSanPham) {
            Vector row = new Vector();
            row.add(loaiSanPham.getMaLoai());
            row.add(loaiSanPham.getTenLoai());
            model.addRow(row);
        }
        loaiSanPhamTable.setModel(model);
    }
    
    public void addHeaderTable() {
        loaiSanPhamTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
        Vector header = new Vector();
        header.add("Mã loại");
        header.add("Tên loại");
        model = new DefaultTableModel(header, 0);
        loaiSanPhamTable.setModel(model);
    }
    
    public void addNewRow(Vector newRow) {
        newRow.set(0, loaiSanPhamBUS.getNextId());
        loaiSanPhamBUS.addLoaiSanPham(newRow);
        model.addRow(newRow);
        loaiSanPhamTable.setModel(model);
    }
    
    public void updateNewRow(Vector newRow, int index) {
        if (index >= 0) {
            newRow.set(0, loaiSanPhamBUS.getIdAt(index));
            loaiSanPhamBUS.updateLoaiSanPham(newRow, index);
            updateNewRowInModel(newRow, index);
        }
    }
    
    public void removeRowAt(int index) {
        Vector removeRow = new Vector();
        String maLoai = model.getValueAt(index, 0).toString();
    }
    
    private void updateNewRowInModel(Vector newRow, int index) {
        int numberOfColumn = 2;
        for (int i = 0; i < numberOfColumn; ++i) {
            model.setValueAt(newRow.get(i).toString(), index, i);
        }
        loaiSanPhamTable.setModel(model);
    }
    
    private Vector getDataInTableAt(int index) {
        Vector data = new Vector();
        int numberOfColumn = 2;
        for (int column = 0; column < numberOfColumn; ++column) {
            String value = model.getValueAt(index, column).toString();
            data.add(value);
        }
        return data;
    }
    

    
    private void showRowInTable(Vector row) {
        addHeaderTable();
        model.addRow(row);
        loaiSanPhamTable.setModel(model);
    }
    
    private void showResultSearchTable(Vector<Vector> rows) {
        addHeaderTable();
        for (Vector row : rows) {
            model.addRow(row);
        }
        loaiSanPhamTable.setModel(model);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(LoaiSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaiSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaiSanPhamGUI().setVisible(true);
            }
        });
    }
    

    

    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boLocComboBox;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton lamMoiButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTable loaiSanPhamTable;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel midPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextfield;
    private javax.swing.JButton suaButton;
    private javax.swing.JScrollPane tableContainer;
    private javax.swing.JButton themButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton xoaButton;
    // End of variables declaration//GEN-END:variables
}
