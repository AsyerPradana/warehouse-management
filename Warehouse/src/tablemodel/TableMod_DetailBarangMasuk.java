/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_DetailBarangMasuk;

/**
 *
 * @author hellc
 */
public class TableMod_DetailBarangMasuk extends AbstractTableModel{
    private List<Model_DetailBarangMasuk> list = new ArrayList<>();

    public void tambahData(Model_DetailBarangMasuk mod_detailmasuk) {
        list.add(mod_detailmasuk);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_DetailBarangMasuk mod_detailmasuk) {
        list.add(row, mod_detailmasuk);
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

    public void setData(List<Model_DetailBarangMasuk> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_DetailBarangMasuk mod_detailmasuk) {
        list.set(index, mod_detailmasuk);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_DetailBarangMasuk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "No Masuk", "Kode Barang", "Nama Barang", "Jumlah Masuk", "Subtotal Masuk"};
    
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
            case 0: return list.get(rowIndex).getMod_masuk().getNo_masuk();
            case 1: return list.get(rowIndex).getMod_barang().getKode_barang();
            case 2: return list.get(rowIndex).getMod_barang().getNama_barang();
            case 3: return list.get(rowIndex).getJml_masuk();
            case 4: return list.get(rowIndex).getSubtotal_masuk();
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
