/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author hellc
 */
public class Model_Produk {
    private String id_produk;
    private String nama_produk;
    private String jenis_produk;
    private String deskripsi;
    private int jumlah_produk;
    private Float harga_produk;
    private Date date;

    // Getters and setters
    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getJenis_produk() {
        return jenis_produk;
    }

    public void setJenis_produk(String jenis_produk) {
        this.jenis_produk = jenis_produk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getJumlah_produk() {
        return jumlah_produk;
    }

    public void setJumlah_produk(int jumlah_produk) {
        this.jumlah_produk = jumlah_produk;
    }

    public Float getHarga_produk() {
        return harga_produk;
    }

    public void setHarga_produk(Float harga_produk) {
        this.harga_produk = harga_produk;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
