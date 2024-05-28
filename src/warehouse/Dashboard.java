/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package warehouse;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author hellc
 */
public class Dashboard extends JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setTitle("Warehouse Management");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(47, 54, 64));
        
        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(47, 54, 64));
        sidebar.setPreferredSize(new Dimension(200, getHeight()));
        
        JLabel title = new JLabel("Warehouse Management");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        String[] sidebarOptions = {"Dashboard", "Daftar Produk", "Manajemen Karyawan", "Laporan", "Analytics/Reports", "Manajemen Lokasi", "Log out"};
        for (String option : sidebarOptions) {
            JButton button = new JButton(option);
            button.setMaximumSize(new Dimension(200, 40));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(button);
            sidebar.add(Box.createVerticalStrut(5));
        }
        
        sidebar.add(Box.createVerticalGlue());
        
        // Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(52, 73, 94));
        topPanel.setPreferredSize(new Dimension(getWidth(), 80));
        
        JTextField searchField = new JTextField("Search");
        searchField.setPreferredSize(new Dimension(400, 40));
        searchField.setHorizontalAlignment(JTextField.CENTER);
        
        topPanel.add(searchField, BorderLayout.CENTER);
        
        JPanel topRightPanel = new JPanel();
        topRightPanel.setBackground(new Color(52, 73, 94));
        topRightPanel.add(new JLabel("Admin"));
        topRightPanel.add(new JLabel(new ImageIcon("bell_icon.png")));
        topRightPanel.add(new JLabel(new ImageIcon("user_icon.png")));
        
        topPanel.add(topRightPanel, BorderLayout.EAST);
        
        // Dashboard panel
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setBackground(new Color(47, 54, 64));
        dashboardPanel.setLayout(new BoxLayout(dashboardPanel, BoxLayout.Y_AXIS));
        
        JPanel statsPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        statsPanel.setBackground(new Color(47, 54, 64));
        
        String[] stats = {"$612,839\nTotal Pendapatan", "256\nTotal Karyawan", "52,000\nTotal Produk", "4,000\nTotal Transaksi"};
        for (String stat : stats) {
            JPanel statPanel = new JPanel();
            statPanel.setBackground(new Color(64, 115, 158));
            statPanel.setPreferredSize(new Dimension(150, 100));
            JLabel statLabel = new JLabel("<html><center>" + stat.replace("\n", "<br>") + "</center></html>");
            statLabel.setForeground(Color.WHITE);
            statLabel.setFont(new Font("Arial", Font.BOLD, 14));
            statPanel.add(statLabel);
            statsPanel.add(statPanel);
        }
        
        dashboardPanel.add(statsPanel);
        
        // Table
        String[] columnNames = {"Produk Name", "Jumlah Produk", "Total Produk saat ini", "Date"};
        Object[][] data = {
            {"Produk 51", 120, 400, "30/09/2023"},
            {"Produk 3", 150, 200, "26/03/2023"},
            {"Produk 15", 156, 200, "11/01/2023"},
            {"Produk 71", 132, 220, "12/12/2023"},
            {"Produk 7", 101, 500, "31/01/2023"},
            {"Produk 6", 223, 120, "30/09/2023"},
            {"Produk 10", 356, 406, "26/02/2023"}
        };
        
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        JScrollPane tableScrollPane = new JScrollPane(table);
        
        dashboardPanel.add(tableScrollPane);
        
        // Add panels to main panel
        mainPanel.add(sidebar, BorderLayout.WEST);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(dashboardPanel, BorderLayout.CENTER);
        
        // Add main panel to frame
        add(mainPanel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dashboard app = new Dashboard();
            app.setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}



