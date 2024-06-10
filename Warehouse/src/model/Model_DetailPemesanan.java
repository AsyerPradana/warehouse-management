/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hellc
 */
public class Model_DetailPemesanan {
    private Model_Pemesanan mod_pesan;
    private Model_Barang mod_barang;
    private int jml_pesan;
    private double subtotal_pesan;
    private String status;

    public Model_Pemesanan getMod_pesan() {
        return mod_pesan;
    }

    public void setMod_pesan(Model_Pemesanan mod_pesan) {
        this.mod_pesan = mod_pesan;
    }

    public Model_Barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(Model_Barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_pesan() {
        return jml_pesan;
    }

    public void setJml_pesan(int jml_pesan) {
        this.jml_pesan = jml_pesan;
    }

    public double getSubtotal_pesan() {
        return subtotal_pesan;
    }

    public void setSubtotal_pesan(double subtotal_pesan) {
        this.subtotal_pesan = subtotal_pesan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
