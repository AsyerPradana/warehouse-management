/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_Produk;
/**
 *
 * @author hellc
 */
public class TableMod_Produk extends AbstractTableModel{
    private List<Model_Produk> list = new ArrayList<>();

    public void tambahData(Model_Produk mod_produk) {
        list.add(mod_produk);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_Produk mod_produk) {
        list.add(row, mod_produk);
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

    public void setData(List<Model_Produk> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_Produk mod_produk) {
        list.set(index, mod_produk);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Produk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "ID", "Nama Produk", "Jenis Produk", "Deskripsi", "Jumlah Produk", "Harga Produk", "Date"};
    
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
            case 0: return list.get(rowIndex).getId_produk();
            case 1: return list.get(rowIndex).getNama_produk();
            case 2: return list.get(rowIndex).getJenis_produk();
            case 3: return list.get(rowIndex).getDeskripsi();
            case 4: return list.get(rowIndex).getJumlah_produk();
            case 5: return list.get(rowIndex).getHarga_produk();
            case 6: return list.get(rowIndex).getDate();
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
