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
import Business.Roles.DeliveryEnt.DeliveryEnt;
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionManager;
import Business.Roles.DeliveryEnt.TransportationOrg.Driver;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationManager;
import Business.Roles.SystemEnt.AccountOrg.SystemAdmin;

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

        // SystemAdmin
        SystemAdmin systemAdmin = system.getSystemEnt().getAccountOrg().getSystemAdmin();
        system.getUserAccountDirectory().createUserAccount("sysadmin", "123456", systemAdmin);

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

        // Deliver Enterprise Create
        DeliveryEnt deliveryEnt1 = system.getDeliveryEntDirectory().createDeliveryEnt("JD Delivery Company");
        DistributionManager dm = deliveryEnt1.getDistributionOrg().createManager();
        system.getUserAccountDirectory().createUserAccount("delivery1", "123456", dm);
        TransportationOrg tOrg = deliveryEnt1.getDistributionOrg().createTransOrg("SF Transportation");

        Driver driver1 = tOrg.createDriver();
        TransportationManager tm = tOrg.createTransportationManager();
        system.getUserAccountDirectory().createUserAccount("driver1", "123456", driver1);
        system.getUserAccountDirectory().createUserAccount("transManager1", "123456", tm);
        return system;
    }

}
