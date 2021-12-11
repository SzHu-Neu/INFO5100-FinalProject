package UI.CustomerWorkArea;

import Business.CommerceSystem;
import Business.Order.SaleMenuItem;
import Business.Order.Order;
import Business.Roles.PurchaseEnt.UserOrg.Customer;
import Business.Roles.Role;
import Business.Roles.SaleEnt.ShopOrg.ShopOrg;

import Business.UserAccount.UserAccount;
import UI.WorkArea;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends WorkArea {

    private ArrayList<ShopOrg> shops;
    private Order curOrder;
    private Customer curCustomer;
    private ShopOrg selectedShop;

    /**
     * Creates new form WorkAreaJPanel
     *
     * @param account
     * @param business
     * @param role
     */
    public CustomerAreaJPanel(UserAccount account, CommerceSystem business, Role role) {
        super(account, business, role);
        initComponents();
        this.setBackground(Color.cyan);
        this.numberJSpinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));
//        this.refreshOrderTable();      
        this.addNumberJButton.setEnabled(false);
        this.minusNumberJButton.setEnabled(false);
        this.checkoutJButton.setEnabled(false);
        this.curCustomer = (Customer) role;
        this.curOrder = new Order(this.curCustomer.getUserOrg());
        DefaultComboBoxModel shopComboBoxModel = new DefaultComboBoxModel(business.getSaleEntDirectory().getAllShops().toArray());
        this.shopJComboBox.setModel(shopComboBoxModel);
//        this.selectedRest = (Restaurant) this.restaurantJComboBox.getSelectedItem();
        refreshSaleItemsTable();
    }

    private void refreshOrderTable() {
        int tableColumnNum = this.curOrder.getOrderItemInfo().size();
        if (tableColumnNum != 0) {
            this.checkoutJButton.setEnabled(true);
        } else {
            this.checkoutJButton.setEnabled(false);
        }
        SaleMenuItem[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new SaleMenuItem[this.curOrder.getOrderItemInfo().size()]);
        Integer[] numbers = this.curOrder.getOrderItemInfo().values().toArray(new Integer[this.curOrder.getOrderItemInfo().size()]);
        Object rowDataPendingOrder[][] = new Object[tableColumnNum][3];
        for (int idx = 0; idx < item.length; idx++) {
            rowDataPendingOrder[idx][0] = item[idx].getName(); // Name
            rowDataPendingOrder[idx][1] = item[idx].getSalePrice(); // Price
            rowDataPendingOrder[idx][2] = numbers[idx]; // Number
        }
        Object OrderColNames[] = {"Name", "Price", "Number"};
        this.orderJtable.setModel(new DefaultTableModel(rowDataPendingOrder, OrderColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;

            }
        }
        );
        ListSelectionModel cellSelectionModel = this.orderJtable.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                addNumberJButton.setEnabled(true);
                minusNumberJButton.setEnabled(true);
            }
        });

        this.addNumberJButton.setEnabled(false);
        this.minusNumberJButton.setEnabled(false);
    }

    private void refreshSaleItemsTable() {
        this.selectedShop = (ShopOrg) this.shopJComboBox.getSelectedItem();
        int tableColumnNum = this.selectedShop.getSaleItemList().size();
        Object ColNames[] = {"Name", "SalePrice", "Remains", "Description"};
        Object rowDataItems[][] = new Object[tableColumnNum][ColNames.length];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            rowDataItems[idx][0] = this.selectedShop.getSaleItemList().get(idx).getName(); // Name
            rowDataItems[idx][1] = this.selectedShop.getSaleItemList().get(idx).getSalePrice(); // SalePrice
            rowDataItems[idx][2] = this.selectedShop.getSaleItemList().get(idx).getRemainNumber(); // RemainNumber
            rowDataItems[idx][3] = this.selectedShop.getSaleItemList().get(idx).getDescription(); // Description
        }

        this.saleJtable.setModel(new DefaultTableModel(rowDataItems, ColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );
        ListSelectionModel cellSelectionModel = this.saleJtable.getSelectionModel();
        cellSelectionModel.clearSelection();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Selected: ");
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        saleJtable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        shopJComboBox = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJtable = new javax.swing.JTable();
        menuJLable = new javax.swing.JLabel();
        addToOrderJButton = new javax.swing.JButton();
        checkoutJButton = new javax.swing.JButton();
        addNumberJButton = new javax.swing.JButton();
        minusNumberJButton = new javax.swing.JButton();
        checkAllOrderJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numberJSpinner = new javax.swing.JSpinner();

        saleJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(saleJtable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Customer Panel");

        shopJComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        shopJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopJComboBoxActionPerformed(evt);
            }
        });

        orderJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderJtable);

        menuJLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuJLable.setText("Sale Items");

        addToOrderJButton.setText("Add");
        addToOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderJButtonActionPerformed(evt);
            }
        });

        checkoutJButton.setText("Checkout");
        checkoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutJButtonActionPerformed(evt);
            }
        });

        addNumberJButton.setText("+");
        addNumberJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNumberJButtonActionPerformed(evt);
            }
        });

        minusNumberJButton.setText("-");
        minusNumberJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusNumberJButtonActionPerformed(evt);
            }
        });

        checkAllOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        checkAllOrderJButton.setText("View checkout order info");
        checkAllOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllOrderJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numberJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addToOrderJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menuJLable)
                        .addComponent(shopJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(checkAllOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkoutJButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minusNumberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNumberJButton))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shopJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkAllOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuJLable)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addNumberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusNumberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToOrderJButton)
                    .addComponent(numberJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutJButton))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNumberJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumberJButtonActionPerformed
        // TODO add your handling code here:
        int index = this.orderJtable.getSelectedRow();
        SaleMenuItem[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new SaleMenuItem[this.curOrder.getOrderItemInfo().size()]);
        int curNum = this.curOrder.getOrderItemInfo().get(item[index]);
        this.curOrder.getOrderItemInfo().put(item[index], curNum + 1);
        this.orderJtable.setValueAt(curNum + 1, index, 2);
    }//GEN-LAST:event_addNumberJButtonActionPerformed

    private void minusNumberJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusNumberJButtonActionPerformed
        // TODO add your handling code here:
        int index = this.orderJtable.getSelectedRow();
        SaleMenuItem[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new SaleMenuItem[this.curOrder.getOrderItemInfo().size()]);
        int curNum = this.curOrder.getOrderItemInfo().get(item[index]);
        if (curNum > 1) {
            this.curOrder.getOrderItemInfo().put(item[index], curNum - 1);
            this.orderJtable.setValueAt(curNum - 1, index, 2);
        } else {
            this.curOrder.getOrderItemInfo().remove(item[index]);
            refreshOrderTable();
        }

    }//GEN-LAST:event_minusNumberJButtonActionPerformed

    private void checkAllOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllOrderJButtonActionPerformed
        // TODO add your handling code here:
        JDialog jdl = new JDialog();
        jdl.add(new ViewOrdersJPanel(this.curCustomer.getValidOrders()));
        jdl.setSize(800, 600);
        jdl.setModal(true);
        jdl.setLocationRelativeTo(null);
        jdl.setVisible(true);
    }//GEN-LAST:event_checkAllOrderJButtonActionPerformed

    private void checkoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutJButtonActionPerformed
        // TODO add your handling code here:
        JDialog jdl = new JDialog();
        jdl.add(new CheckoutOrderJPanel(this.curCustomer.getUserOrg(), this.business, this.curOrder.getTotalPrice(), this.curOrder));
        jdl.setSize(800, 600);
        jdl.setModal(true);
        jdl.setLocationRelativeTo(null);
        jdl.setVisible(true);
