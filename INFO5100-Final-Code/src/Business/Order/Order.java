package Business.Order;

import Business.Item.Item;
import Business.Roles.PurchaseEnt.UserOrg.Customer;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public class Order {

    // 
    public enum StatusCode {
    }
    private Customer customer; // Customer who ordered
    private ArrayList<Item> itemList; // Items in the order
    private Date orderDate;
    private StatusCode status;

    public Order(Customer customer) {
        this.customer = customer;
        this.itemList = new ArrayList<Item>();

    }

    private int getTotalPrice() {
        return -1;
    }
}
