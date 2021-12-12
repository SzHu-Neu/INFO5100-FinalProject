/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.WarehouseOrg;

import Business.CommerceSystem;
import Business.Order.DeliverItem;
import Business.Order.SaleMenuItem;
import Business.Roles.DeliveryEnt.DeliveryEnt;
import Business.Roles.FactoryEnt.FactoryEnt;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import UI.WarehouseManagerWorkArea.WarehouseManagerAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ekoxier
 */
public class WarehouseManager extends Role {

    private WarehouseOrg warhouseOrg;

    public WarehouseManager(WarehouseOrg wo) {
        super(Role.Type.WarehouseManager);
        this.warhouseOrg = wo;
    }
    private ArrayList<DeliverItem> deliverItems;

    public void packAndSend(ArrayList<DeliverItem> sentDeliverItems, DeliveryEnt deliveryEnt) { // Pass these deliverItems to cerntain delivery enterprise;
        // Send this to Delivery Enterprise;        
        this.deliverItems.removeAll(sentDeliverItems);
        for (DeliverItem di : sentDeliverItems) {
            SaleMenuItem smi = this.warhouseOrg.getSaleEnterprise().getSaleMenuItemByName(di.getName()); // get SaleMenuItem that 
            if (smi != null) {
                smi.sell(di.getQuantity()); // minus quantity
            } else {
                // NULL ERROR
            }
            //////////////////////////////////////////////////////
            /// get this deliverItems to deliveryEnt (how?)
            //////////////////////////////////////////////////////
        }
    }

    public WarehouseOrg getWarhouseOrg() {
        return warhouseOrg;
    }

    public ArrayList<DeliverItem> getDeliverItems() {
        return deliverItems;
    }

    public void requestInStock(SaleMenuItem msi, int number, FactoryEnt selectedFactoryEnt) {
        //        CommerceSystem system = this.warhouseOrg.getSaleEnterprise().getSystem();
        //        system.getFactoryEntDirectory()
        //        Select which facotoryEnt to request in stock
        selectedFactoryEnt.getProductOrg().addReuqestHandleList(msi, number, this.warhouseOrg);

        // Finance should record it as well
        int totalPrice = msi.getInPrice() * number * (-1);
        this.warhouseOrg.getSaleEnterprise().getFinanceOrg().addTransaction(totalPrice, "In Stock Cost");
    }

    @Override
    public JPanel createWorkArea(UserAccount account, CommerceSystem business, Role role) {
        return new WarehouseManagerAreaJPanel(account, business, this);
    }
}
