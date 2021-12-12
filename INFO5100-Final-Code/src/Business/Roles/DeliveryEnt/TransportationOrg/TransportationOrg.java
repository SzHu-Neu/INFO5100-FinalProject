/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Business.Roles.DeliveryEnt.TransportationOrg;
import Business.Roles.DeliveryEnt.TransportationOrg.Driver;
import java.util.List;

import Business.Roles.DeliveryEnt.TransportationOrg.TransportationManager;
import Business.Roles.DeliveryEnt.TransportationOrg.Driver;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Dom
 */
public class TransportationOrg {
       private String name;
       private List<Driver> driverList;
       private List<TransportationManager> transManagerList;
       
       public TransportationOrg(String name){
            this.name = name;
            this.driverList = new ArrayList<Driver>();
            this.transManagerList = new ArrayList<TransportationManager>();
        }
        
       public Driver createDriver(){
            Driver driver = new Driver(this);
            this.driverList.add(driver);
            return driver;
        }
       public void addDriver(Driver driver){
            this.driverList.add(driver);
        }
       
       public TransportationManager createTransportationManager(){
            TransportationManager tm = new TransportationManager(this);
            this.transManagerList.add(tm);
            return tm;
        }
       public void addManager(TransportationManager tm){
            this.transManagerList.add(tm);
        }

    
}
