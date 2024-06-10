/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_DetailBarangKeluar;

/**
 *
 * @author hellc
 */
public interface Service_DetailBarangKeluar {
    void tambahData (Model_DetailBarangKeluar mod_detailkeluar);
    void sumTotal (Model_DetailBarangKeluar mod_detailkeluar);
    void hapusSementara (Model_DetailBarangKeluar mod_detailkeluar);

    Model_DetailBarangKeluar getByid (String id);
    List<Model_DetailBarangKeluar> ambilData(String id);
    List<Model_DetailBarangKeluar> pencarian(String id);

    boolean validasiStok (Model_DetailBarangKeluar mod_detailkeluar);
}
