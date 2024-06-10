/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import model.Model_Barang;
import model.Model_JenisBarang;
import service.Service_Barang;
/**
 *
 * @author Administrator
 */
public class DAO_Barang implements Service_Barang{
    
    private Connection conn;

    public DAO_Barang() {
        conn = Koneksi.getConnection();
    }
    
 
    @Override
    public void tambahData(Model_Barang mod_bar) {
        PreparedStatement st = null;
        String sql = "INSERT INTO barang(kode_barang,kode_jenis,nama_jenis,nama_barang,satuan,harga,stok)"
                + "VALUES (?,?,?,?,?,?,?)";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_bar.getKode_barang());
            st.setString(2, mod_bar.getJns_Barang().getKode_jenis());
            st.setString(3, mod_bar.getJns_Barang().getNama_jenis());
            st.setString(4, mod_bar.getNama_barang());
            st.setString(5, mod_bar.getSatuan());
            st.setLong(6, mod_bar.getHarga());
            st.setInt(7, mod_bar.getStok());
            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(Model_Barang mod_bar) {
        PreparedStatement st = null;
        String sql = "UPDATE barang SET kode_barang=?,kode_jenis=?,nama_jenis=?,nama_barang=?,"
                + "satuan=?,stok=? WHERE id_barang=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_bar.getKode_barang());
            st.setString(2, mod_bar.getJns_Barang().getKode_jenis());
            st.setString(3, mod_bar.getJns_Barang().getNama_jenis());
            st.setString(4, mod_bar.getNama_barang());
            st.setString(5, mod_bar.getSatuan());
            st.setLong(6, mod_bar.getHarga());
            st.setInt(7, mod_bar.getStok());    
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }
    
    @Override
    public void hapusData(Model_Barang mod_bar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang WHERE kode_barang=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_bar.getKode_barang());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public Model_Barang getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Model_Barang> ambilData() {
        PreparedStatement st = null;
        List<Model_Barang> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT barang.*, jenis_barang.nama_jenis FROM barang JOIN jenis_barang ON barang.kode_jenis = jenis_barang.kode_jenis";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                Model_Barang mobar = new Model_Barang();
                Model_JenisBarang jbr = new Model_JenisBarang();

                mobar.setKode_barang(rs.getString("kode_barang"));
                jbr.setKode_jenis(rs.getString("kode_jenis"));
                jbr.setNama_jenis(rs.getString("nama_jenis"));
                mobar.setNama_barang(rs.getString("nama_barang"));
                mobar.setSatuan(rs.getString("satuan"));
                mobar.setHarga(rs.getLong("harga"));
                mobar.setStok(rs.getInt("stok"));

                mobar.setJns_Barang(jbr);

                list.add(mobar);
            }
            return list;
        } catch(SQLException ex) {
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(st != null) {
                try {
                    st.close();
                } catch(SQLException ex) {
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch(SQLException ex) {
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Barang> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang WHERE kode_barang LIKE '%"+id+"' OR kode_jenis LIKE '%"+id+"%'"
                + "OR nama_barang LIKE '%"+id+"%' OR telp_barang LIKE '%"+id+"%' OR alamat_barang LIKE '%"+id+"%'"
                + "OR level LIKE '%"+id+"%'";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Barang mobar = new Model_Barang();
                Model_JenisBarang jbr = new Model_JenisBarang();

                mobar.setKode_barang(rs.getString("kode_barang"));
                jbr.setKode_jenis(rs.getString("kode_jenis"));
                jbr.setNama_jenis(rs.getString("nama_jenis"));
                mobar.setNama_barang(rs.getString("nama_barang"));
                mobar.setSatuan(rs.getString("satuan"));
                mobar.setHarga(rs.getLong("harga"));
                mobar.setStok(rs.getInt("stok"));
                
                list.add(mobar);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    @Override
    public String nomor(){
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(kode_barang, 3) AS Nomor FROM barang WHERE kode_barang LIKE 'B" + no + "%'"
                + "ORDER BY kode_barang DESC" + "LIMIT 1 ";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "B" + no + String.format("%03d", nomor);
            }else{
                urutan = "B" + no + "001";
            }
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         return urutan;
    }

    @Override
    public List<Model_Barang> ambilData2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_Barang> pencarian2(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor2(){
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);

        String sql = "SELECT RIGHT(kode_jenis, 3) AS Nomor FROM barang WHERE kode_jenis LIKE 'B" + no + "%'"
                + "ORDER BY kode_jenis DESC" + "LIMIT 1 ";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "JB" + no + String.format("%03d", nomor);
            }else{
                urutan = "JB" + no + "001";
            }
        }catch(SQLException ex){
            Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         return urutan;
    }

}

