/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.FinanceOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.AccountantWorkArea.AccountantAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class Accountant extends Role {

    public Accountant() {
        super(Role.Type.Accountant);
    }
    
    
    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new AccountantAreaJPanel(account, business, this);
    }
}