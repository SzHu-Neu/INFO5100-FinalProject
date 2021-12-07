/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt;

import Business.Roles.SaleEnt.CustServiceOrg.CustServiceOrg;
import Business.Roles.SaleEnt.FinanceOrg.FinanceOrg;
import Business.Roles.SaleEnt.ShopOrg.ShopOrg;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;

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

    public SaleEnt(String name) {
        this.name = name;
        this.shopOrg = new ShopOrg();
        this.financeOrg = new FinanceOrg();
        this.custServiceOrg = new CustServiceOrg();
        this.warhouseOrg = new WarehouseOrg();
    }
}
