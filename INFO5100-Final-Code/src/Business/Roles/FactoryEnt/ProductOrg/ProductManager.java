/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt.ProductOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.ProductManagerWorkArea.ProductManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class ProductManager extends Role {

    public ProductManager() {
        super(Role.Type.ProductManager);
    }

    public void sendOut() {

    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new ProductManagerAreaJPanel(account, business, this);
    }
}
