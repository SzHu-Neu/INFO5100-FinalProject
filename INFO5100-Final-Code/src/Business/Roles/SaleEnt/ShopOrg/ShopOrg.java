/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.ShopOrg;

import Business.Order.SaleMenuItem;
import Business.Order.Order;
import Business.Roles.SaleEnt.SaleEnt;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class ShopOrg {

    // 
    private SaleEnt saleEnterprise;

    private ArrayList<ShopManager> shopManagerList;

    private ArrayList<Order> ordersInShop;

    public ShopOrg(SaleEnt se) {
        this.saleEnterprise = se;

        this.shopManagerList = new ArrayList<ShopManager>();
        this.ordersInShop = new ArrayList<Order>();
    }

    public ArrayList<ShopManager> getShopManagerList() {
        return shopManagerList;
    }

    public ArrayList<SaleMenuItem> getSaleItemList() {
        return saleEnterprise.getNotDeletedSaleItemList();
    }

    public ShopManager createShopManager() {
        ShopManager tmp = new ShopManager(this);
        this.shopManagerList.add(tmp);
        return tmp;
    }

    public void addShopManager(ShopManager sm) {
        this.shopManagerList.add(sm);
    }

    public void removeShopManager(int index) {
        this.shopManagerList.remove(index);
    }

    public void removeShopManager(ShopManager sm) {
        this.shopManagerList.remove(sm);
    }

    public void addOrderInshop(Order order) {
        this.ordersInShop.add(order);
    }

    public SaleEnt getSaleEnterprise() {
        return saleEnterprise;
    }
//    public String getWare
}
