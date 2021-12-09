/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt.DistributionOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.DistributionManagerWorkArea.DistributionManagerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class DistributionManager extends Role {

    public DistributionManager() {
        super(Role.Type.DistributionManager);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new DistributionManagerAreaJPanel(account, business, this);
    }
}
