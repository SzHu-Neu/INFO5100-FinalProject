/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt;

import Business.CommerceSystem;
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
import Business.Roles.FinanceEnt.CreditPaymentOrg.CreditPaymentOrg;
import Business.Roles.FinanceEnt.FinanceEnt;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Ekoxier
 */
public class DeliveryEntDirectory {

    CommerceSystem system;
    private List<DeliveryEnt> deliveryEntList;

    public DeliveryEntDirectory(CommerceSystem system) {
        this.deliveryEntList = new ArrayList<DeliveryEnt>();
        this.system = system;
    }

    public CommerceSystem getSystem() {
        return system;
    }
    public DeliveryEnt createDeliveryEnt(String name) {
        DeliveryEnt tmp = new DeliveryEnt(name);
        deliveryEntList.add(tmp);
        return tmp;
    }
    
    public ArrayList<DistributionOrg> listAllCreditPaymentOrgs() {
        ArrayList<DistributionOrg> distributionOrgs = new ArrayList<DistributionOrg>();
        for (DeliveryEnt singleDe : deliveryEntList) {
            distributionOrgs.add( singleDe. getDistributionOrg());
        }
        return distributionOrgs;
    }
}
