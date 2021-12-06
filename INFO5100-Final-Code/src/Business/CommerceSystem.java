package Business;


import Business.DeliveryEnt.DeliveryEntDirectory;
import Business.FactoryEnt.FactoryEntDirectory;
import Business.PurchaseEnt.PurchaseEntDirectory;
import Business.SaleEnt.SaleEntDirectory;

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
    private FactoryEntDirectory factoryEntDirctory;
    private DeliveryEntDirectory deliveryEntDirectory;
    private PurchaseEntDirectory purchaseEntDirectory;
    private SaleEntDirectory saleEntDirectory;

    public static CommerceSystem getInstance() {
        if (cSystem == null) {
            cSystem = new CommerceSystem();
            System.out.print("New System");
        }
        return cSystem;
    }

    private CommerceSystem() {
        this.factoryEntDirctory = new FactoryEntDirectory();
        this.deliveryEntDirectory = new DeliveryEntDirectory();
        this.purchaseEntDirectory = new PurchaseEntDirectory();
        this.saleEntDirectory = new SaleEntDirectory();
    }
}
