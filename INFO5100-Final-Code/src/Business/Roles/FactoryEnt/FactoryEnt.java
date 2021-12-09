/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt;

import Business.Roles.FactoryEnt.ProductOrg.ProductOrg;

/**
 *
 * @author Ekoxier
 */
public class FactoryEnt {

    ProductOrg productOrg;

    public FactoryEnt() {
        this.productOrg = new ProductOrg();
    }

    public ProductOrg getProductOrg() {
        return productOrg;
    }
}
