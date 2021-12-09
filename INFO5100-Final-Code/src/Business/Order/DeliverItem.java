/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Roles.Organization;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ekoxier
 */
public class DeliverItem {

    public enum DeliverItemStatus {
        NotDelivered, InDelivery, Delivered
    }
    private String name; // Unique Identifier

    private int price;
    private int quantity;
    private SaleMenuItem saleMenuItemBelonged;
    private DeliverItemStatus currentStatus;
    private int deliveryOrderNum;
    private AdditionalInfo additionalInfo;
    private Order orderBelonged; // Order contains

    public DeliverItem(String name, int price, int quantity, SaleMenuItem saleMenuItemBelonged, Order orderBelonged, Organization fromOrg, Organization toOrg) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.currentStatus = DeliverItemStatus.NotDelivered;
        this.orderBelonged = orderBelonged;
        this.saleMenuItemBelonged = saleMenuItemBelonged;
        this.additionalInfo = new AdditionalInfo(fromOrg, toOrg);
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public SaleMenuItem getSaleMenuItemBelonged() {
        return saleMenuItemBelonged;
    }

    public DeliverItemStatus getCurrentStatus() {
        return currentStatus;
    }

    public int getDeliveryOrderNum() {
        return deliveryOrderNum;
    }

    public Order getOrderBelonged() {
        return orderBelonged;
    }
}

class AdditionalInfo {

    class DeliverTimeline {

        private Date date;
        private String event;
    }
    private Organization fromOrg;
    private Organization toOrg;

    private ArrayList<DeliverTimeline> timelines; // Timelines that record the delivery procedure

    AdditionalInfo(Organization fromOrg, Organization toOrg) {
        this.fromOrg = fromOrg;
        this.toOrg = toOrg;
        this.timelines = new ArrayList<DeliverTimeline>();
    }

    public Organization getFromOrg() {
        return fromOrg;
    }

    public Organization getToOrg() {
        return toOrg;
    }

    public ArrayList<DeliverTimeline> getTimelines() {
        return timelines;
    }
}
