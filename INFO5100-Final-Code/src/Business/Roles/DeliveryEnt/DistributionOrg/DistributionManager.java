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
import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
/**
 *
 * @author sichengzhou
 */
public class DistributionManager extends Role {
    
    private DistributionOrg distributionOrg;

    public DistributionManager(DistributionOrg org){
        super(Role.Type.DistributionManager);
        this.distributionOrg = org;
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new DistributionManagerAreaJPanel(account, business, this);
    }
}
