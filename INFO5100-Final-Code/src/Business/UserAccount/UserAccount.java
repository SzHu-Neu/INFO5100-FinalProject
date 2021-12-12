package Business.UserAccount;

import Business.Roles.Role;
import Business.Roles.Role.Type;

public class UserAccount {

    private String username;
    private String password;
    private Role role;

    private boolean isDeleted;

    public UserAccount(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isDeleted = false;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Type getRoleType() {
        return role.getRoleType();
    }

    @Override
    public String toString() {
        return username;
    }

}
