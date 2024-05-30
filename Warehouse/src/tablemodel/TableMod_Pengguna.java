/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.Model_Pengguna;


/**
 *
 * @author Administrator
 */
public class TableMod_Pengguna extends AbstractTableModel{
    private List<Model_Pengguna> list = new ArrayList<>();

    public void tambahData(Model_Pengguna mod_pengguna) {
        list.add(mod_pengguna);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
    }

    public void perbaruiData(int row, Model_Pengguna mod_pengguna) {
        list.add(row, mod_pengguna);
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

    public void setData(List<Model_Pengguna> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }

    public void setData(int index, Model_Pengguna mod_pengguna) {
        list.set(index, mod_pengguna);
        fireTableRowsUpdated(index, index);
    }
    
    public Model_Pengguna getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    private final String[] columnName = {"No", "ID", "Nama", "Username", "Password", "Telepon", "Alamat", "Level"};
    
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
            case 0: return list.get(rowIndex).getId_pengguna();
            case 1: return list.get(rowIndex).getNama_pengguna();
            case 2: return list.get(rowIndex).getUsername();
            case 3: return list.get(rowIndex).getPassword();
            case 4: return list.get(rowIndex).getTelp_pengguna();
            case 5: return list.get(rowIndex).getAlamat_pengguna();
            case 6: return list.get(rowIndex).getLevel();
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
    
//    public String getColumnName(int column){
//        switch(column){
//            case 0: return "No id";
//            case 1: return "Nama Pengguna"; 
//            case 2: return "Username";
//            case 3: return "Password";
//            case 4: return "No Telepon";
//            case 5: return "Alamat ";
//            case 6: return "Level";
//            default: return null;
//        }
//    }
}
