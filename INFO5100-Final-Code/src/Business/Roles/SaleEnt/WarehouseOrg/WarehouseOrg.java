/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.WarehouseOrg;

import Business.Order.SaleMenuItem;
import Business.Roles.SaleEnt.SaleEnt;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class WarehouseOrg {

    private ArrayList<WarehouseManager> warehouseManagerList;
    private SaleEnt saleEnterprise;
    private ArrayList<SaleMenuItem> needInStockItems;

    public WarehouseOrg(SaleEnt se) {
        this.saleEnterprise = se;
        this.warehouseManagerList = new ArrayList<WarehouseManager>();
        this.needInStockItems = new ArrayList<SaleMenuItem>();
    }

    public void addNeedInStockItems(SaleMenuItem it) {
        this.needInStockItems.add(it);
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

}
