/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.PurchaseEnt;

import Business.CommerceSystem;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class PurchaseEntDirectory {

    private ArrayList<PurchaseEnt> purchaseEntList;
    CommerceSystem system;

    public PurchaseEntDirectory(CommerceSystem system) {
        this.system = system;
        this.purchaseEntList = new ArrayList<PurchaseEnt>();
    }

    public CommerceSystem getSystem() {
        return system;
    }

    public PurchaseEnt createPurchaseEnt(String address) {
        PurchaseEnt tmp = new PurchaseEnt(address);
        purchaseEntList.add(tmp);
        return tmp;
    }
}
