package Business;

import Business.Roles.SaleEnt.ShopOrg.ShopManager;

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
        system.getUserAccountDirectory().createUserAccount("shopmanager1", "123456", new ShopManager());
//        system
//        Employee employee = system.getEmployeeDirectory().createEmployee("HSZ");
//        system.getUserAccountDirectory().createUserAccount("sysadmin", "123456", employee, new SystemAdmin());
//        Restaurant test1 = system.getRestaurantDirectory().addRestaurant("Test1");
//        system.getUserAccountDirectory().createUserAccount("admin1", "123456", employee, new RestaurantAdmin("ad1", test1));
//        Restaurant test2 = system.getRestaurantDirectory().addRestaurant("Test2");
//        system.getUserAccountDirectory().createUserAccount("admin2", "123456", employee, new RestaurantAdmin("ad2", test2));
//        system.getUserAccountDirectory().createUserAccount("customer1", "123456", employee, system.getCustomerDirectory().addCustomer("customer1"));
//        system.getUserAccountDirectory().createUserAccount("delivery1", "123456", employee, system.getDeliveryManDirectory().addDeliveryMan("De1"));
//        system.getUserAccountDirectory().createUserAccount("delivery2", "123456", employee, system.getDeliveryManDirectory().addDeliveryMan("De2"));
        return system;
    }

}
