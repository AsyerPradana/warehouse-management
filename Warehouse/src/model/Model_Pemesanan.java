/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hellc
 */
public class Model_Pemesanan {
    private String no_pesan;
    private String tgl_pesan;
    private double total_pesan;
    private Model_Supplier mod_supplier;
    private Model_Pengguna mod_pengguna;

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public void setTgl_pesan(String tgl_pesan) {
        this.tgl_pesan = tgl_pesan;
    }

    public double getTotal_pesan() {
        return total_pesan;
    }

    public void setTotal_pesan(double total_pesan) {
        this.total_pesan = total_pesan;
    }

    public Model_Supplier getMod_supplier() {
        return mod_supplier;
    }

    public void setMod_supplier(Model_Supplier mod_supplier) {
        this.mod_supplier = mod_supplier;
    }

    public Model_Pengguna getMod_pengguna() {
        return mod_pengguna;
    }

    public void setMod_pengguna(Model_Pengguna mod_pengguna) {
        this.mod_pengguna = mod_pengguna;
    }
}
