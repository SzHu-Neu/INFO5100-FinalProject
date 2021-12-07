package Business.Roles.PurchaseEnt.UserOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class Customer extends Role {

    public Customer() {
        super(Role.Type.Customer);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
