/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import config.Koneksi;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import service.Service_Laporan;
import net.sf.jasperreports.view.JRViewer;
import java.awt.BorderLayout;
import java.io.File;
/**
 *
 * @author Administrator
 */
public class DAO_Laporan implements Service_Laporan{
    private Connection conn;

    public DAO_Laporan() {
        conn = Koneksi.getConnection();
    }
    
//    @Override
//    public void connectToDatabase() {
//        String url = "jdbc:mysql://localhost:3306/db_warehouse"; // Replace with your database URL
//        String user = "root"; // Replace with your database user
//        String password = ""; // Replace with your database password
//        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connection to database established!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
//        }
//    }
    
    @Override
    public void lapDataBarang(JPanel jp){
        try{
            String file = "src/report/Report_DataBarang.jasper";
            HashMap parameter = new HashMap();
            
            JasperPrint print = JasperFillManager.fillReport(file, parameter, conn);
            //tampil panelll
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
    
    
    @Override
    public void lapSupplier(JPanel jp){
        try{
            String file = "src/report/Report_DataSupplier.jasper";
            HashMap parameter = new HashMap();
            
            JasperPrint print = JasperFillManager.fillReport(file, parameter, conn);
            //tampil panelll
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
//    public void lapDataB(){
//        try {
//            String reportPath = "src/report/Report_DataBarang.jasper";
//            conn = Koneksi.getConnection();
//
//            HashMap<String, Object> parameters = new HashMap<>();
//            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
//            JasperViewer viewer = new JasperViewer(print, false);
//            viewer.setVisible(true);
//        } catch (Exception e) {
//           JOptionPane.showConfirmDialog(null, e.getMessage());
//        }
//    }

    @Override
    public void lapLokasi(JPanel jp) {
        try{
            String file = "src/report/Report_DataGudang.jasper";
            HashMap parameter = new HashMap();
            
            JasperPrint print = JasperFillManager.fillReport(file, parameter, conn);
            //tampil panelll
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapKaryawan(JPanel jp) {
        try{
            String file = "src/report/Report_DataPengguna.jasper";
            HashMap parameter = new HashMap();
            
            JasperPrint print = JasperFillManager.fillReport(file, parameter, conn);
            //tampil panelll
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
}