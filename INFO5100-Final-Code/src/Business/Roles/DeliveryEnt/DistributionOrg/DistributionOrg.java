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
import java.util.ArrayList;
import Business.Order.DeliverItem;

/**
 *
 * @author Dom
 */
public class DistributionOrg {

    private String name;
    private List<DistributionManager> managerList;
    private List<TransportationOrg> transOrgList;
    private DeliveryEnt delivertEnterprise;
    private ArrayList<DeliverItem> deliverItems;

    public DistributionOrg(DeliveryEnt de, String name) {
        this.delivertEnterprise = de;
        this.name = name;
        this.managerList = new ArrayList<DistributionManager>();
        this.transOrgList = new ArrayList<TransportationOrg>();
        this.deliverItems = new ArrayList<DeliverItem>();

    }

    public List<DistributionManager> getManagerList() {
        return managerList;
    }

    public DeliveryEnt getDeliveryEnt() {
        return delivertEnterprise;
    }

    public List<TransportationOrg> getTransportationOrgList() {
        return transOrgList;
    }

    public DistributionManager createManager() {
        DistributionManager disManager = new DistributionManager(this);
        this.managerList.add(disManager);
        return disManager;
    }

    public void addManager(DistributionManager dm) {
        this.managerList.add(dm);
    }

    public TransportationOrg createTransOrg(String name) {
        TransportationOrg tmp = new TransportationOrg(name);
        this.transOrgList.add(tmp);
        return tmp;
    }

    public void addTransOrg(TransportationOrg tOrg) {
        this.transOrgList.add(tOrg);
    }

    public void removeManager(DistributionManager dm) {
        this.managerList.remove(dm);
    }

    public void removeManager(int index) {
        this.managerList.remove(index);
    }

    public void addTransportationOrg(TransportationOrg org) {
        this.transOrgList.add(org);
    }

    public void removeTransportationOrg(TransportationOrg org) {
        this.transOrgList.remove(org);
    }

    public void addDeliverItem(DeliverItem di) {
        this.deliverItems.add(di);
    }

    public ArrayList<DeliverItem> getDeliverItems() {
        return deliverItems;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
