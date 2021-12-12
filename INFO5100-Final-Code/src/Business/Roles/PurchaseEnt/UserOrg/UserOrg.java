package Business.Roles.PurchaseEnt.UserOrg;

import Business.Roles.InDeliverOrganization;
import Business.Roles.PurchaseEnt.PurchaseEnt;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class UserOrg extends InDeliverOrganization {

    private Customer customer; // Only one
    private PurchaseEnt purchaseEnt;

    public UserOrg(String name, String address, String phone, PurchaseEnt pe) {
        super(name, address);
        this.customer = new Customer(name, phone, this);
        this.purchaseEnt = pe;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public PurchaseEnt getPurchaseEnt() {
        return purchaseEnt;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
