/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.DeliveryEnt;

import Business.Roles.DeliveryEnt.DistributionOrg.DistributionOrg;
import java.util.ArrayList;

/**
 *
 * @author Ekoxier
 */
public class DeliveryEnt {
    
    private DistributionOrg disOrg;
    
    public DeliveryEnt(String name){
        this.disOrg = new DistributionOrg(this,name);
    }

    public DistributionOrg getDistributionOrg(){
        return disOrg;
    } 

}
