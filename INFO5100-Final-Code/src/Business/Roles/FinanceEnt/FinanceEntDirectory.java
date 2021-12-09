/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.FinanceEnt;

import Business.CommerceSystem;
import java.util.ArrayList;

/**
 *
 * @author sichengzhou
 */
public class FinanceEntDirectory {
//    private ArrayList<FinanceEnt> financeEntList;

    private FinanceEnt financeEnt;

    CommerceSystem system;

    public FinanceEntDirectory(CommerceSystem system) {
        this.system = system;
        this.financeEnt = new FinanceEnt();
    }

    public FinanceEnt getFinanceEnt() {
        return financeEnt;
    }

    public CommerceSystem getSystem() {
        return system;
    }

}
