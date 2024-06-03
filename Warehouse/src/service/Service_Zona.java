/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Zona;

/**
 *
 * @author Administrator
 */
public interface Service_Zona {
    void tambahData (Model_Zona mod_zona);
    void perbaruiData (Model_Zona mod_zona);
    void hapusData (Model_Zona mod_zona);
    
    Model_Zona getById (String id);
    
    List<Model_Zona> ambilDataByID();
    List<Model_Zona> ambilData();
    List<Model_Zona> Pencarian(String id);
    List<Model_Zona> Pencarian2(String id);

    String nomor();
}
