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
    private ArrayList<FinanceEnt> financeEntList;
    CommerceSystem system;

    public FinanceEntDirectory(CommerceSystem system) {
        this.system = system;
        this.financeEntList = new ArrayList<FinanceEnt>();
    }

    public CommerceSystem getSystem() {
        return system;
    }
    
    
}
