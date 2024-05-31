/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DAO_Produk;
import java.util.List;
import javax.swing.JOptionPane;
import model.Model_Produk;
import service.Service_Produk;
import tablemodel.TableMod_Produk;

/**
 *
 * @author hellc
 */
public class Master_Produk extends javax.swing.JPanel {

    private Service_Produk servis = (Service_Produk) new DAO_Produk();
    private TableMod_Produk tblModel = new TableMod_Produk();

    /**
     * Creates new form Master_Produk
     */
    public Master_Produk() {
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
        jLabel11 = new javax.swing.JLabel();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_id_produk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_nama_produk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_jenis_produk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_deskripsi = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        t_jumlah_produk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_harga_produk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbx_date = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(573, 552));
        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Data Produk");

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

        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });

        jLabel11.setText("Cari");

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
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
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
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Tambah Data Pengguna");

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
        jLabel3.setText("ID");

        t_id_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_id_produkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nama Produk");

        t_nama_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nama_produkActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Deskripsi");

        t_jenis_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jenis_produkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Produk");

        t_deskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_deskripsiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Jumlah Produk");

        t_jumlah_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jumlah_produkActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Harga Produk");

        t_harga_produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_harga_produkActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Level");

        cbx_date.setDateFormatString("yyyy,mm,dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_id_produk)
                    .addComponent(t_nama_produk)
                    .addComponent(t_jenis_produk)
                    .addComponent(t_jumlah_produk)
                    .addComponent(t_harga_produk)
                    .addComponent(t_deskripsi)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cbx_date, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_id_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nama_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_jenis_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_jumlah_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_harga_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
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
                .addContainerGap(299, Short.MAX_VALUE))
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
        t_id_produk_produk.setText(servis.nomor());

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

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        // TODO add your handling code here:
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        // TODO add your handling code here:
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_id_produk_produk.setText(servis.nomor());
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

    private void t_id_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_id_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_id_produkActionPerformed

    private void t_nama_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nama_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_nama_produkActionPerformed

    private void t_jenis_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jenis_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jenis_produkActionPerformed

    private void t_deskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_deskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_deskripsiActionPerformed

    private void t_jumlah_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jumlah_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jumlah_produkActionPerformed

    private void t_harga_produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_harga_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_harga_produkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private com.toedter.calendar.JDateChooser cbx_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JPasswordField t_deskripsi;
    private javax.swing.JTextField t_harga_produk;
    private javax.swing.JTextField t_id_produk;
    private javax.swing.JTextField t_jenis_produk;
    private javax.swing.JTextField t_jumlah_produk;
    private javax.swing.JTextField t_nama_produk;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables
}

private void dataTabel() {
        tampilData.setVisible(false);
        tambahData.setVisible(true);

        int row = tbl_data.getSelectedRow();
        jLabel2.setText("Perbarui Data Produk");
        
        t_id_produk.setEnabled(false);
        t_password.setEnabled(false);
        t_nama.setEnabled(true);

        t_id_produk.setText(tbl_data.getModel().getValueAt(row, 1).toString());
        t_nama.setText(tbl_data.getModel().getValueAt(row, 2).toString());
        t_jenis_produk.setText(tbl_data.getModel().getValueAt(row, 3).toString());
        t_password.setText(tbl_data.getModel().getValueAt(row, 4).toString());
        t_telp.setText(tbl_data.getModel().getValueAt(row, 5).toString());
        t_alamat.setText(tbl_data.getModel().getValueAt(row, 6).toString());
        cbx_level.setSelectedItem(tbl_data.getModel().getValueAt(row, 7).toString());

//        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }

    
    private void aktif(){
        t_id_produk.setEnabled(true);
        t_nama.setEnabled(true);
    }
    private void loadData(){
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_Pengguna> list = servis.ambilData();
        tblModel.setData(list);
    }
    
    private void hapusData(){
        int index = tbl_data.getSelectedRow();
        if (index!=-1){
            Model_Pengguna model = tblModel.getData(tbl_data.convertRowIndexToModel(index));
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
    t_id_produk.setText("");
    t_nama_produk.setText("");
}

private void tampilPanel() {
    mainPanel.removeAll();
    mainPanel.add(new Master_Pengguna());
    mainPanel.repaint();
    mainPanel.revalidate();
}

private void simpanData() {
    if (validasiInput() == true) {
        String ID = t_id_produk.getText();
        String nama = t_nama_produk.getText();
        String username = t_jenis_produk.getText();
        String password = t_password.getText();
        String telepon = t_telp.getText();
        String alamat = t_alamat.getText();
        String level = cbx_level.getSelectedItem().toString();

        Model_Pengguna model = new Model_Pengguna();
        model.setId_produk(ID);
        model.setNama_produk(nama);
        model.setUsername(username);
        model.setPassword(password);
        model.setTelp_pengguna(telepon);
        model.setAlamat_pengguna(alamat);
        model.setLevel(level);

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
            Model_Pengguna mod_pen = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if (validasiInput() == true) {
                String ID = t_id_produk.getText();
                String nama = t_nama.getText();
                String username = t_jenis_produk.getText();
                String password = t_password.getText();
                String telepon = t_telp.getText();
                String alamat = t_alamat.getText();
                String level = cbx_level.getSelectedItem().toString();

                Model_Pengguna model = new Model_Pengguna();
                model.setId_pengguna(ID);
                model.setNama_pengguna(nama);
                model.setUsername(username);
                model.setPassword(password);
                model.setTelp_pengguna(telepon);
                model.setAlamat_pengguna(alamat);
                model.setLevel(level);

                servis.tambahData(model);
                tblModel.tambahData(model);
                tampilPanel();
                loadData();
                resetForm();
                btn_tambah.setText("TAMBAH");
                }
        }
    }
    private boolean validasiInput(){
        boolean valid = false;
        if (t_id_produk.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
        } else if (t_nama.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
        } else if (t_jenis_produk.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        } else if (t_password.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        } else if (t_telp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Telepon tidak boleh kosong");
        } else if (t_alamat.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        } else if (cbx_level.getSelectedItem().equals("* Pilih Akses Level *")) {
            JOptionPane.showMessageDialog(null, "Level harus dipilih");
        } else {
            valid = true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<Model_Pengguna> list = servis.Pencarian(t_cari.getText());
    }
}