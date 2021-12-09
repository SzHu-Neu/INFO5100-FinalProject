/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FactoryEnt;

import Business.CommerceSystem;
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

    public CommerceSystem getSystem() {
        return system;
    }
}
