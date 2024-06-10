/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_JenisBarang;

/**
 *
 * @author hellc
 */
public class TableMod_JenisBarang extends AbstractTableModel{
    private List<Model_JenisBarang> list = new ArrayList<>();

    public void tambahData(Model_JenisBarang mod_jenbar) {
        list.add(mod_jenbar);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_JenisBarang mod_jenbar) {
        list.add(row, mod_jenbar);
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

    public void setData(List<Model_JenisBarang> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_JenisBarang mod_jenbar) {
        list.set(index, mod_jenbar);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_JenisBarang getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "Kode Jenis", "Nama Jenis"};
    
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
            case 0: return list.get(rowIndex).getKode_jenis();
            case 1: return list.get(rowIndex).getNama_jenis();
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

