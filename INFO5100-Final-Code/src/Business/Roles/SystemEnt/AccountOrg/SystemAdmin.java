/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SystemEnt.AccountOrg;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.SystemAdminWorkArea.SystemAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class SystemAdmin extends Role {

    public SystemAdmin() {
        super(Role.Type.SystemAdmin);
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new SystemAdminJPanel(account, business, this);
    }

}
