package Business.Roles.PurchaseEnt.UserOrg;

import Business.Roles.Organization;
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
public class UserOrg extends Organization {

    private ArrayList<Customer> customerList;
    private String address;
    private PurchaseEnt purchaseEnt;

    public UserOrg(String address, PurchaseEnt pe) {
        this.customerList = new ArrayList<Customer>();
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public PurchaseEnt getPurchaseEnt() {
        return purchaseEnt;
    }
}
