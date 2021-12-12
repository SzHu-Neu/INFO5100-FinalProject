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

    private ArrayList<Customer> customerList;
    private PurchaseEnt purchaseEnt;

    public UserOrg(String name, String address, PurchaseEnt pe) {
        super(name, address);
        this.customerList = new ArrayList<Customer>();
        this.purchaseEnt = pe;
    }

    public Customer addCustomer(String name, String phone) {
        Customer tmp = new Customer(name, phone, this);
        this.customerList.add(tmp);
        return tmp;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public PurchaseEnt getPurchaseEnt() {
        return purchaseEnt;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
