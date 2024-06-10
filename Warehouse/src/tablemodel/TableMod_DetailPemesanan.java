/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_DetailPemesanan;

/**
 *
 * @author hellc
 */
public class TableMod_DetailPemesanan extends AbstractTableModel{
    private List<Model_DetailPemesanan> list = new ArrayList<>();

    public void tambahData(Model_DetailPemesanan mod_detailpesan) {
        list.add(mod_detailpesan);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_DetailPemesanan mod_detailpesan) {
        list.add(row, mod_detailpesan);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil di perbarui");
    }

    public void hapusData(int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
    }

    public void clear() {
        list.clear();
        fireTableDataChanged();
    }

    public void setData(List<Model_DetailPemesanan> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_DetailPemesanan mod_detailpesan) {
        list.set(index, mod_detailpesan);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetailPemesanan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "No Pesan", "Kode Barang", "Nama Barang", "Jumlah Pesan", "Subtotal Pesan", "Keterangan"};
    
    @Override
    public int getColumnCount(){
        return columnName.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        if(columnIndex == 0){
            return "    " + (rowIndex + 1);
        }else{
            switch (columnIndex - 1){
            case 0: return list.get(rowIndex).getMod_pesan().getNo_pesan();
            case 1: return list.get(rowIndex).getMod_barang().getKode_barang();
            case 2: return list.get(rowIndex).getMod_barang().getNama_barang();
            case 4: return list.get(rowIndex).getJml_pesan();
            case 5: return list.get(rowIndex).getSubtotal_pesan();
            case 6: return list.get(rowIndex).getStatus();
            default: return null;
            }
        }
        
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "    " + columnName[column];
        }else{
            return columnName[column];
        }
    }
}
