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
    private String phone;
    private String name;
    private UserOrg userOrg;
    
    public Customer(String name, String phone, UserOrg userOrg) {
        super(Role.Type.Customer);
        this.ordersInCustomer = new ArrayList<Order>();
        this.name = name;
        this.phone = phone;
        this.userOrg = userOrg;
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
    
    public void checkOut(Order order) {
        this.ordersInCustomer.add(order);
        CommerceSystem system = this.userOrg.getPurchaseEnt().getSystem();
        system.getFinanceEntDirectory().getFinanceEnt().getCreditPaymentOrg().addPaymentInfo("Sdasdas");
        // checkOutOrder
        order.chekoutOrder();
        // Add a transaction
        order.getShop().getSaleEnterprise().getFinanceOrg().addTransaction(order.getTotalPrice(), "Bought Income");
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getName() {
        return name;
    }
    
    public UserOrg getUserOrg() {
        return userOrg;
    }
    
    public ArrayList<Order> getOrdersInCustomer() {
        return ordersInCustomer;
    }
    
    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new CustomerAreaJPanel(account, business, this);
    }
    
}
