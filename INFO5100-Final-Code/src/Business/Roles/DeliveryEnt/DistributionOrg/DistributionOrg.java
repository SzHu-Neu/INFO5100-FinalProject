/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Roles.DeliveryEnt.DistributionOrg;

import Business.Roles.DeliveryEnt.DistributionOrg.DistributionManager;
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationManager;
import Business.Roles.DeliveryEnt.DeliveryEnt;
import java.util.List;
/**
 *
 * @author Dom
 */
public class DistributionOrg {
    private String name;
    private List<DistributionManager> managerList;
    private List<TransportationOrg> transOrgList;
    private DeliveryEnt delivertEnterprise;
    public DistributionOrg(String name){
        this.name = name;
    }
    public List<DistributionManager> getManagerList() {
        return managerList;
    }    
    
    public List<TransportationOrg> getTransportationOrgList() {
        return transOrgList;
    }    
       
    public DistributionManager createManager(){
        DistributionManager disManager = new DistributionManager(this);
        this.managerList.add(disManager);
        return disManager;
    }
    
    public void addManager(DistributionManager dm){
        this.managerList.add(dm);
    }

    public TransportationOrg createTransOrg(String name){
        TransportationOrg tmp = new TransportationOrg(name);
        this.transOrgList.add(tmp);
        return tmp;
    }

    public void addTransOrg(TransportationOrg tOrg){
        this.transOrgList.add(tOrg);
    }
    
    public void removeManager(DistributionManager dm){
        this.managerList.remove(dm);
    }

    public void removeManager(int index) {
        this.managerList.remove(index);
    }

    public void addTransportationOrg(TransportationOrg org){
        this.transOrgList.add(org);
    }

    public void removeTransportationOrg(TransportationOrg org){
        this.transOrgList.remove(org);
    }
}
