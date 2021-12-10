package Business.Order;

import Business.Roles.PurchaseEnt.UserOrg.Customer;
import Business.Roles.PurchaseEnt.UserOrg.UserOrg;
import Business.Roles.SaleEnt.ShopOrg.ShopOrg;
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

    private UserOrg userOrg; // Customer who ordered
    private ShopOrg shop; // In which shop

    private HashMap<SaleMenuItem, Integer> orderItemInfo;
    private ArrayList<DeliverItem> deliverItemsInfo;

    private Date checkoutDate;

    public Order(UserOrg uo) {
        this.userOrg = uo;
        this.shop = null;
        this.orderItemInfo = new HashMap<SaleMenuItem, Integer>();
        this.deliverItemsInfo = new ArrayList<DeliverItem>();
        this.checkoutDate = null;
    }

    public HashMap<SaleMenuItem, Integer> getOrderItemInfo() {
        return orderItemInfo;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public void setShop(ShopOrg shop) {
        this.shop = shop;
    }

    public ShopOrg getShop() {
        return shop;
    }

    public ArrayList<DeliverItem> getDeliverItemsInfo() {
        return deliverItemsInfo;
    }

    public void addOrderItem(SaleMenuItem item, int itemNumber) {
        if (this.orderItemInfo.containsKey(item)) {
            int newNumber = this.orderItemInfo.get(item) + itemNumber;
            this.orderItemInfo.put(item, newNumber);
        } else {
            this.orderItemInfo.put(item, itemNumber);
        }
    }

    public void delOrderItemByOne(SaleMenuItem item) {
        int curNum = this.orderItemInfo.get(item);
        if (curNum == 1) {
            this.orderItemInfo.put(item, curNum - 1);
        } else {
            this.orderItemInfo.remove(item);
        }

    }

    // get thet total price of this order;
    public int getTotalPrice() {
        int price = 0;
        for (Map.Entry<SaleMenuItem, Integer> entry : this.orderItemInfo.entrySet()) {
            price += entry.getKey().getSalePrice() * entry.getValue();
        }
        return price;
    }

    // Calculate the profit of this order;
    public int calculateProfit() {
        int profit = 0;
        for (Map.Entry<SaleMenuItem, Integer> entry : this.orderItemInfo.entrySet()) {
            profit += (entry.getKey().getSalePrice() - entry.getKey().getInPrice()) * entry.getValue();
        }
        return profit;
    }

    public void chekoutOrder() {
//        Transfer from orderItemInfo to DeliverItemInfo
//        And orderItemInfo should not be used
        for (Map.Entry<SaleMenuItem, Integer> entry : orderItemInfo.entrySet()) {
//            
//            deliverItemsInfo.add(
//                    entry.getKey().getName(),
//                    entry.getKey().getSalePrice(),
//                    entry.getValue(),
//                    entry.getKey(),
//                    this,
//                    this.shop.getSaleEnterprise().getWarhouseOrg(),
//                    this.customer.getUserOrg()
//            )

        }
        this.orderItemInfo = null;
    }
}
