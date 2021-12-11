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
import Business.Roles.DeliveryEnt.TransportationOrg.TransportationOrg;
/**
 *
 * @author sichengzhou
 */
public class Driver extends Role {
   TransportationOrg transOrg;

   public Driver(TransportationOrg org) {
        super(Role.Type.Driver);
        this.transOrg = org;
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new DriverAreaJPanel(account, business, this);
    }
}