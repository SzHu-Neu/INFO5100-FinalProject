/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.WarehouseOrg;

import Business.Order.DeliverItem;
import Business.Order.SaleMenuItem;
import Business.Roles.InDeliverOrganization;
import Business.Roles.SaleEnt.SaleEnt;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class WarehouseOrg extends InDeliverOrganization {

    private ArrayList<WarehouseManager> warehouseManagerList;
    private SaleEnt saleEnterprise;
    private ArrayList<DeliverItem> deliverItemsInWarehouse;

    public WarehouseOrg(SaleEnt se, String address, String name) {
        super(name, address);
        this.saleEnterprise = se;
        this.warehouseManagerList = new ArrayList<WarehouseManager>();
        this.deliverItemsInWarehouse = new ArrayList<DeliverItem>();
    }

    public SaleEnt getSaleEnterprise() {
        return saleEnterprise;
    }

    public WarehouseManager createWarehouseManager() {
        WarehouseManager tmp = new WarehouseManager(this);
        this.warehouseManagerList.add(tmp);
        return tmp;
    }

    public void addWarehouseManager(WarehouseManager sm) {
        this.warehouseManagerList.add(sm);
    }

    public void removeWarehouseManager(int index) {
        this.warehouseManagerList.remove(index);
    }

    public void removeWarehouseManager(WarehouseManager sm) {
        this.warehouseManagerList.remove(sm);
    }

    public ArrayList<WarehouseManager> getWarehouseManagerList() {
        return warehouseManagerList;
    }

    public String getAddress() {
        return super.getAddress();
    }
}
