/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ShopManagerWorkArea;

import Business.CommerceSystem;
import Business.Order.Order;
import Business.Roles.DeliveryEnt.DeliveryEnt;

import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ekoxier
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    ArrayList<Order> orderList;
    DistributionOrg selectedDisOrg;

    /**
     * Creates new form ManageOrdersJPanel
     *
     * @param orderList
     * @param system
     */
    public ManageOrdersJPanel(ArrayList<Order> orderList, CommerceSystem system) {
        initComponents();
        this.orderList = orderList;
        DefaultComboBoxModel deliveryComboBoxModel = new DefaultComboBoxModel(system.getDeliveryEntDirectory().listDistributionOrgs().toArray());
        this.jComboBoxDelivery.setModel(deliveryComboBoxModel);
        this.selectedDisOrg = (DistributionOrg) this.jComboBoxDelivery.getSelectedItem();
        refreshTable();
    }

    private void refreshTable() {
        Object ordersDisplayData[][] = new Object[this.orderList.size()][4];

        for (int idx = 0; idx < orderList.size(); idx++) {
            ordersDisplayData[idx][0] = this.orderList.get(idx).getCheckoutDate(); // Date
            ordersDisplayData[idx][1] = this.orderList.get(idx).getTotalPrice(); // Price  
            ordersDisplayData[idx][2] = this.orderList.get(idx).getUserOrg(); // Customer
            ordersDisplayData[idx][3] = this.orderList.get(idx).getIsProcessed() ? "Processed" : "NotProcessed"; // isProcessed
        }
        Object OrderColNames[] = {"Date", "TotalPrice", "Customer", "IsProcessed"};

        this.ordersJTable.setModel(new DefaultTableModel(ordersDisplayData, OrderColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        ListSelectionModel cellSelectionModel = this.ordersJTable.getSelectionModel();
        cellSelectionModel.clearSelection();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Set true

            }
        });
        // Set false
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordersJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxDelivery = new javax.swing.JComboBox<>();

        ordersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ordersJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Orders");

        jButton1.setText("Send by");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxDelivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxDelivery, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.ordersJTable.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
//        this.orderList.get(selectedRow).orderSetDeliveryEnt(this.selectedDeliveryEnt);
        this.orderList.get(selectedRow).orderSetDeliveryEnt(this.selectedDisOrg);
        ///////////////////////////////////////////////
        this.orderList.get(selectedRow).setProcessed();
        refreshTable();
        // Log
        System.out.printf("Process the order \n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeliveryActionPerformed
        // TODO add your handling code here:
        this.selectedDisOrg = (DistributionOrg) this.jComboBoxDelivery.getSelectedItem();
    }//GEN-LAST:event_jComboBoxDeliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordersJTable;
    // End of variables declaration//GEN-END:variables
}
