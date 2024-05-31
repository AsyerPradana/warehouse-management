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
import model.Model_Produk;
import service.Service_Produk;
/**
 *
 * @author hellc
 */
public class DAO_Produk implements Service_Produk{
    
    private Connection conn;

    public DAO_Produk() {
        conn = Koneksi.getConnection();
    }
    
 
    @Override
    public void tambahData(Model_Produk mod_produk) {
        PreparedStatement st = null;
        String sql = "INSERT INTO produk(id_produk,nama_produk,jenis_produk,deskripsi,jumlah_produk,harga_produk,date) "
                + "VALUES (?,?,?,?,?,?,?)";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_produk.getId_produk());
            st.setString(2, mod_produk.getNama_produk());
            st.setString(3, mod_produk.getJenis_produk());
            st.setString(4, mod_produk.getDeskripsi());
            st.setInt(5, mod_produk.getJumlah_produk());
            st.setFloat(6, mod_produk.getHarga_produk());
            st.setDate(7, mod_produk.getDate());
            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(Model_Produk mod_produk) {
        PreparedStatement st = null;
        String sql = "UPDATE produk SET nama_produk=?,jenis_produk=?,deskripsi=?,jumlah_produk=?,"
                + "harga_produk=?,date=? WHERE id_produk=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(2, mod_produk.getNama_produk());
            st.setString(3, mod_produk.getJenis_produk());
            st.setString(4, mod_produk.getDeskripsi());
            st.setInt(5, mod_produk.getJumlah_produk());
            st.setFloat(6, mod_produk.getHarga_produk());
            st.setDate(7, mod_produk.getDate());
            st.setString(7, mod_produk.getId_produk());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }
    
    @Override
    public void hapusData(Model_Produk mod_produk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM produk WHERE id_Produk=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_produk.getId_produk());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public Model_Produk getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Model_Produk> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM produk";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Produk mozel = new Model_Produk();
                mozel.setId_produk(rs.getString("id_produk"));
                mozel.setNama_produk(rs.getString("nama_produk"));
                mozel.setJenis_produk(rs.getString("jenis_produk"));
                mozel.setDeskripsi(rs.getString("deskripsi"));
                mozel.setJumlah_produk(rs.getInt("jumlah_produk"));
                mozel.setHarga_produk(rs.getFloat("harga_produk"));
                mozel.setDate(rs.getDate("date"));
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Produk> Pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM produk WHERE id_produk LIKE '%"+id+"' OR nama_produk LIKE '%"+id+"'"
                + "OR jenis_produk LIKE '%"+id+"' OR jumlah_produk LIKE '%"+id+"' OR harga_produk LIKE '%"+id+"'";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Produk mozel = new Model_Produk();
                mozel.setId_produk(rs.getString("id_produk"));
                mozel.setNama_produk(rs.getString("nama_produk"));
                mozel.setJenis_produk(rs.getString("jenis_produk"));
                mozel.setDeskripsi(rs.getString("deskripsi"));
                mozel.setJumlah_produk(rs.getInt("jumlah_produk"));
                mozel.setHarga_produk(rs.getFloat("harga_produk"));
                mozel.setDate(rs.getDate("date"));
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
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

        String sql = "SELECT RIGHT(id_produk, 3) AS Nomor FROM produk WHERE id_produk LIKE 'DST" + no + "%'"
                + "ORDER BY id_produk DESC LIMIT 1 ";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "ITEM" + no + String.format("%03d", nomor);
            }else{
                urutan = "ITEM" + no + "001";
            }
        }catch(SQLException ex){
            Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Produk.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         return urutan;
    }
 
}
