/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt;

import Business.Order.DeliverItem;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class DeliveryEnt {

    private ArrayList<DeliverItem> deliverItems;

    public void addWorkRequest(DeliverItem e) {
        this.deliverItems.add(e);
    }
}
