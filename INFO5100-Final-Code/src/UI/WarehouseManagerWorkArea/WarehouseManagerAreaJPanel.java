/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.WarehouseManagerWorkArea;

import Business.CommerceSystem;
import Business.Order.DeliverItem;
import Business.Order.SaleMenuItem;
import Business.Roles.Role;
import Business.Roles.SaleEnt.SaleEnt;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseManager;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;
import Business.UserAccount.UserAccount;
import UI.WorkArea;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ekoxier
 */
public class WarehouseManagerAreaJPanel extends WorkArea {

    WarehouseManager warehouseManager;
    WarehouseOrg warehouseOrg;
    SaleEnt saleEnt;

    /**
     * Creates new form WarehouseManagerAreaJPanel
     */
    public WarehouseManagerAreaJPanel(UserAccount account, CommerceSystem business, Role role) {
        super(account, business, role);
        initComponents();
        this.setBackground(Color.cyan);
        this.warehouseManager = (WarehouseManager) role;
        this.warehouseOrg = this.warehouseManager.getWarhouseOrg();
        this.saleEnt = this.warehouseManager.getWarhouseOrg().getSaleEnterprise();
        this.jBtAccept.setEnabled(false);
        this.refreshJTableSaleItem();
        this.refreshJTableDelivery();
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
        jTableSaleItem = new javax.swing.JTable();
        enterpriseLabel1 = new javax.swing.JLabel();
        jBtRequest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDelivery = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBtAccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTableSaleItem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableSaleItem);

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Warehouse Manager Panel");

        jBtRequest.setText("Request InStock");
        jBtRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRequestActionPerformed(evt);
            }
        });

        jTableDelivery.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableDelivery);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Delivery Table");

        jBtAccept.setText("Accept");
        jBtAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAcceptActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Sale Items");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtAccept))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtRequest)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtAccept)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtRequest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.jTableSaleItem.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
        SaleMenuItem selectedItem = this.saleEnt.getSaleItemInNotDeleted(selectedRow);
        JDialog jdl = new JDialog();
        jdl.add(new InStockOptionPanel(selectedItem, business.getFactoryEntDirectory().listAllProductOrgs(), this.warehouseOrg));
        jdl.setSize(400, 300);
        jdl.setModal(true);
        jdl.setLocationRelativeTo(null);
        jdl.setVisible(true);
    }//GEN-LAST:event_jBtRequestActionPerformed

    private void jBtAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAcceptActionPerformed
        // TODO add your handling code here:
        int selectedIdx = this.jTableDelivery.getSelectedRow();
        if (selectedIdx == -1) {
            return;
        }
        if (this.warehouseOrg.getDeliveryItem(selectedIdx).getAdditionalInfo().getToOrg().equals(this.warehouseOrg)
                && this.warehouseOrg.getDeliveryItem(selectedIdx).getCurrentStatus() == DeliverItem.DeliverItemStatus.Delivered) {

            // which means this is a receive organization 
            this.warehouseOrg.getDeliveryItem(selectedIdx).setReceived();

            // In stock operation
            String itemName = this.warehouseOrg.getDeliveryItem(selectedIdx).getName();
            int quantity = this.warehouseOrg.getDeliveryItem(selectedIdx).getQuantity();
            this.warehouseOrg.getSaleEnterprise().getSaleMenuItemByName(itemName).inStock(quantity);

            refreshJTableSaleItem();
            refreshJTableDelivery();
        } else {
            // Can not receive
            return;
        }
    }//GEN-LAST:event_jBtAcceptActionPerformed

    private void refreshJTableSaleItem() {
        int tableColumnNum = this.saleEnt.getNotDeletedSaleItemList().size();
        Object ColNames[] = {"Name", "In Price", "Remain Number",};
        Object rowDataItems[][] = new Object[tableColumnNum][ColNames.length];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            rowDataItems[idx][0] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getName(); // Name
            rowDataItems[idx][1] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getInPrice(); // In Price
            rowDataItems[idx][2] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getRemainNumber(); // Remain Number
        }

        this.jTableSaleItem.setModel(new DefaultTableModel(rowDataItems, ColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );
    }

    private void refreshJTableDelivery() {
        final ArrayList<DeliverItem> deliverItems = this.warehouseOrg.getRelatedDeliverItems();
        int tableColumnNum = deliverItems.size();
        Object ColNames[] = {"ItemName", "ItemNum", "FromOrg", "ToOrg", " Status", "DeliveryOrderNum", "Delivery"};
        Object rowDataItems[][] = new Object[tableColumnNum][ColNames.length];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            rowDataItems[idx][0] = deliverItems.get(idx).getName(); // Name
            rowDataItems[idx][1] = deliverItems.get(idx).getQuantity(); // Quantity;
            rowDataItems[idx][2] = deliverItems.get(idx).getAdditionalInfo().getFromOrg(); // From which Org
            rowDataItems[idx][3] = deliverItems.get(idx).getAdditionalInfo().getToOrg(); // To which Org
            rowDataItems[idx][4] = deliverItems.get(idx).getCurrentStatus();
            rowDataItems[idx][5] = deliverItems.get(idx).getDeliveryOrderNum() != -1 ? deliverItems.get(idx).getDeliveryOrderNum() : "NotAvaNow";
            rowDataItems[idx][6] = deliverItems.get(idx).getAdditionalInfo().getDisOrg() != null ? deliverItems.get(idx).getAdditionalInfo().getDisOrg() : "NotAvaNow";
//            rowDataItems[idx][4] = deliverItems
        }
        this.jTableDelivery.setModel(new DefaultTableModel(rowDataItems, ColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );
        ListSelectionModel cellSelectionModel = this.jTableDelivery.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = jTableDelivery.getSelectedRow();
                if (selectedRow == -1) {
                    return;
                }
                if (deliverItems.get(selectedRow).getCurrentStatus() == DeliverItem.DeliverItemStatus.Delivered) {
                    jBtAccept.setEnabled(true);
                }

            }
        });
        this.jBtAccept.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JButton jBtAccept;
    private javax.swing.JButton jBtRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDelivery;
    private javax.swing.JTable jTableSaleItem;
    // End of variables declaration//GEN-END:variables

}
