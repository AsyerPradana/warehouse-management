/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Gudang;

/**
 *
 * @author Administrator
 */
public interface Service_Gudang {
    void tambahData (Model_Gudang mod_gudang);
    void perbaruiData (Model_Gudang mod_gudang);
    void hapusData (Model_Gudang mod_gudang);
    
    Model_Gudang getById (String id);
    
    List<Model_Gudang> ambilDataByID();
    List<Model_Gudang> ambilData();
    List<Model_Gudang> Pencarian(String id);
    List<Model_Gudang> Pencarian2(String id);

    String nomor();
}
