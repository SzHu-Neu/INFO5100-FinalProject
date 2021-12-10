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
public class AdditionalInfo {

    class DeliverTimeline {

        private Date date;
        private String event;
    }
    private DeliverItem deliverItemBelonged;
    private Organization fromOrg;
    private Organization toOrg;
    private DeliveryEnt deliveryEnt;
    private ArrayList<DeliverTimeline> timelines; // Timelines that record the delivery procedure

    AdditionalInfo(Organization fromOrg, Organization toOrg, DeliverItem deliverItemBelonged) {
        this.fromOrg = fromOrg;
        this.toOrg = toOrg;
        this.deliveryEnt = null;
        this.timelines = new ArrayList<DeliverTimeline>();
        this.deliverItemBelonged = deliverItemBelonged;
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

    public void assignDeliveryEnt(DeliveryEnt deliveryEnt) {
        this.deliveryEnt = deliveryEnt;
        deliveryEnt.addWorkRequest(this.deliverItemBelonged);
    }
}
