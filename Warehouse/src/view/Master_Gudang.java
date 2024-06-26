/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DAO_Gudang;
import java.util.List;
import javax.swing.JOptionPane;
import model.Model_Gudang;
import service.Service_Gudang;
import tablemodel.TableMod_Gudang;

/**
 *
 * @author Anugerah
 */
public class Master_Gudang extends javax.swing.JPanel {

    private Service_Gudang servis = new DAO_Gudang();
    private TableMod_Gudang tblModel = new TableMod_Gudang();
    
    /**
     * Creates new form Master_Zona
     */
    public Master_Gudang() {
        initComponents();
        
        tbl_data.setModel(tblModel);
        
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

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        t_cari = new javax.swing.JTextField();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_namaGudang = new javax.swing.JTextField();
        t_lokasiGudang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Data Lokasi Gudang");

        btn_tambah.setBackground(new java.awt.Color(103, 178, 113));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 51, 51));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 153, 0));
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        t_cari.setText("Cari...");
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cariKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addGap(24, 24, 24)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Tambah Gudang");

        btn_tambah1.setBackground(new java.awt.Color(103, 178, 113));
        btn_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah1.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah1.setText("TAMBAH");
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_batal1.setBackground(new java.awt.Color(255, 204, 51));
        btn_batal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal1.setText("BATAL");
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID Gudang");

        t_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Gudang");

        t_namaGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namaGudangActionPerformed(evt);
            }
        });

        t_lokasiGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_lokasiGudangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Lokasi Gudang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_id)
                    .addComponent(t_namaGudang)
                    .addComponent(t_lokasiGudang)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namaGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(t_lokasiGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1)
                    .addComponent(btn_batal1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btn_tambah1.setText("SIMPAN");
        t_id.setText(servis.nomor());
        
        if(btn_tambah.getText().equals("UBAH")){
            dataTabel();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        // TODO add your handling code here:
        t_id.setEnabled(false);
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_id.setText(servis.nomor());
        }else if(btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if(btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        // TODO add your handling code here:
//        mainPanel.removeAll();
//        mainPanel.add(tampilData);
//        mainPanel.repaint();
//        mainPanel.revalidate();
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void t_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idActionPerformed

    private void t_namaGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namaGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namaGudangActionPerformed

    private void t_lokasiGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_lokasiGudangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_lokasiGudangActionPerformed

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        // TODO add your handling code here:
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

        boolean closeable = true;
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void t_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyTyped
        // TODO add your handling code here:
        pencarian();
    }//GEN-LAST:event_t_cariKeyTyped

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        // TODO add your handling code here:
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_id;
    private javax.swing.JTextField t_lokasiGudang;
    private javax.swing.JTextField t_namaGudang;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    
    private void dataTabel() {
        tampilData.setVisible(false);
        tambahData.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel2.setText("Perbarui Data Gudang");
        
        t_id.setEnabled(false);
        t_id.setText(tbl_data.getModel().getValueAt(row, 1).toString());
        t_namaGudang.setText(tbl_data.getModel().getValueAt(row, 2).toString());
        t_lokasiGudang.setText(tbl_data.getModel().getValueAt(row, 3).toString());

//        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }

    
    private void aktif(){
        t_id.setEnabled(true);
        t_namaGudang.setEnabled(true);
    }
    private void loadData(){
        t_id.setEnabled(false);
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_Gudang> list = servis.ambilData();
        tblModel.setData(list);
    }
    
    private void hapusData(){
        int index = tbl_data.getSelectedRow();
        if (index!=-1){
            Model_Gudang model = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null,"Data akan Dihapus?","Konfirmasi",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                servis.hapusData(model);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        }else{
            JOptionPane.showMessageDialog(null,"Pilih Record yang akan diupdate");
        }
    }
    
    private void resetForm() {
    btn_tambah.requestFocus();
    btn_tambah.setText("TAMBAH");
    t_id.setText("");
    t_namaGudang.setText("");
}

private void tampilPanel() {
    t_id.setEnabled(false);
    mainPanel.removeAll();
    mainPanel.add(new Master_Gudang());
    mainPanel.repaint();
    mainPanel.revalidate();
}

private void simpanData() {
    if (validasiInput() == true) {
        String ID = t_id.getText();
        String Nama_gudang = t_namaGudang.getText();
        String Lokasi_gudang = t_lokasiGudang.getText();

        Model_Gudang model = new Model_Gudang();

        model.setId_gdg(ID);
        model.setNama_gudang(Nama_gudang);
        model.setLokasi_gudang(Lokasi_gudang);

        
        servis.tambahData(model);
        tblModel.tambahData(model);
        tampilPanel();
        loadData();
        resetForm();
        btn_tambah.setText("TAMBAH");
    }
}
    private void perbaruiData() {
        int index = tbl_data.getSelectedRow();
        if (index!=-1) {
            Model_Gudang mod_pen = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if (validasiInput() == true) {
            String ID = t_id.getText();
            String Nama_gudang = t_namaGudang.getText();
            String Lokasi_gudang = t_lokasiGudang.getText();

            Model_Gudang model = new Model_Gudang();
            
            model.setId_gdg(ID);
            model.setNama_gudang(Nama_gudang);
            model.setLokasi_gudang(Lokasi_gudang);
            
            servis.perbaruiData(model);
            tblModel.perbaruiData(index, model);
            tampilPanel();
            loadData();
            resetForm();
            btn_tambah.setText("TAMBAH");
            }
        }
    }
    private boolean validasiInput(){
        boolean valid = false;
        if (t_id.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID Gudang tidak boleh kosong");
        } else if (t_namaGudang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Gudang tidak boleh kosong");
        } else if (t_lokasiGudang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lokasi tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<Model_Gudang> list = servis.Pencarian(t_cari.getText());
        tblModel.setData(list);
    }
}
