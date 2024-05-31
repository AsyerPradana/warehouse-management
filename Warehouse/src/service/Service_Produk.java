/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Produk;
/**
 *
 * @author hellc
 */
public interface Service_Produk {
    void tambahData (Model_Produk mod_Produk);
    void perbaruiData (Model_Produk mod_Produk);
    void hapusData (Model_Produk mod_Produk);
    
    Model_Produk getById (String id);
    
    List<Model_Produk> ambilData();
    List<Model_Produk> Pencarian(String id);
    
    String nomor();
}
