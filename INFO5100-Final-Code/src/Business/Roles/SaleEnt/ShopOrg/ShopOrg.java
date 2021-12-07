/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.ShopOrg;

import Business.Order.Item;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class ShopOrg {

    // 
    private ArrayList<ShopManager> shopManagerList;
    private ArrayList<Item> saleItemList;

    public ShopOrg() {
        this.saleItemList = new ArrayList<Item>();
        this.shopManagerList = new ArrayList<ShopManager>();
    }

    public ArrayList<ShopManager> getShopManagerList() {
        return shopManagerList;
    }

    public ArrayList<Item> getSaleItemList() {
        return saleItemList;
    }

    public ShopManager createShopManager() {
        ShopManager tmp = new ShopManager();
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
}
