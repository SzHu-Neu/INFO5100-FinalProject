/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SystemEnt.AccountOrg;

/**
 *
 * @author Ekoxier
 */
public class AccountOrg {

    private SystemAdmin systemAdmin;

    public SystemAdmin getSystemAdmin() {
        return systemAdmin;
    }

    public AccountOrg() {
        this.systemAdmin = new SystemAdmin();
    }
}
