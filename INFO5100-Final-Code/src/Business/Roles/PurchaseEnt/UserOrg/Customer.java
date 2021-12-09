package Business.Roles.PurchaseEnt.UserOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import Business.Order.Order;
import UI.CustomerWorkArea.CustomerAreaJPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ /**
 *
 * @author Ekoxier
 */

public class Customer extends Role {

    private ArrayList<Order> ordersInCustomer;
    private String address;
    private String phone;
    private String name;

    public Customer(String address, String name, String phone) {
        super(Role.Type.Customer);
        this.ordersInCustomer = new ArrayList<Order>();
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public ArrayList<Order> getValidOrders() {
        ArrayList<Order> tmpList = new ArrayList<Order>();
        for (Order odr : ordersInCustomer) {
            if (odr.getCheckoutDate() != null) {
                // DID NOT CHECKOUT
                tmpList.add(odr);
            }
        }
        return tmpList;
    }

    public ArrayList<Order> getOrdersInCustomer() {
        return ordersInCustomer;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new CustomerAreaJPanel(account, business, this);
    }

}
