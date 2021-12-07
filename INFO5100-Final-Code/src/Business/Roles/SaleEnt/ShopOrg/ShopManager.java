/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.ShopOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.ShopManagerWorkArea.ShopManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class ShopManager extends Role {

    public ShopManager() {
        super(Role.Type.ShopManager);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new ShopManagerAreaJPanel(account, business, this);
    }
}
