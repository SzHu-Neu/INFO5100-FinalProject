package Business.Order;

import Business.Roles.PurchaseEnt.UserOrg.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    private HashMap<Item, Integer> orderItemInfo;
    private Date orderDate;
    private StatusCode status;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderItemInfo = new HashMap<Item, Integer>();
    }

    public HashMap<Item, Integer> getOrderItemInfo() {
        return orderItemInfo;
    }

    public void addOrderItem(Item item, int itemNumber) {
        if (this.orderItemInfo.containsKey(item)) {
            int newNumber = this.orderItemInfo.get(item) + itemNumber;
            this.orderItemInfo.put(item, newNumber);
        } else {
            this.orderItemInfo.put(item, itemNumber);
        }
    }

    public void delOrderItemByOne(Item item) {
        int curNum = this.orderItemInfo.get(item);
        if (curNum == 1) {
            this.orderItemInfo.put(item, curNum - 1);
        } else {
            this.orderItemInfo.remove(item);
        }

    }

    public int getTotalPrice() {
        int price = 0;
        for (Map.Entry<Item, Integer> entry : this.orderItemInfo.entrySet()) {
            price += entry.getKey().getPrice() * entry.getValue();
        }
        return price;
    }

}
