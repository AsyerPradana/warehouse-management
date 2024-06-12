/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public interface Service_Laporan {
//    void connectToDatabase();
    void lapDataBarang(JPanel jp);
    void lapJenisBarang(JPanel jp);
    void lapSupplier(JPanel jp);
    void lapLokasi(JPanel jp);
    void lapKaryawan(JPanel jp);
}
