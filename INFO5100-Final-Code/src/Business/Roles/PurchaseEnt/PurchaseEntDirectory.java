/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.PurchaseEnt;

import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class PurchaseEntDirectory {

    private ArrayList<PurchaseEnt> purchaseEntList;

    public PurchaseEntDirectory() {
        this.purchaseEntList = new ArrayList<PurchaseEnt>();
    }

    public PurchaseEnt createPurchaseEnt() {
        PurchaseEnt tmp = new PurchaseEnt();
        purchaseEntList.add(tmp);
        return tmp;
    }
}
