/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Pengguna;

/**
 *
 * @author Administrator
 */
public interface Service_Pengguna {
    void tambahData (Model_Pengguna mod_Pengguna);
    void perbaruiData (Model_Pengguna mod_Pengguna);
    void hapusData (Model_Pengguna mod_Pengguna);
    
    Model_Pengguna getById (String id);
    
    List<Model_Pengguna> ambilData();
    List<Model_Pengguna> Pencarian(String id);
    
    String nomor();

}
