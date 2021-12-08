/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.ShopOrg;

import Business.CommerceSystem;
import Business.Order.SaleMenuItem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.ShopManagerWorkArea.ShopManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class ShopManager extends Role {

    public ShopOrg shopOrganization;

    public ShopManager(ShopOrg so) {
        super(Role.Type.ShopManager);
        this.shopOrganization = shopOrganization;
    }

    public void NotifyInStock(SaleMenuItem item) {
        this.shopOrganization.getSaleEnterprise().notifyWareHouse(item);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new ShopManagerAreaJPanel(account, business, this);
    }
}
