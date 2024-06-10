/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hellc
 */
public class Model_DetailBarangKeluar {
    private Model_BarangKeluar mod_keluar;
    private Model_Barang mod_barang;
    private int jml_keluar;
    private double subtotal_keluar;

    public Model_BarangKeluar getMod_keluar() {
        return mod_keluar;
    }

    public void setMod_keluar(Model_BarangKeluar mod_keluar) {
        this.mod_keluar = mod_keluar;
    }

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(int jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public double getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(double subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }
}
