/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt;

import Business.Roles.FactoryEnt.ProductOrg.ProductManager;
import Business.Roles.FactoryEnt.ProductOrg.ProductOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class FactoryEnt {

    ProductOrg productOrg;

    public FactoryEnt(String name, String address) {
        this.productOrg = new ProductOrg(name, address);
    }

    public ProductOrg getProductOrg() {
        return productOrg;
    }
}
