/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt;

import Business.CommerceSystem;
import Business.Roles.FactoryEnt.ProductOrg.ProductOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class FactoryEntDirectory {

    private CommerceSystem system;
    private ArrayList<FactoryEnt> factoryEntList;

    public FactoryEntDirectory(CommerceSystem system) {
        this.system = system;
        this.factoryEntList = new ArrayList<FactoryEnt>();
    }

    public FactoryEnt createFactoryEnt(String name, String address) {
        FactoryEnt tmp = new FactoryEnt(name, address);
        this.factoryEntList.add(tmp);
        return tmp;
    }

    public ArrayList<ProductOrg> listAllProductOrgs() {
        ArrayList<ProductOrg> tmp = new ArrayList<ProductOrg>();
        for (FactoryEnt fe : factoryEntList) {
            tmp.add(fe.getProductOrg());
        }
        return tmp;
    }

    public CommerceSystem getSystem() {
        return system;
    }
}
