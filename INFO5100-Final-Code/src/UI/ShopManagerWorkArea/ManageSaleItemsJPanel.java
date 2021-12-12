/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ShopManagerWorkArea;

import Business.Roles.SaleEnt.SaleEnt;
import Business.Roles.SaleEnt.ShopOrg.ShopManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ekoxier
 */
public class ManageSaleItemsJPanel extends javax.swing.JPanel {

    private SaleEnt saleEnt;

    /**
     * Creates new form ManageMenuJPanel
     *
     */
    public ManageSaleItemsJPanel(ShopManager shopManager) {
        initComponents();
        this.saleEnt = shopManager.getShopOrganization().getSaleEnterprise();
        refreshMenu();
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
        menuJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inPriceJtf = new javax.swing.JTextField();
        createJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        salePriceJTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "SalePrice", "InPrice", "Number", "Description"
            }
        ));
        jScrollPane1.setViewportView(menuJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("New Item");

        jLabel2.setText("Name:");

        jLabel3.setText("SalePrice:");

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("InPrice:");

        salePriceJTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salePriceJTfActionPerformed(evt);
            }
        });

        jLabel5.setText("Description:");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescription);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Sale Items");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inPriceJtf)
                            .addComponent(salePriceJTf)
                            .addComponent(nameJTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 84, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(salePriceJTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inPriceJtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        String name = this.nameJTextField.getText();
        int salePrice = Integer.parseInt(this.salePriceJTf.getText());
        int inPrice = Integer.parseInt(this.inPriceJtf.getText());
        String description = this.jTextAreaDescription.getText();
        this.saleEnt.addSaleItem(name, salePrice, inPrice, description);
        refreshMenu();
        // Log
        System.out.printf("SaleItem created: Name: %s\n", name);
        this.inPriceJtf.setText("");
        this.salePriceJTf.setText("");
        this.nameJTextField.setText("");
    }//GEN-LAST:event_createJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int idx = this.menuJTable.getSelectedRow();
            this.saleEnt.delSaleItemInNotDeleted(idx);
            this.refreshMenu();
            // Log
            System.out.printf("SaleItem deleted:\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Select a row", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salePriceJTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salePriceJTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salePriceJTfActionPerformed

    private void refreshMenu() {
        int tableColumnNum = this.saleEnt.getNotDeletedSaleItemList().size();
        Object ColNames[] = {"Name", "In Price", "Sale Price", "Remain Number", "Sold Number"};
        Object rowDataItems[][] = new Object[tableColumnNum][ColNames.length];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            rowDataItems[idx][0] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getName(); // Name
            rowDataItems[idx][1] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getInPrice(); // In Price
            rowDataItems[idx][2] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getSalePrice(); // Sale Price
            rowDataItems[idx][3] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getRemainNumber(); // Remain Number
            rowDataItems[idx][4] = this.saleEnt.getNotDeletedSaleItemList().get(idx).getSoldNumber(); // Sold Number
        }

        this.menuJTable.setModel(new DefaultTableModel(rowDataItems, ColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJButton;
    private javax.swing.JTextField inPriceJtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField salePriceJTf;
    // End of variables declaration//GEN-END:variables
}
