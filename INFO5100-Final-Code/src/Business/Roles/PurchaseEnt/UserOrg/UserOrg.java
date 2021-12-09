package Business.Roles.PurchaseEnt.UserOrg;

import Business.Roles.Organization;
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

    public UserOrg(String address) {
        this.customerList = new ArrayList<Customer>();
        this.address = address;
    }

    public Customer addCustomer(String name, String phone) {
        Customer tmp = new Customer(name, phone, this);
        this.customerList.add(tmp);
        return tmp;
    }
}
