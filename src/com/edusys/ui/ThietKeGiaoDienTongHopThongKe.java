/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.EntityKhoaHoc;
import com.edusys.helper.Auth;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 10
 */
public class ThietKeGiaoDienTongHopThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThietKeGiaoDienTongHopThongKe
     */
    public ThietKeGiaoDienTongHopThongKe() {
        initComponents();
        int index = 0;
        jTabbedPane1.setSelectedIndex(index);
        init();
    }
    void ThietKeGiaoDienTongHopThongKe() {
        
    }
    public void selectTab(int index){
        jTabbedPane1.setSelectedIndex(index);
    }
     void init(){
        setLocationRelativeTo(null);  
        fillcomboboxkhoahoc();
        filltableBangDiem();
        fillTableLuongNguoiHoc();
        fillTableDiemChuyenDe();
        fillcomboboxNam();
        fillTableDoanhThu();
        
        this.selectTab(0);
        // không phải trưởng phòng xóa tabs 4
        if(!Auth.isManager())
        {
            jTabbedPane1.remove(3);
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

        tabs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlBangDiem = new javax.swing.JPanel();
        lblKhoaHoc = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        pnlTongHopDiem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTongHopDiem = new javax.swing.JTable();
        pnlDoanhThu = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabs.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        lblKhoaHoc.setText("Khóa học");

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NGƯỜI HỌC", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ));
        tblBangDiem.setRowHeight(25);
        jScrollPane2.setViewportView(tblBangDiem);

        javax.swing.GroupLayout pnlBangDiemLayout = new javax.swing.GroupLayout(pnlBangDiem);
        pnlBangDiem.setLayout(pnlBangDiemLayout);
        pnlBangDiemLayout.setHorizontalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhoaHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        pnlBangDiemLayout.setVerticalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhoaHoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BẢNG ĐIỂM", pnlBangDiem);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NĂM", "SỐ NGƯỜI HỌC", "ĐẦU TIÊN", "SAU CÙNG"
            }
        ));
        tblNguoiHoc.setFillsViewportHeight(true);
        tblNguoiHoc.setRowHeight(25);
        jScrollPane1.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("NGƯỜI HỌC", pnlNguoiHoc);

        tblTongHopDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "TỔNG SỐ HỌC VIÊN", "CAO NHẤT", "THẤP NHẤT", "ĐIỂM TRUNG BÌNH"
            }
        ));
        tblTongHopDiem.setRowHeight(25);
        jScrollPane3.setViewportView(tblTongHopDiem);

        javax.swing.GroupLayout pnlTongHopDiemLayout = new javax.swing.GroupLayout(pnlTongHopDiem);
        pnlTongHopDiem.setLayout(pnlTongHopDiemLayout);
        pnlTongHopDiemLayout.setHorizontalGroup(
            pnlTongHopDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        pnlTongHopDiemLayout.setVerticalGroup(
            pnlTongHopDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("TỔNG HỢP ĐIỂM", pnlTongHopDiem);

        lblNam.setText("Năm");

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KHÓA HỌC", "SỐ HỌC VIÊN", "DOANH THU", "HP CAO NHẤT", "HP THẤP NHẤT", "HP TRUNG BÌNH"
            }
        ));
        tblDoanhThu.setRowHeight(25);
        jScrollPane4.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNam)
                .addGap(18, 18, 18)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNam)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DOANH THU", pnlDoanhThu);

        javax.swing.GroupLayout tabsLayout = new javax.swing.GroupLayout(tabs);
        tabs.setLayout(tabsLayout);
        tabsLayout.setHorizontalGroup(
            tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        tabsLayout.setVerticalGroup(
            tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        filltableBangDiem();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

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
            java.util.logging.Logger.getLogger(ThietKeGiaoDienTongHopThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThietKeGiaoDienTongHopThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThietKeGiaoDienTongHopThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThietKeGiaoDienTongHopThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThietKeGiaoDienTongHopThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblNam;
    private javax.swing.JPanel pnlBangDiem;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JPanel pnlTongHopDiem;
    private javax.swing.JPanel tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTable tblTongHopDiem;
    // End of variables declaration//GEN-END:variables
     ThongKeDAO dao = new ThongKeDAO();
     KhoaHocDAO khdao = new KhoaHocDAO();
     
     //Combobox Khoa Hoc //
     void fillcomboboxkhoahoc(){
        DefaultComboBoxModel model = (DefaultComboBoxModel)cboKhoaHoc.getModel();
        model.removeAllElements();
        List<EntityKhoaHoc> list = khdao.selectAll();
        for(EntityKhoaHoc kh : list){
            model.addElement(kh);
        }
    }
     
    // Table Bảng Điểm //
     void filltableBangDiem(){
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);
        EntityKhoaHoc kh = (EntityKhoaHoc) cboKhoaHoc.getSelectedItem();
        List<Object[]> list = dao.getBangDiem(kh.getMaKH());
        for (Object[] row : list) {
            double diem = (double) row[2];
            model.addRow(new Object[]{
                row[0],
                row[1],
                diem,
                getXepLoai(diem)
            });
        }
    }
     String getXepLoai(double diem){
        if(diem < 5){
            return "CHƯA ĐẠT";
        }
        if(diem < 6.5){
            return "HỌC SINH TRUNG BÌNH";
        }
        if(diem < 7.5){
            return "HỌC SINH KHÁ";
        }
        if(diem < 9){
            return "HỌC SINH GIỎI";
        }
        return "HỌC SINH XUẤT SẮC";
    }
     
     void fillTableLuongNguoiHoc(){
        DefaultTableModel model = (DefaultTableModel)tblNguoiHoc.getModel();
        model.setRowCount(0);
        List < Object[] > list = dao.getLuongNguoiHoc();
        for (Object[] row: list){
            model.addRow(row);
        }
    }
     void fillTableDiemChuyenDe(){
        DefaultTableModel model = (DefaultTableModel)tblTongHopDiem.getModel();
        model.setRowCount(0);
        List < Object[] > list = dao.getDiemChuyenDe();
        for ( Object[] row : list){
            model.addRow(new Object[]{
                row[0],
                row[1],
                row[2],
                row[3],
                String.format("%.1f", row[4])
            });
        }
    }
    void fillcomboboxNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List < Integer > list = khdao.selectYears();
        for(Integer year : list){
            model.addElement(year);
        }
        this.fillTableDoanhThu();
    }
    void fillTableDoanhThu(){
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = dao.getDoanhThu(nam);
        for(Object[] row:list){
            model.addRow(new Object[]
            {
                row[0],
                row[1],
                row[2],
                row[3],
                row[4],
                row[5],
                String.format("%.1f", row[6])
            });
        }
    }
}