/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.PurchaseEnt;

import Business.CommerceSystem;
import Business.Roles.PurchaseEnt.UserOrg.UserOrg;

/**
 *
 * @author Ekoxier
 */
public class PurchaseEnt {

    private UserOrg userOrg;
    private CommerceSystem system;

    public PurchaseEnt(String name, String address, CommerceSystem system) {
        this.userOrg = new UserOrg(name, address, this);
        this.system = system;
    }

    public CommerceSystem getSystem() {
        return system;
    }

    public UserOrg getUserOrg() {
        return userOrg;
    }
}
