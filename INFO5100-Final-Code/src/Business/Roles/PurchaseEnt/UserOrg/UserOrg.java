package Business.Roles.PurchaseEnt.UserOrg;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class UserOrg {

    private ArrayList<Customer> customerList;

    public Customer addCustomer(String address, String name, String phone) {
        Customer tmp = new Customer(address, name, phone);
        this.customerList.add(tmp);
        return tmp;
    }
}
