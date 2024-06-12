/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_Supplier;

/**
 *
 * @author hellc
 */
public interface Service_Supplier {
    void tambahData (Model_Supplier mod_dis);
    void perbaruiData (Model_Supplier mod_dis);
    void hapusData (Model_Supplier mod_dis);

    Model_Supplier getByid (String id);
    List<Model_Supplier> ambilData();
    List<Model_Supplier> ambilData(int startIndex, int entriesPerPage);
    List<Model_Supplier> pencarian(String id);
    
    int getTotalEntries();
    String nomor();
}
