/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt.DistributionOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.DistributionDeliversWorkArea.DistributionDeliversAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class DistributionDelivers extends Role{
    public DistributionDelivers() {
        super(Role.Type.DistributionDelivers);
    }
    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new DistributionDeliversAreaJPanel(account, business, this);
    }
}

