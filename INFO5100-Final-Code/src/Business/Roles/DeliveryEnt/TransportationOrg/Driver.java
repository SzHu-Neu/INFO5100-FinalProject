/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt.TransportationOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.DriverWorkArea.DriverAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class Driver extends Role {
   public Driver() {
        super(Role.Type.Driver);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new DriverAreaJPanel(account, business, this);
    }
}