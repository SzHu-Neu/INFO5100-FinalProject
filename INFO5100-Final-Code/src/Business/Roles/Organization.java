/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Order.DeliverItem;
import java.util.ArrayList;

/**
 * Organization that has delivery to receive or send
 *
 * @author Ekoxier
 */
public abstract class Organization {

    private ArrayList<DeliverItem> relatedDeliverItems;

    public Organization() {
        this.relatedDeliverItems = new ArrayList<DeliverItem>();
    }

    public ArrayList<DeliverItem> getRelatedDeliverItems() {
        return relatedDeliverItems;
    }

    public void addDeliveryItem(DeliverItem di) {
        this.relatedDeliverItems.add(di);
    }
}
