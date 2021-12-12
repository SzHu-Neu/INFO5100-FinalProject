package Business;

import Business.Roles.FactoryEnt.FactoryEnt;
import Business.Roles.FactoryEnt.ProductOrg.ProductManager;
import Business.Roles.FinanceEnt.CreditPaymentOrg.PaymentManager;
import Business.Roles.FinanceEnt.FinanceEnt;
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

        // Sale Enterprise create
        SaleEnt saleEnt1 = system.getSaleEntDirectory().createSaleEnt("ent name 1", "warehouse address 1");

        // ShopManager Create
        ShopManager sm = saleEnt1.getShopOrg().createShopManager();
        system.getUserAccountDirectory().createUserAccount("shop1", "123456", sm);

        // Warehouse Manager Create
        WarehouseManager wm = saleEnt1.getWarhouseOrg().createWarehouseManager();
        system.getUserAccountDirectory().createUserAccount("warehouse1", "123456", wm);

        // Accountant Create
        Accountant acc = saleEnt1.getFinanceOrg().createAccountant();
        system.getUserAccountDirectory().createUserAccount("accountant1", "123456", acc);

        // Factory Enterprise Create
        String productOrgName1 = "po1";
        FactoryEnt factoryEnt1 = system.getFactoryEntDirectory().createFactoryEnt("po1", "product address1");

        // Product Manager Create
        ProductManager pm = factoryEnt1.getProductOrg().createProductManager();
        system.getUserAccountDirectory().createUserAccount("product1", "123456", pm);

        // Purchase Enterprise Create && Customer Create
        PurchaseEnt purchaseEnt1 = system.getPurchaseEntDirectory().createPurchaseEnt("customer1", "customer address 1", "18971656637", system);
        Customer cust = purchaseEnt1.getUserOrg().getCustomer();
        system.getUserAccountDirectory().createUserAccount("customer1", "123456", cust);

        // Finance Enterprise Create
        FinanceEnt financeEnt1 = system.getFinanceEntDirectory().createFinanceEnt("fo1");

        PaymentManager paymentManager = financeEnt1.getCreditPaymentOrg().addPaymentManager();
        system.getUserAccountDirectory().createUserAccount("finance1", "123456", paymentManager);
        return system;
    }

}
