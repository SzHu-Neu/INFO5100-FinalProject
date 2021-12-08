/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

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
    private int quantity;
    private SaleMenuItem saleMenuItemBelonged;
    private DeliverItemStatus currentStatus;
    private ArrayList<DeliverTimeline> timelines; // Timelines that record the delivery procedure
    private int deliveryOrderNum;
    private Order orderBelonged; // Order contains

    public DeliverItem(String name, int price, int quantity, SaleMenuItem saleMenuItemBelonged, Order orderBelonged) {
        this.quantity = quantity;
        this.currentStatus = DeliverItemStatus.NotDelivered;
        this.orderBelonged = orderBelonged;
        this.saleMenuItemBelonged = saleMenuItemBelonged;
        this.timelines = null;
    }
}

class DeliverTimeline {

    private Date date;
    private String event;
}
