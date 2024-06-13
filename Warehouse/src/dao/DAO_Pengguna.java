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
import model.Model_Pengguna;
import service.Service_Pengguna;
/**
 *
 * @author Administrator
 */
public class DAO_Pengguna implements Service_Pengguna{
    
    private Connection conn;

    public DAO_Pengguna() {
        conn = Koneksi.getConnection();
    }
    
 
    @Override
    public void tambahData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "INSERT INTO pengguna(id_pengguna,nama_pengguna,username,password,telp_pengguna,alamat_pengguna,level) "
                + "VALUES (?,?,?,?,?,?,?)";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getId_pengguna());
            st.setString(2, mod_pengguna.getNama_pengguna());
            st.setString(3, mod_pengguna.getUsername());
            st.setString(4, Encrypt.getmd5java(mod_pengguna.getPassword()));
            st.setString(5, mod_pengguna.getTelp_pengguna());
            st.setString(6, mod_pengguna.getAlamat_pengguna());
            st.setString(7, mod_pengguna.getLevel());
            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public void perbaruiData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "UPDATE pengguna SET nama_pengguna=?,username=?,password=?,telp_pengguna=?,"
                + "alamat_pengguna=?,level=? WHERE id_pengguna=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getNama_pengguna());
            st.setString(2, mod_pengguna.getUsername());
            st.setString(3, Encrypt.getmd5java(mod_pengguna.getPassword()));
            st.setString(4, mod_pengguna.getTelp_pengguna());
            st.setString(5, mod_pengguna.getAlamat_pengguna());
            st.setString(6, mod_pengguna.getLevel());
            st.setString(7, mod_pengguna.getId_pengguna());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }
    
    @Override
    public void hapusData(Model_Pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pengguna WHERE id_Pengguna=?";
         try {
            st = conn.prepareStatement(sql);
            st.setString(1, mod_pengguna.getId_pengguna());            
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    }

    @Override
    public Model_Pengguna getById(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Model_Pengguna> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pengguna";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Pengguna mozel = new Model_Pengguna();
                mozel.setId_pengguna(rs.getString("id_pengguna"));
                mozel.setNama_pengguna(rs.getString("nama_pengguna"));
                mozel.setUsername(rs.getString("username"));
                mozel.setPassword(rs.getString("password"));
                mozel.setTelp_pengguna(rs.getString("telp_pengguna"));
                mozel.setAlamat_pengguna(rs.getString("alamat_pengguna"));
                mozel.setLevel(rs.getString("level"));
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    @Override
    public List<Model_Pengguna> Pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pengguna WHERE id_pengguna LIKE '%"+id+"' OR nama_pengguna LIKE '%"+id+"%'"
                + "OR username LIKE '%"+id+"%' OR telp_pengguna LIKE '%"+id+"%' OR alamat_pengguna LIKE '%"+id+"%'"
                + "OR level LIKE '%"+id+"%'";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Model_Pengguna mozel = new Model_Pengguna();
                mozel.setId_pengguna(rs.getString("id_pengguna"));
                mozel.setNama_pengguna(rs.getString("nama_pengguna"));
                mozel.setUsername(rs.getString("username"));
                mozel.setPassword(rs.getString("password"));
                mozel.setTelp_pengguna(rs.getString("telp_pengguna"));
                mozel.setAlamat_pengguna(rs.getString("alamat_pengguna"));
                mozel.setLevel(rs.getString("level"));
                
                list.add(mozel);
            }
            return list;
        }catch(SQLException ex){
            Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(rs!=null){
                try{
                    rs.close();
                }catch(SQLException ex){
                    Logger.getLogger(DAO_Pengguna.class.getName()).log(Level.SEVERE, null, ex);
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

        String sql = "SELECT RIGHT(id_pengguna, 3) AS Nomor FROM pengguna WHERE id_pengguna LIKE 'USR" + no + "%'"
                + "ORDER BY id_pengguna DESC LIMIT 1 ";
         try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "USR" + no + String.format("%03d", nomor);
            }else{
                urutan = "USR" + no + "001";
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
    
    public boolean validateOldPassword(String username, String oldPassword){
        
        String encryptedOldPassword = Encrypt.getmd5java(oldPassword);
        try {
            String sql = "SELECT + FROM pengguna WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        String encryptedOldPassword = Encrypt.getmd5java(oldPassword);
        String encryptedNewPassword = Encrypt.getmd5java(newPassword);
        try {
            String sql = "SELECT * FROM pengguna WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, encryptedOldPassword);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String sqlUpdate = "UPDATE pengguna SET password = ? WHERE username = ?";
                PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate);
                pstmtUpdate.setString(1, encryptedNewPassword);
                pstmtUpdate.setString(2, username);
                int result = pstmtUpdate.executeUpdate();
                return result > 0;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}

