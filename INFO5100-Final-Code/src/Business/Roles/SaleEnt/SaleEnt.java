/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt;

import Business.Order.SaleMenuItem;
import Business.Roles.SaleEnt.CustServiceOrg.CustServiceOrg;
import Business.Roles.SaleEnt.FinanceOrg.FinanceOrg;
import Business.Roles.SaleEnt.ShopOrg.ShopOrg;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class SaleEnt {

    private ShopOrg shopOrg;
    private FinanceOrg financeOrg;
    private CustServiceOrg custServiceOrg;
    private WarehouseOrg warhouseOrg;
    private String name;
    private ArrayList<SaleMenuItem> saleItemList;

    public SaleEnt(String name, String warehouseAddress) {
        this.saleItemList = new ArrayList<SaleMenuItem>();
        this.name = name;
        this.shopOrg = new ShopOrg(this);
        this.financeOrg = new FinanceOrg(this);
        this.custServiceOrg = new CustServiceOrg(this);
        this.warhouseOrg = new WarehouseOrg(this, warehouseAddress);
    }

    public ShopOrg getShopOrg() {
        return shopOrg;
    }

    public FinanceOrg getFinanceOrg() {
        return financeOrg;
    }

    public CustServiceOrg getCustServiceOrg() {
        return custServiceOrg;
    }

    public WarehouseOrg getWarhouseOrg() {
        return warhouseOrg;
    }

    public ArrayList<SaleMenuItem> getSaleItemList() {
        return saleItemList;
    }

    public String getWarehouseAddress() {
        return this.warhouseOrg.getAddress();
    }

    public SaleMenuItem getSaleMenuItemByName(String name) {
        for (SaleMenuItem smi : this.saleItemList) {
            if (smi.getName().equals(name)) {
                return smi;
            }
        }
        return null;
    }
}
