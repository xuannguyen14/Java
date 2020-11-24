/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chitietkm.loadData;
import chitietkm.loadData.khuyenmaiBUS;
import chitietkm.loadData.khuyenmaiDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tat Gia Vi
 */
public class khuyenmaiGUI extends javax.swing.JFrame {

    public khuyenmaiGUI() {
        initComponents();
        showAll();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        makm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        masp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tenkm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tilekm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ngaybd = new javax.swing.JTextField();
        ngaykt = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        report = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Khuyến mãi");

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(list);

        add.setText("Thêm");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setText("Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        del.setText("Xóa");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã khuyến mãi:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên khuyến mãi:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tỉ lệ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ngày bắt đầu:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Ngày kết thúc:");

        find.setText("Tìm kiếm");

        report.setText("Thống kê");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenkm, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(makm))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tilekm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ngaybd)
                                    .addComponent(ngaykt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tilekm)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(makm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ngaybd)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(masp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ngaykt)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenkm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       DefaultTableModel tab= (DefaultTableModel) list.getModel();
       khuyenmaiBUS temp=new khuyenmaiBUS();
       khuyenmaiDTO km=new khuyenmaiDTO();
       km.setmakm(makm.getText());
       km.setmasp(masp.getText());
       km.settile(Integer.parseInt(tilekm.getText()));
       km.settenkm(tenkm.getText());
       km.setngaybd(ngaybd.getText());
       km.setngaykt(ngaykt.getText());
       khuyenmaiBUS.addkm(km);
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
       DefaultTableModel tab= (DefaultTableModel) list.getModel();
       khuyenmaiBUS temp=new khuyenmaiBUS();
       khuyenmaiDTO km=new khuyenmaiDTO();
       km.setmakm(makm.getText());
       km.settile(Integer.parseInt(tilekm.getText()));
       km.settenkm(tenkm.getText());
       km.setngaybd(ngaybd.getText());
       km.setngaykt(ngaykt.getText());
       khuyenmaiBUS.editkm(km);
    }//GEN-LAST:event_editActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
       DefaultTableModel tab= (DefaultTableModel) list.getModel();
       khuyenmaiBUS temp= new khuyenmaiBUS();
       khuyenmaiBUS.delkm(makm.getText());
    }//GEN-LAST:event_delActionPerformed
    public void showAll(){
        String[] col={"Mã khuyến mãi","Mã sản phẩm","Tỉ lệ khuyến mãi","Tên khuyến mãi","Ngày bắt đầu","Ngày kết thúc"};
        DefaultTableModel dtm=new DefaultTableModel(col,0);
        ArrayList<khuyenmaiDTO> arr=new ArrayList<khuyenmaiDTO>();
        arr= khuyenmaiBUS.showAllkm();
        khuyenmaiDTO km= new khuyenmaiDTO();
        for(int i=0;i<arr.size();i++){
            km=arr.get(i);
            String ma=km.getmakm();
            String masp=km.getmasp();
            int tile=km.gettile();
            String ten=km.gettenkm();
            String start=km.getngaybd();
            String end=km.getngaykt();
            Object[] row={ma,masp,tile,ten,start,end};
            dtm.addRow(row);
        }
        list.setModel(dtm);
        
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
            java.util.logging.Logger.getLogger(khuyenmai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(khuyenmai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(khuyenmai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(khuyenmai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new khuyenmaiGUI().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton del;
    private javax.swing.JButton edit;
    private javax.swing.JButton find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list;
    private javax.swing.JTextField makm;
    private javax.swing.JTextField masp;
    private javax.swing.JTextField ngaybd;
    private javax.swing.JTextField ngaykt;
    private javax.swing.JButton report;
    private javax.swing.JTextField tenkm;
    private javax.swing.JTextField tilekm;
    // End of variables declaration//GEN-END:variables
}