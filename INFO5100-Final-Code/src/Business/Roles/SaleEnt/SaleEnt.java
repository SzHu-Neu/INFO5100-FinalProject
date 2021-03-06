/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt;

import Business.CommerceSystem;
import Business.Order.SaleMenuItem;
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
    private WarehouseOrg warhouseOrg;
    private String name;

    private ArrayList<SaleMenuItem> saleItemList;
    private CommerceSystem system;

    public SaleEnt(String name, String warehouseAddress, CommerceSystem system) {
        this.system = system;
        this.saleItemList = new ArrayList<SaleMenuItem>();
        this.name = name;

        this.shopOrg = new ShopOrg(this);
        this.financeOrg = new FinanceOrg(this);
        this.warhouseOrg = new WarehouseOrg(this, name, warehouseAddress);
    }

    public ShopOrg getShopOrg() {
        return shopOrg;
    }

    public String getName() {
        return name;
    }

    public CommerceSystem getSystem() {
        return system;
    }

    public FinanceOrg getFinanceOrg() {
        return financeOrg;
    }

    public WarehouseOrg getWarhouseOrg() {
        return warhouseOrg;
    }

    public ArrayList<SaleMenuItem> getNotDeletedSaleItemList() {
        // Filter the deleted item;
        ArrayList<SaleMenuItem> tmp = new ArrayList<SaleMenuItem>();
        for (SaleMenuItem singleSMI : this.saleItemList) {
            if (!singleSMI.IsDeleted()) {
                tmp.add(singleSMI);
            }
        }
        return tmp;
    }

    public String getWarehouseAddress() {
        return this.warhouseOrg.getAddress();
    }

    public SaleMenuItem addSaleItem(String name, int salePrice, int inPrice, String description) {
        for (SaleMenuItem singleSMI : this.saleItemList) {
            if (singleSMI.getName().equals(name)) {
                if (!singleSMI.IsDeleted()) {
                    // Not Deleted
                    return null; // Already Exist
                } else {
                    // Deleted
                    singleSMI.setInPrice(inPrice);
                    singleSMI.setSalePrice(salePrice);
                    singleSMI.setName(name);
                    singleSMI.setDescription(description);
                    singleSMI.setIsDeleted(false);
                    return singleSMI;
                }
            }
        }
        // Do not have existed 
        SaleMenuItem tmp = new SaleMenuItem(name, salePrice, inPrice, 0, description);
        this.saleItemList.add(tmp);
        return tmp;

    }

    // delete item in filtered list
    public void delSaleItemInNotDeleted(int filteredIdx) {
        SaleMenuItem smi = getNotDeletedSaleItemList().get(filteredIdx);
        smi.setIsDeleted(true);
    }

    public SaleMenuItem getSaleItemInNotDeleted(int filteredIdx) {
        return getNotDeletedSaleItemList().get(filteredIdx);
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
