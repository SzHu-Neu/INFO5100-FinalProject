/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SystemEnt;

import Business.Roles.SystemEnt.AccountOrg.AccountOrg;

/**
 *
 * @author Ekoxier
 */
public class SystemEnt {

    private AccountOrg accountOrg;

    public AccountOrg getAccountOrg() {
        return accountOrg;
    }

    public SystemEnt() {
        this.accountOrg = new AccountOrg();
    }
}
