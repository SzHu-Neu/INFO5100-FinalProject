/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FinanceEnt;

import Business.Roles.FinanceEnt.CreditPaymentOrg.CreditPaymentOrg;

/**
 *
 * @author sichengzhou
 */
public class FinanceEnt {

    private CreditPaymentOrg creditPaymentOrg;

    public FinanceEnt() {
        this.creditPaymentOrg = new CreditPaymentOrg();
    }

    public CreditPaymentOrg getCreditPaymentOrg() {
        return creditPaymentOrg;
    }

    public void setCreditPaymentOrg(CreditPaymentOrg creditPaymentOrg) {
        this.creditPaymentOrg = creditPaymentOrg;
    }

}
