/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Model_DetailPemesanan;

/**
 *
 * @author hellc
 */
public interface Service_DetailPemesanan {
    void tambahData (Model_DetailPemesanan mod_detailpesan);
    void sumTotal (Model_DetailPemesanan mod_detailpesan);
    void hapusSementara (Model_DetailPemesanan mod_detailpesan);

    Model_DetailPemesanan getByid (String id);
    List<Model_DetailPemesanan> ambilData(String id);
    List<Model_DetailPemesanan> pencarian(String id);
}
