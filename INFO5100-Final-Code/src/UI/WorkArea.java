package UI;

import Business.CommerceSystem;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class WorkArea extends javax.swing.JPanel {

    public JPanel userProcessContainer;
    public UserAccount userAccount;
    public CommerceSystem business;
    public Role role;

    public WorkArea(UserAccount userAccount, CommerceSystem business, Role role) {
        this.userAccount = userAccount;
        this.business = business;
        this.role = role;
    }

}
