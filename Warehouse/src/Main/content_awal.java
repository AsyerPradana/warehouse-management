/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

/**
 *
 * @author Administrator
 */
public class content_awal extends javax.swing.JPanel {

    /**
     * Creates new form content_awal
     */
    public content_awal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustom1 = new custom.panelCustom();
        text = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(63, 68, 77));
        setLayout(new java.awt.CardLayout());

        panelCustom1.setRoundBottomLeft(40);
        panelCustom1.setRoundBottomRight(40);
        panelCustom1.setRoundTopLeft(40);
        panelCustom1.setRoundTopRight(40);

        text.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        text.setText("Management Warehouse");

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-ware.png"))); // NOI18N

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(text)
                .addGap(6, 6, 6)
                .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(text))
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelCustom1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambar;
    private custom.panelCustom panelCustom1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
