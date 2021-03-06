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

    private FinanceOrg financeOrg;

    Accountant(FinanceOrg fo) {
        super(Role.Type.Accountant);
        this.financeOrg = fo;
    }

    public FinanceOrg getFinanceOrg() {
        return financeOrg;
    }

    public void analyze() {
//        analyze the transaction history 
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new AccountantAreaJPanel(account, business, this);
    }
}
