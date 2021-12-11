/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Order.DeliverItem;
import Business.Order.Order;
import Business.Order.SaleMenuItem;
import java.util.ArrayList;

/**
 * Organization that has delivery to receive or send
 *
 * @author Ekoxier
 */
public abstract class InDeliverOrganization {

    private ArrayList<DeliverItem> relatedDeliverItems;
    private String name;
    private String address;

    public InDeliverOrganization(String name, String address) {
        this.relatedDeliverItems = new ArrayList<DeliverItem>();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<DeliverItem> getRelatedDeliverItems() {
        return relatedDeliverItems;
    }

    public DeliverItem addDeliveryItem(String name, SaleMenuItem saleMenuItemBelonged,
            Order orderBelonged, int quantity, InDeliverOrganization fromOrg, InDeliverOrganization toOrg) {
        DeliverItem tmp
                = new DeliverItem(name,
                        quantity,
                        saleMenuItemBelonged, //
                        orderBelonged,
                        fromOrg,
                        toOrg
                );
        return tmp;
    }

    public DeliverItem addDeliveryItem(DeliverItem di) {
        this.relatedDeliverItems.add(di);
        return di;
    }

    public DeliverItem getDeliveryItem(int idx) {
        return this.relatedDeliverItems.get(idx);
    }

    // FOR TEST ONLY
    public void setDeliveredForTest(int idx) {
        this.relatedDeliverItems.get(idx).setDelivered();
        this.relatedDeliverItems.get(idx).setDeliveryOrderNum(114514);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
