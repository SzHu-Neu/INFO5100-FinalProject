/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.WarehouseOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.WarehouseManagerWorkArea.WarehouseManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class WarehouseManager extends Role {

    public WarehouseManager() {
        super(Role.Type.WarehouseManager);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new WarehouseManagerAreaJPanel(account, business, this);
    }
}
