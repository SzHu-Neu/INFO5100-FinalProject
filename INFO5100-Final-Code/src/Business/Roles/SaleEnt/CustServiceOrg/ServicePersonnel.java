/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.CustServiceOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.ServicePersonnelWorkArea.ServicePersonnelAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sichengzhou
 */
public class ServicePersonnel extends Role {
  public ServicePersonnel() {
         super(Role.Type.ServicePersonnel);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new ServicePersonnelAreaJPanel(account, business, this);
    }
}
