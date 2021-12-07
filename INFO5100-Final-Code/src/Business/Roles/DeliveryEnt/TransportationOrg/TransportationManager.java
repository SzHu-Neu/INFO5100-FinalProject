/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt.TransportationOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.TransportationManagerWorkArea.TransportationManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class TransportationManager extends Role{
   public TransportationManager() {
        super(Role.Type.TransportationManager);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new TransportationManagerAreaJPanel(account, business, this);
    }
}
