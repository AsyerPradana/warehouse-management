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
import model.Model_Gudang;
import service.Service_Gudang;
/**
 *
 * @author Administrator
 */
public class DAO_Gudang implements Service_Gudang{
    
    private Connection conn;

    public DAO_Gudang() {
        conn = Koneksi.getConnection();
    }
    
 
    @Override
    public void tambahData(Model_Gudang mod_gudang) {
        PreparedStatement st = null;
        String sql = "INSERT INTO gudang(id_gudang,nama_gudang,lokasi_gudang) "
                + "VALUES (?,?,?)";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_gudang.getId_gdg());
            st.setString(2, mod_gudang.getNama_gudang());
            st.setString(3, mod_gudang.getLokasi_gudang());

            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(Model_Gudang mod_gudang) {
        PreparedStatement st = null;
        String sql = "UPDATE gudang SET id_gudang=?,nama_gudang=?,lokasi_gudang=? WHERE id_gudang='"+mod_gudang.getId_gdg()+"'";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_gudang.getId_gdg());
            st.setString(2, mod_gudang.getNama_gudang());
            st.setString(3, mod_gudang.getLokasi_gudang());        
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }
    
    @Override
    public void hapusData(Model_Gudang mod_gudang) {
        PreparedStatement st = null;
        String sql = "DELETE FROM gudang WHERE id_gudang=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_gudang.getId_gdg());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public Model_Gudang getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Model_Gudang> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM gudang";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Gudang mozel = new Model_Gudang();
                mozel.setId_gdg(rs.getString("id_gudang"));
                mozel.setNama_gudang(rs.getString("nama_gudang"));
                mozel.setLokasi_gudang(rs.getString("lokasi_gudang"));
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Gudang> Pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM gudang WHERE id_gudang LIKE '%"+id+"%' OR nama_gudang LIKE '%"+id+"%'"
                + "OR lokasi_gudang LIKE '%"+id+"%'";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Gudang mozel = new Model_Gudang();
                mozel.setId_gdg(rs.getString("id_gudang"));
                mozel.setNama_gudang(rs.getString("nama_gudang"));
                mozel.setLokasi_gudang(rs.getString("lokasi_gudang"));
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Gudang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Gudang> ambilDataByID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_Gudang> Pencarian2(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String nomor(){
        PreparedStatement st = null;
        ResultSet rs = null;
        String urutan = null;
        String sql = "SELECT RIGHT(id_gudang, 5) AS Nomor FROM gudang ORDER BY Nomor DESC LIMIT 1";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = String.format("G%05d", nomor);
            }else{
                urutan = "G00001";
            }
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st != null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         return urutan;
    }

}

