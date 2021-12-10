package Business;

import Business.Roles.PurchaseEnt.PurchaseEnt;
import Business.Roles.PurchaseEnt.UserOrg.Customer;
import Business.Roles.SaleEnt.FinanceOrg.Accountant;
import Business.Roles.SaleEnt.SaleEnt;
import Business.Roles.SaleEnt.ShopOrg.ShopManager;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class InitSystem {

    public static CommerceSystem configure() {

        CommerceSystem system = CommerceSystem.getInstance();
        //        system.getUseraccountDirectory().createUserAccount("shopmanager1", "123456", new SystemAdmin());

        // ShopManager Create
        SaleEnt saleEnt1 = system.getSaleEntDirectory().createSaleEnt("ent name 1", "warehouse address 1");
        ShopManager sm = saleEnt1.getShopOrg().createShopManager();
        system.getUserAccountDirectory().createUserAccount("shop1", "123456", sm);
        WarehouseManager wm = saleEnt1.getWarhouseOrg().createWarehouseManager();
        system.getUserAccountDirectory().createUserAccount("warehouse1", "123456", wm);
        Accountant acc = saleEnt1.getFinanceOrg().createAccountant();
        system.getUserAccountDirectory().createUserAccount("accountant1", "123456", acc);

        // Customer Create;
        PurchaseEnt purchaseEnt1 = system.getPurchaseEntDirectory().createPurchaseEnt("customer1", system);
        Customer cust = purchaseEnt1.getUserOrg().addCustomer("customer1", "1891333");
        system.getUserAccountDirectory().createUserAccount("customer1", "123456", cust);

        //
        return system;
    }

}
