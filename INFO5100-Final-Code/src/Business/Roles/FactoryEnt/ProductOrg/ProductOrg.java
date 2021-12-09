/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt.ProductOrg;

import Business.Order.SaleMenuItem;
import Business.Roles.Organization;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class ProductOrg extends Organization {

    private ArrayList<ProductManager> productManagerList;
    private ArrayList<RequestFactoryItem> requestHandleList; // List that handles incoming request about stock;

    public RequestFactoryItem addReuqestHandleList(SaleMenuItem smi, int number, WarehouseOrg warehouseOrg) {
        RequestFactoryItem rfi = new RequestFactoryItem(smi, number, warehouseOrg);
        this.requestHandleList.add(rfi);
        return rfi;
    }

    public ProductOrg() {
        this.requestHandleList = new ArrayList<RequestFactoryItem>();
        this.productManagerList = new ArrayList<ProductManager>();
    }

    class RequestFactoryItem {
//        private 

        private SaleMenuItem smi;
        private WarehouseOrg warehouseOrg;
        private int number;

        RequestFactoryItem(SaleMenuItem smi, int number, WarehouseOrg warehouseOrg) {
            this.smi = smi;
            this.number = number;
            this.warehouseOrg = warehouseOrg;
        }
    }
}
