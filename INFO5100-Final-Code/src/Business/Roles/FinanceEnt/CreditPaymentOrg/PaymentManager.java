/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FinanceEnt.CreditPaymentOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.PaymentManagerWorkArea.PaymentManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class PaymentManager extends Role {

    CreditPaymentOrg creditPaymentOrg;

    public PaymentManager(CreditPaymentOrg cpo) {
        super(Role.Type.PaymentManager);
        this.creditPaymentOrg = cpo;
    }

    public CreditPaymentOrg getCreditPaymentOrg() {
        return creditPaymentOrg;
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new PaymentManagerAreaJPanel(account, business, this);
    }
}
