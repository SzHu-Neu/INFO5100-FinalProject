/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Roles.DeliveryEnt.DeliveryEnt;
import Business.Roles.Organization;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ekoxier
 */
public class DeliverItem {

    public enum DeliverItemStatus {
        NotDelivered, InDelivery, Delivered, Received
    }
    private String name; // Unique Identifier
    private int quantity;
    private SaleMenuItem saleMenuItemBelonged;
    private DeliverItemStatus currentStatus;
    private int deliveryOrderNum;
    private AdditionalInfo additionalInfo;

    private Order orderBelonged; // Order contains

    public DeliverItem(String name,
            int quantity,
            SaleMenuItem saleMenuItemBelonged,
            Order orderBelonged,
            Organization fromOrg,
            Organization toOrg) {
        this.name = name;
        this.deliveryOrderNum = -1; // Initialize
        this.quantity = quantity;
        this.currentStatus = DeliverItemStatus.NotDelivered;
        this.orderBelonged = orderBelonged;
        this.saleMenuItemBelonged = saleMenuItemBelonged;
        this.additionalInfo = new AdditionalInfo(fromOrg, toOrg, this);
        ////// Add this deliver item info to related organization and enterprise;
        fromOrg.addDeliveryItem(this);
        toOrg.addDeliveryItem(this);
        /////
    }

    public void setReceived() {
        this.currentStatus = DeliverItemStatus.Received;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
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

    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }
}
