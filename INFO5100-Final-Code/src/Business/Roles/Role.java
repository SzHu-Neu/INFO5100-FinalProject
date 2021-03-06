package Business.Roles;

import Business.CommerceSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ekoxier
 */
public abstract class Role {

    public enum Type {
        Customer,
        SystemAdmin,
        WarehouseManager,
        ShopManager,
        Accountant,
        ServicePersonnel,
        DistributionDelivers,
        DistributionManager,
        TransportationManager,
        Driver,
        ProductManager,
        PaymentManager,
    }

    private Type role;

    public Role(Type role) {
        this.role = role;
    }

    public Type getRoleType() {
        return this.role;
    }

    @Override
    public String toString() {
        return this.role.toString();
    }

    public abstract JPanel createWorkArea(
            UserAccount account,
            CommerceSystem business,
            Role role);

}
