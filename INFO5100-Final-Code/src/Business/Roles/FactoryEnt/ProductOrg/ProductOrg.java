/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt.ProductOrg;

import Business.Order.SaleMenuItem;
import Business.Roles.InDeliverOrganization;
import Business.Roles.SaleEnt.WarehouseOrg.WarehouseOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class ProductOrg extends InDeliverOrganization {

    private ArrayList<ProductManager> productManagerList;
    private ArrayList<RequestFactoryItem> requestHandleList; // List that handles incoming request about stock;

    public ProductOrg(String name, String address) {
        super(name, address);
        this.productManagerList = new ArrayList<ProductManager>();
        this.requestHandleList = new ArrayList<RequestFactoryItem>();
    }

    public RequestFactoryItem addReuqestHandleList(SaleMenuItem smi, int number, WarehouseOrg warehouseOrg) {
        RequestFactoryItem rfi = new RequestFactoryItem(smi, number, warehouseOrg);
        this.requestHandleList.add(rfi);
        return rfi;
    }

    public ProductManager createProductManager() {
        ProductManager tmp = new ProductManager(this);
        this.productManagerList.add(tmp);
        return tmp;
    }

    public ArrayList<ProductManager> getProductManagerList() {
        return productManagerList;
    }

    public ArrayList<RequestFactoryItem> getRequestHandleList() {
        return requestHandleList;
    }

    public class RequestFactoryItem {
//        private 

        private SaleMenuItem smi;
        private WarehouseOrg warehouseOrg;
        private int number;

        RequestFactoryItem(SaleMenuItem smi, int number, WarehouseOrg warehouseOrg) {
            this.smi = smi;
            this.number = number;
            this.warehouseOrg = warehouseOrg;
        }

        public SaleMenuItem getSmi() {
            return smi;
        }

        public WarehouseOrg getWarehouseOrg() {
            return warehouseOrg;
        }

        public int getNumber() {
            return number;
        }
    }
}
