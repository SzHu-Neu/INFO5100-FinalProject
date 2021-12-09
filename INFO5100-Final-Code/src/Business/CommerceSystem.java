package Business;

import Business.Roles.DeliveryEnt.DeliveryEntDirectory;
import Business.Roles.FactoryEnt.FactoryEntDirectory;
import Business.Roles.PurchaseEnt.PurchaseEntDirectory;
import Business.Roles.SaleEnt.SaleEntDirectory;
import Business.UserAccount.UserAccountDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class CommerceSystem {

    private static CommerceSystem cSystem;

    private UserAccountDirectory userAccountDirectory;
    private FactoryEntDirectory factoryEntDirectory;
    private DeliveryEntDirectory deliveryEntDirectory;
    private PurchaseEntDirectory purchaseEntDirectory;
    private SaleEntDirectory saleEntDirectory;

    //    Singleton
    public static CommerceSystem getInstance() {
        if (cSystem == null) {
            cSystem = new CommerceSystem();
            System.out.print("New System");
        }
        return cSystem;
    }

    private CommerceSystem() {
        this.factoryEntDirectory = new FactoryEntDirectory(this);
        this.deliveryEntDirectory = new DeliveryEntDirectory(this);
        this.purchaseEntDirectory = new PurchaseEntDirectory(this);
        this.saleEntDirectory = new SaleEntDirectory(this);
        this.userAccountDirectory = new UserAccountDirectory(this);
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public FactoryEntDirectory getFactoryEntDirectory() {
        return factoryEntDirectory;
    }

    public DeliveryEntDirectory getDeliveryEntDirectory() {
        return deliveryEntDirectory;
    }

    public PurchaseEntDirectory getPurchaseEntDirectory() {
        return purchaseEntDirectory;
    }

    public SaleEntDirectory getSaleEntDirectory() {
        return saleEntDirectory;
    }
}
