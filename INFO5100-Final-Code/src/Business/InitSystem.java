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
        ShopManager sm = system.getSaleEntDirectory().createSaleEnt("ent name 1").getShopOrg().createShopManager();
        system.getUserAccountDirectory().createUserAccount("shopmanager1", "123456", sm);
        return system;
    }

}
