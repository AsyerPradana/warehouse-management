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
import javax.swing.JOptionPane;
import model.Model_Gudang;
import model.Model_Zona;
import service.Service_Zona;
/**
 *
 * @author Administrator
 */
public class DAO_Zona implements Service_Zona{
    
    private Connection conn;

    public DAO_Zona() {
        conn = Koneksi.getConnection();
    }
    
 
    @Override
    public void tambahData(Model_Zona mod_zona) {
        PreparedStatement st = null;
        String sql = "INSERT INTO zona(id_zona,nama_zona,id_gudang,temperatur,tingkat_keamanan) VALUES (?,?,?,?,?)";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_zona.getId());
            st.setString(2, mod_zona.getNama_zona());
            st.setString(3, mod_zona.getId_gudang().getId_gdg());
            st.setString(4, mod_zona.getTemperatur());
            st.setString(5, mod_zona.getTingkat_keamanan());
            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(Model_Zona mod_zona) {
        PreparedStatement st = null;
        String sql = "UPDATE zona SET nama_zona=?,id_gudang=?,temperatur=?,tingkat_keamanan=? "
                + "WHERE id_zona='"+mod_zona.getId()+"'";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_zona.getNama_zona());
            st.setString(2, mod_zona.getId_gudang().getId_gdg());
            st.setString(3, mod_zona.getTemperatur());
            st.setString(4, mod_zona.getTingkat_keamanan());           
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }
    
    @Override
    public void hapusData(Model_Zona mod_zona) {
        PreparedStatement st = null;
        String sql = "DELETE FROM zona WHERE id_zona=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_zona.getId());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public Model_Zona getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Model_Zona> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT z.id_zona, z.nama_zona, g.id_gudang, g.nama_gudang, z.temperatur, z.tingkat_keamanan FROM zona z INNER JOIN gudang g ON z.id_gudang = g.id_gudang;";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Zona mozel = new Model_Zona();
                Model_Gudang jb = new Model_Gudang();
                
                mozel.setId             (rs.getString("id_zona"));
                mozel.setNama_zona      (rs.getString("nama_zona"));
                jb.setId_gdg            (rs.getString("id_gudang"));
                mozel.setNama_gudang    (rs.getString("nama_gudang"));
                mozel.setTemperatur     (rs.getString("temperatur"));
                mozel.setTingkat_keamanan(rs.getString("tingkat_keamanan"));
                
                mozel.setId_gudang(jb);
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Zona> Pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT z.id_zona, z.nama_zona, g.id_gudang, g.nama_gudang, z.temperatur, "
                + "z.tingkat_keamanan FROM zona z INNER JOIN gudang g ON z.id_gudang = g.id_gudang "
                + "WHERE id_zona LIKE '%"+id+"%' OR nama_zona LIKE '%"+id+"%'"
                + "OR tingkat_keamanan LIKE '%"+id+"%'OR temperatur LIKE '%"+id+"%'";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Zona mozel = new Model_Zona();
                Model_Gudang jb = new Model_Gudang();
                
                mozel.setId             (rs.getString("id_zona"));
                mozel.setNama_zona      (rs.getString("nama_zona"));
                jb.setId_gdg            (rs.getString("id_gudang"));
                mozel.setNama_gudang    (rs.getString("nama_gudang"));
                mozel.setTemperatur     (rs.getString("temperatur"));
                mozel.setTingkat_keamanan(rs.getString("tingkat_keamanan"));
                
                mozel.setId_gudang(jb);
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Zona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Zona> ambilDataByID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Model_Zona> Pencarian2(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

        String sql = "SELECT RIGHT(id_zona, 3) AS Nomor FROM zona ORDER BY id_zona DESC LIMIT 1 ";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "Z" + String.format("%03d", nomor);
            }else{
                urutan = "Z001";
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

