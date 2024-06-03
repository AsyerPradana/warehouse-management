/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_Zona;

/**
 *
 * @author Administrator
 */
public class TableMod_Zona extends AbstractTableModel {
    private List<Model_Zona> list = new ArrayList<>();

    public void tambahData(Model_Zona mod_zona) {
        list.add(mod_zona);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_Zona mod_zona) {
        list.add(row, mod_zona);
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

    public void setData(List<Model_Zona> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_Zona mod_zona) {
        list.set(index, mod_zona);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Zona getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "ID", "Nama Zona", "ID Gudang", "Nama Gudang", "Temperature", "Tingkat Keamanan"};
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
            case 0: return list.get(rowIndex).getId();
            case 1: return list.get(rowIndex).getNama_zona();
            case 2: return list.get(rowIndex).getId_gudang().getId_gdg();
            case 3: return list.get(rowIndex).getNama_gudang();
            case 4: return list.get(rowIndex).getTemperatur();
            case 5: return list.get(rowIndex).getTingkat_keamanan();
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
