/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_DetailBarangMasuk;

/**
 *
 * @author hellc
 */
public interface Service_DetailBarangMasuk {
    void tambahData (Model_DetailBarangMasuk mod_detailmasuk);
    void sumTotal (Model_DetailBarangMasuk mod_detailmasuk);
    void hapusSementara (Model_DetailBarangMasuk mod_detailmasuk);

    Model_DetailBarangMasuk getByid (String id);
    List<Model_DetailBarangMasuk> ambilData(String id);
}
