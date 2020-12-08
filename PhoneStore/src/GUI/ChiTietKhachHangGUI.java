/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.KhachHangBUS;
import java.util.Vector;

/**
 *
 * @author ADmin
 */
public class ChiTietKhachHangGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietKhachHangGUI
     */
    
    private KhachHangBUS khachHangBUS;
    private KhachHangGUI root;
    private Vector khachHang;
    private SuaKhachHangGUI suaKhachHangGUI;
    
    public ChiTietKhachHangGUI() {
        suaKhachHangGUI = new SuaKhachHangGUI();
        initComponents();
        chiTietKHTextArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chiTietKHTextArea = new javax.swing.JTextArea();
        ContainerPanel = new javax.swing.JPanel();
        hoanTatButton = new javax.swing.JButton();
        suaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        rootPanel.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("SVN-Segoe Print", 1, 30)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 153, 0));
        titleLabel.setText("KHÁCH HÀNG");

        chiTietKHTextArea.setColumns(20);
        chiTietKHTextArea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        chiTietKHTextArea.setRows(5);
        jScrollPane1.setViewportView(chiTietKHTextArea);

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        hoanTatButton.setText("Hoàn tất");
        hoanTatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoanTatButtonActionPerformed(evt);
            }
        });

        suaButton.setText("Chỉnh sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(hoanTatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(hoanTatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(suaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(105, 105, 105))))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hoanTatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoanTatButtonActionPerformed
        // TODO add your handling code here:
        hoanTat();
    }//GEN-LAST:event_hoanTatButtonActionPerformed

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        // TODO add your handling code here:
        chinhSua();
    }//GEN-LAST:event_suaButtonActionPerformed

    private void hoanTat() {
        dispose();
        root.run();
    }
    
    private void chinhSua() {
        dispose();
        suaKhachHangGUI.run(this, khachHangBUS, khachHang);
    }
    
    private void loadData() {
        Vector khachHangMoi = khachHangBUS.getKhachHangByMaKhachHang(khachHang.get(0).toString()).get(0);
        chiTietKHTextArea.append("Mã khách hàng: ");
        chiTietKHTextArea.append(khachHangMoi.get(0).toString());
        chiTietKHTextArea.append("\n");
        chiTietKHTextArea.append("Tên khách hàng: ");
        chiTietKHTextArea.append(khachHangMoi.get(1).toString());
        chiTietKHTextArea.append("\n");
        chiTietKHTextArea.append("Địa chỉ: ");
        chiTietKHTextArea.append(khachHangMoi.get(2).toString());
        chiTietKHTextArea.append("\n");
        chiTietKHTextArea.append("Email: ");
        chiTietKHTextArea.append(khachHangMoi.get(3).toString());
        chiTietKHTextArea.append("\n");
        chiTietKHTextArea.append("Số điện thoại: ");
        chiTietKHTextArea.append(khachHangMoi.get(4).toString());
    }
    
    private void clearData() {
        chiTietKHTextArea.setText("");
    }
    
    public void run(KhachHangGUI root, KhachHangBUS khachHangBUS, Vector khachHang) {
        this.root = root;
        this.khachHangBUS = khachHangBUS;
        this.khachHang = khachHang;
        clearData();
        loadData();
        setVisible(true);
    }
    
    public void run() {
        clearData();
        loadData();
        setVisible(true);
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
            java.util.logging.Logger.getLogger(ChiTietKhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietKhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietKhachHangGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JTextArea chiTietKHTextArea;
    private javax.swing.JButton hoanTatButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton suaButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