//            this.curOrder.chekoutOrder();
//            this.selectedShop.addOrderInshop(curOrder);
//            this.curOrder.setCheckoutDate(new Date());
//            this.curOrder = new Order(this.curCustomer.getUserOrg()); // Place a new unassigned order to be processed
//            this.refreshOrderTable();
//            JOptionPane.showMessageDialog(this, "SUCCESS", "Result", -1);
    }//GEN-LAST:event_checkoutJButtonActionPerformed

    private void addToOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderJButtonActionPerformed
        int selectedIndex = this.saleJtable.getSelectedRow();
        if (selectedIndex == -1) {
            // Selected first
        }
        SaleMenuItem item = this.selectedShop.getSaleItemList().get(selectedIndex);
//        Integer number = (Integer) 
        int addedNumber = Integer.parseInt(this.numberJSpinner.getValue().toString());
        int alreadyInOrderNumber = this.curOrder.getOrderItemNumber(item);
        if (addedNumber + alreadyInOrderNumber > item.getRemainNumber()) {
            JOptionPane.showMessageDialog(
                    this, "Exceeds Remain Number", "Failure", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.curOrder.addOrderItem(item, addedNumber);
        this.refreshOrderTable();
    }//GEN-LAST:event_addToOrderJButtonActionPerformed

    private void shopJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopJComboBoxActionPerformed
        // TODO add your handling code here:
        // Refresh Menu and new order

//        this.refreshMenuTable();
        this.curOrder = new Order(this.curCustomer.getUserOrg());
        this.refreshOrderTable();
        this.refreshSaleItemsTable();
    }//GEN-LAST:event_shopJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNumberJButton;
    private javax.swing.JButton addToOrderJButton;
    private javax.swing.JButton checkAllOrderJButton;
    private javax.swing.JButton checkoutJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menuJLable;
    private javax.swing.JButton minusNumberJButton;
    private javax.swing.JSpinner numberJSpinner;
    private javax.swing.JTable orderJtable;
    private javax.swing.JTable saleJtable;
    private javax.swing.JComboBox<String> shopJComboBox;
    // End of variables declaration//GEN-END:variables
}
