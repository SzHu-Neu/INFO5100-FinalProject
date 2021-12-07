/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerWorkArea;


import Business.CommerceSystem;
import Business.Order.Order;
import Business.Roles.PurchaseEnt.UserOrg.Customer;
import Business.Roles.Role;
import Business.Roles.SaleEnt.ShopOrg.Shop;

import Business.UserAccount.UserAccount;
import UI.WorkArea;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends WorkArea {

    private ArrayList<Shop> shops;
    private Order curOrder;
    private Customer curCustomer;
    private Shop selectedShop;

    /**
     * Creates new form DoctorWorkAreaJPanel
     *
     * @param account
     * @param business
     * @param role
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, CommerceSystem business, Role role) {
        super( account, business, role);
        initComponents();
        this.setBackground(Color.cyan);
        this.numberJSpinner.setModel(new SpinnerNumberModel(1, 1, 10, 1));

//        this.refreshOrderTable();      
        this.addNumberJButton.setEnabled(false);
        this.minusNumberJButton.setEnabled(false);
        this.placeOrderJButton.setEnabled(false);
        this.curCustomer = (Customer) role;
        this.curOrder = new Order(this.curCustomer);
        DefaultComboBoxModel restaurantComboBoxModel = new DefaultComboBoxModel(business.getRestaurantDirectory().getRests().toArray());
        this.restaurantJComboBox.setModel(restaurantComboBoxModel);
//        this.selectedRest = (Restaurant) this.restaurantJComboBox.getSelectedItem();
        this.refreshMenuTable();

    }

    private void refreshOrderTable() {
        int tableColumnNum = this.curOrder.getOrderItemInfo().size();
        if (tableColumnNum != 0) {
            this.placeOrderJButton.setEnabled(true);
        } else {
            this.placeOrderJButton.setEnabled(false);
        }
        Item[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new Item[this.curOrder.getOrderItemInfo().size()]);
        Integer[] numbers = this.curOrder.getOrderItemInfo().values().toArray(new Integer[this.curOrder.getOrderItemInfo().size()]);
        Object rowDataPendingOrder[][] = new Object[tableColumnNum][3];
        for (int idx = 0; idx < item.length; idx++) {
            rowDataPendingOrder[idx][0] = item[idx].getName(); // Name
            rowDataPendingOrder[idx][1] = item[idx].getPrice(); // Price
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
                //                System.out.println("Selected: ");
                addNumberJButton.setEnabled(true);
                minusNumberJButton.setEnabled(true);
            }
        });

        this.addNumberJButton.setEnabled(false);
        this.minusNumberJButton.setEnabled(false);
    }

    private void refreshMenuTable() {
        this.selectedRest = (Restaurant) this.restaurantJComboBox.getSelectedItem();
        int tableColumnNum = this.selectedRest.getMenu().getItems().size();
        Object rowDataItems[][] = new Object[tableColumnNum][2];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            rowDataItems[idx][0] = this.selectedRest.getMenu().getItems().get(idx).getName(); // Name
            rowDataItems[idx][1] = this.selectedRest.getMenu().getItems().get(idx).getPrice(); // Price
        }
        Object MenuColNames[] = {"Name", "Price"};
        this.menuJtable.setModel(new DefaultTableModel(rowDataItems, MenuColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
        );
        ListSelectionModel cellSelectionModel = this.menuJtable.getSelectionModel();
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
        menuJtable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        restaurantJComboBox = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJtable = new javax.swing.JTable();
        menuJLable = new javax.swing.JLabel();
        addToOrderJButton = new javax.swing.JButton();
        placeOrderJButton = new javax.swing.JButton();
        addNumberJButton = new javax.swing.JButton();
        minusNumberJButton = new javax.swing.JButton();
        checkAllOrderJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numberJSpinner = new javax.swing.JSpinner();

        menuJtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(menuJtable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("CustomerPanel");

        restaurantJComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        restaurantJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantJComboBoxActionPerformed(evt);
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
        orderJtable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orderJtableFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(orderJtable);

        menuJLable.setText("Menu");

        addToOrderJButton.setText("Add");
        addToOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderJButtonActionPerformed(evt);
            }
        });

        placeOrderJButton.setText("PlaceOrder");
        placeOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderJButtonActionPerformed(evt);
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

        checkAllOrderJButton.setText("Check your orders");
        checkAllOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllOrderJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Order");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(checkAllOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(numberJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(addToOrderJButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(restaurantJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeOrderJButton))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addNumberJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minusNumberJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(menuJLable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAllOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(restaurantJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuJLable)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addNumberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minusNumberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placeOrderJButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToOrderJButton)
                    .addComponent(numberJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNumberJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNumberJButtonActionPerformed
        // TODO add your handling code here:
//        if(this.curOrder.getRestaurant().getName() != this.restaurantJComboBox.getSelectedItem().toString()) {
//             
//        } 
        int index = this.orderJtable.getSelectedRow();
        Item[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new Item[this.curOrder.getOrderItemInfo().size()]);
        int curNum = this.curOrder.getOrderItemInfo().get(item[index]);
        this.curOrder.getOrderItemInfo().put(item[index], curNum + 1);
        //        refreshOrderTable();
        this.orderJtable.setValueAt(curNum + 1, index, 2);
    }//GEN-LAST:event_addNumberJButtonActionPerformed

    private void minusNumberJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusNumberJButtonActionPerformed
        // TODO add your handling code here:
        int index = this.orderJtable.getSelectedRow();
        Item[] item = this.curOrder.getOrderItemInfo().keySet().toArray(new Item[this.curOrder.getOrderItemInfo().size()]);
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
        jdl.add(new CheckOrderJPanel(this.curCustomer.getPlacedOrderInCustomer()));
        jdl.setSize(800, 600);
        jdl.setModal(true);
        jdl.setLocationRelativeTo(null);
        jdl.setVisible(true);
    }//GEN-LAST:event_checkAllOrderJButtonActionPerformed

    private void placeOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderJButtonActionPerformed
        // TODO add your handling code here:
        try {
            this.curOrder.setRestaurant(selectedRest);
            this.selectedRest.addOrderInRest(curOrder);
            this.curOrder.setStatus(Order.StatusCode.ToBeProcessed);
            this.curOrder.setOrderDate(new Date());
            this.curOrder = new Order(this.curCustomer);
            this.refreshOrderTable();
            JOptionPane.showMessageDialog(this, "SUCCESS", "Result", -1);
//            JOptionPane.showMessageDialog(
//                    this, "", "Failure", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.print(e);
        }

    }//GEN-LAST:event_placeOrderJButtonActionPerformed

    private void addToOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderJButtonActionPerformed
        int selectedIndex = this.menuJtable.getSelectedRow();
        if (selectedIndex == -1) {
            // Selected first
        }
        Item item = this.selectedRest.getMenu().getItem(selectedIndex);
//        Integer number = (Integer) 
        int number = Integer.parseInt(this.numberJSpinner.getValue().toString());
        this.curOrder.addOrderItem(item, number);
        this.refreshOrderTable();
    }//GEN-LAST:event_addToOrderJButtonActionPerformed

    private void restaurantJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantJComboBoxActionPerformed
        // TODO add your handling code here:
        // Refresh Menu and new order

//        this.refreshMenuTable();
        this.curOrder = new Order(this.curCustomer);
        this.refreshOrderTable();
        this.refreshMenuTable();
    }//GEN-LAST:event_restaurantJComboBoxActionPerformed

    private void orderJtableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_orderJtableFocusLost
        // TODO add your handling code here:
        System.out.print("www");
    }//GEN-LAST:event_orderJtableFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNumberJButton;
    private javax.swing.JButton addToOrderJButton;
    private javax.swing.JButton checkAllOrderJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel menuJLable;
    private javax.swing.JTable menuJtable;
    private javax.swing.JButton minusNumberJButton;
    private javax.swing.JSpinner numberJSpinner;
    private javax.swing.JTable orderJtable;
    private javax.swing.JButton placeOrderJButton;
    private javax.swing.JComboBox<String> restaurantJComboBox;
    // End of variables declaration//GEN-END:variables
}
