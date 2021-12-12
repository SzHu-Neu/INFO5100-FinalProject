/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Roles.DeliveryEnt.DistributionOrg;

import Business.Roles.DeliveryEnt.DistributionOrg.DistributionManager;
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationOrg;
import java.util.List;
/**
 *
 * @author Dom
 */
public class DistributionOrg {
    private List<DistributionManager> managerList;
    
    private List<TransportationOrg> transOrgList;
    
    public void addManager(DistributionManager dm){
        this.managerList.add(dm);
    }
    public void addTransOrg(TransportationOrg tOrg){
        this.transOrgList.add(tOrg);
    }

    
}
