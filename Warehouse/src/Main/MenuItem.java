/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Administrator
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * Creates new form MenuItem
     */
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;
    
    public MenuItem(Icon icon, boolean sbm, Icon iconSub, String menuName, ActionListener act, MenuItem... subMenu) {
        initComponents();
        
        lb_icon.setIcon(icon);
        lb_menuName.setText(menuName);
        lb_iconSub.setIcon(iconSub);
        lb_iconSub.setVisible(sbm);
        
        if (act != null){
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for (MenuItem subMenu1 : subMenu) {
            this.subMenu.add(subMenu1);
            subMenu1.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_icon = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_menuName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 39, 47));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lb_iconSub.setForeground(new java.awt.Color(255, 255, 255));

        lb_menuName.setForeground(new java.awt.Color(255, 255, 255));
        lb_menuName.setText("Menu Item...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_iconSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_menuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private boolean sw = true;

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Menu_Utama mainFrame = (Menu_Utama) javax.swing.SwingUtilities.getWindowAncestor(this);

        if (mainFrame.activeMenuItem == null || !mainFrame.activeMenuItem.getSubMenu().contains(this)) {
            mainFrame.setActiveMenuItem(this);
        } else {
            mainFrame.setActiveSubMenuItem(this);
        }

        setBackground(new java.awt.Color(162, 166, 173)); // Change background to 
        lb_menuName.setForeground(new java.awt.Color(0, 0, 0)); // Change text color to 

        if (showing) {
            hideMenu();
        } else {
            showMenu();
        }

        if (act != null) {
            act.actionPerformed(null);
        }
// //untuk warna jika diklik
//        if(sw){
//        lb_menuName.setForeground(new java.awt.Color(0,0,0));
//        setBackground(new java.awt.Color(255,255,255));
//        sw = false;
//        }else{
//        lb_menuName.setForeground(new java.awt.Color(255,255,255));
//        setBackground(new java.awt.Color(35,39,47));
//        sw = true;
//        }
//        //setBackground(new java.awt.Color(255,255,255));
//        //setBackground(Color.red);
//        if (showing) {
//            hideMenu();
//        }else{
//            showMenu();
//        }
//        if (act != null){
//            act.actionPerformed(null);
//        }
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_menuName;
    // End of variables declaration//GEN-END:variables

    public void resetBackground() {
        setBackground(new java.awt.Color(35, 39, 47));
        lb_menuName.setForeground(new java.awt.Color(255, 255, 255));
    }

    protected void hideMenu() {
        new Thread(() -> {
            for (int i = subMenu.size() - 1; i >= 0; i--) {
                sleep();
                subMenu.get(i).setVisible(false);
                subMenu.get(i).hideMenu();
            }
            getParent().repaint();
            getParent().revalidate();
            showing = false;
        }).start();
    }

    private void showMenu() {
        new Thread(() -> {
            for (int i = 0; i < subMenu.size(); i++) {
                sleep();
                subMenu.get(i).setVisible(true);

            }
            getParent().repaint();
            getParent().revalidate();
            showing = true;
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
}
