package Business.UserAccount;

import Business.Roles.Role;
import java.util.ArrayList;

public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getActiveUserAccountList() {
        ArrayList<UserAccount> tmp = new ArrayList<UserAccount>();
        for (UserAccount ua : this.userAccountList) {
            if (!ua.isIsDeleted() && ua.getRoleType() != Role.Type.SystemAdmin) {
                tmp.add(ua);
            }
        }
        System.out.println("accountList size:" + this.userAccountList.size());
        System.out.println("tmp size:" + tmp.size());
        return tmp;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password) && !ua.isIsDeleted()) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Role role) {
        if (!checkIfUsernameIsUnique(username)) {
            return null;
        }
        UserAccount userAccount = new UserAccount(username, password, role);
        userAccountList.add(userAccount);
        return userAccount;

    }

    private boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
