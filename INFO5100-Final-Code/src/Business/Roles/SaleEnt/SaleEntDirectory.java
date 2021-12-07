/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt;

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

    private ArrayList<SaleEnt> saleEntList;

    public SaleEntDirectory() {
        this.saleEntList = new ArrayList<SaleEnt>();
    }

    public SaleEnt createSaleEnt(String name) {
        SaleEnt tmp = new SaleEnt(name);
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
