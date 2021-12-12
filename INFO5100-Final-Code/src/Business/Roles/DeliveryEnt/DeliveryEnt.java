/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt;

import Business.Order.DeliverItem;
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class DeliveryEnt {

    private ArrayList<DeliverItem> deliverItems;
    
    private ArrayList<DistributionOrg> dOrgList;

    public void addWorkRequest(DeliverItem e) {
        this.deliverItems.add(e);
    }

    public void addDeliverItem(DeliverItem di){
        this.deliverItems.add(di);
    }

}
