/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Administrator
 */
public class Model_Zona {
    private String id;
    private String nama_zona;
    private Model_Gudang id_gudang;
//    private String id_gudang;
    private String nama_gudang;
    private String temperatur;
    private String tingkat_keamanan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_zona() {
        return nama_zona;
    }

    public void setNama_zona(String nama_zona) {
        this.nama_zona = nama_zona;
    }

    public Model_Gudang getId_gudang() {
        return id_gudang;
    }

    public void setId_gudang(Model_Gudang id_gudang) {
        this.id_gudang = id_gudang;
    }

    public String getNama_gudang() {
        return nama_gudang;
    }

    public void setNama_gudang(String nama_gudang) {
        this.nama_gudang = nama_gudang;
    }

    public String getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(String temperatur) {
        this.temperatur = temperatur;
    }

    public String getTingkat_keamanan() {
        return tingkat_keamanan;
    }

    public void setTingkat_keamanan(String tingkat_keamanan) {
        this.tingkat_keamanan = tingkat_keamanan;
    }
    
    
    
    
   
}
