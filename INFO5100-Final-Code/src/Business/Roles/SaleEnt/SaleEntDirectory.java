/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt;

import Business.CommerceSystem;
import Business.Roles.SaleEnt.CustServiceOrg.CustServiceOrg;
import Business.Roles.SaleEnt.FinanceOrg.FinanceOrg;
import Business.Roles.SaleEnt.ShopOrg.ShopOrg;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class SaleEntDirectory {

    CommerceSystem system;
    private ArrayList<SaleEnt> saleEntList;

    public SaleEntDirectory(CommerceSystem system) {
        this.saleEntList = new ArrayList<SaleEnt>();
        this.system = system;
    }

    public CommerceSystem getSystem() {
        return system;
    }

    public SaleEnt createSaleEnt(String name, String warehouseAddress) {
        SaleEnt tmp = new SaleEnt(name, warehouseAddress, this.system);
        saleEntList.add(tmp);
        return tmp;
    }

    public ArrayList<ShopOrg> getAllShops() {
        ArrayList<ShopOrg> shops = new ArrayList<ShopOrg>();
        for (SaleEnt singleSaleEnt : saleEntList) {
            shops.add(singleSaleEnt.getShopOrg());
        }
        return shops;
    }

}
