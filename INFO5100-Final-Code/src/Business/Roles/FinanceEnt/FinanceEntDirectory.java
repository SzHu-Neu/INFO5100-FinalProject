/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FinanceEnt;

import Business.CommerceSystem;
import Business.Roles.FinanceEnt.CreditPaymentOrg.CreditPaymentOrg;
import java.util.ArrayList;

/**
 *
 * @author sichengzhou
 */
public class FinanceEntDirectory {

    private ArrayList<FinanceEnt> financeEntList;

//    private FinanceEnt financeEnt;
    CommerceSystem system;

    public FinanceEntDirectory(CommerceSystem system) {
        this.system = system;
        this.financeEntList = new ArrayList<FinanceEnt>();
    }

    public CommerceSystem getSystem() {
        return system;
    }

    public ArrayList<CreditPaymentOrg> listAllCreditPaymentOrgs() {
        ArrayList<CreditPaymentOrg> creditPaymentOrgs = new ArrayList<CreditPaymentOrg>();
        for (FinanceEnt singleFe : financeEntList) {
            creditPaymentOrgs.add(singleFe.getCreditPaymentOrg());
        }
        return creditPaymentOrgs;
    }

}
