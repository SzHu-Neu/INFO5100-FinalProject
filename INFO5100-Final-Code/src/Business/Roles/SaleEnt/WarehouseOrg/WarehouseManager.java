/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.WarehouseOrg;

import Business.CommerceSystem;
import Business.Order.DeliverItem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.WarehouseManagerWorkArea.WarehouseManagerAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class WarehouseManager extends Role {

    private WarehouseOrg warhouseOrg;

    public WarehouseManager(WarehouseOrg wo) {
        super(Role.Type.WarehouseManager);
        this.warhouseOrg = wo;
    }
    private ArrayList<DeliverItem> deliverItems;

    public void packAndSend(ArrayList<DeliverItem> sentDeliverItems) {
        // Send this to Delivery Enterprise;        
        this.deliverItems.removeAll(deliverItems);
    }

    public void proccessInStock() {
//        this.warhouseOrg
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new WarehouseManagerAreaJPanel(account, business, this);
    }
}
