/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.WorkArea;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ekoxier
 */
public class SystemAdminJPanel extends WorkArea {

    CommerceSystem system;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SystemAdminJPanel(UserAccount account, CommerceSystem business, Role role) {
        super(account, business, role);
        initComponents();
        this.setBackground(Color.red);
        this.system = business;
        this.refreshTable();
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
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Role"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton2)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(342, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<UserAccount> accountList = system.getUserAccountDirectory().getActiveUserAccountList();
        accountList.get(this.jTable1.getSelectedRow()).setIsDeleted(true);
        JOptionPane.showMessageDialog(this, "Delete Success", "Result", -1);
        this.refreshTable();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void refreshTable() {
        ArrayList<UserAccount> accountList = system.getUserAccountDirectory().getActiveUserAccountList();
        int tableColumnNum = accountList.size();
        Object accountData[][] = new Object[tableColumnNum][3];
        for (int idx = 0; idx < tableColumnNum; idx++) {
            accountData[idx][0] = accountList.get(idx).getUsername(); // getUsername
            accountData[idx][1] = accountList.get(idx).getPassword(); // getPassword
            accountData[idx][2] = accountList.get(idx).getRoleType(); // getRole
        }
        Object OrderColNames[] = {"Username", "Password", "Role"};
        this.jTable1.setModel(new DefaultTableModel(accountData, OrderColNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1 || column == 0;
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
                String value = aValue.toString();
                if (!value.isEmpty()) {
                    if (columnIndex == 0) {
                        system.getUserAccountDirectory().getActiveUserAccountList().get(rowIndex).setUsername(value);
                        refreshTable();
                    } else if (columnIndex == 1) {
                        system.getUserAccountDirectory().getActiveUserAccountList().get(rowIndex).setPassword(value);
                        refreshTable();
                    }
                }
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}