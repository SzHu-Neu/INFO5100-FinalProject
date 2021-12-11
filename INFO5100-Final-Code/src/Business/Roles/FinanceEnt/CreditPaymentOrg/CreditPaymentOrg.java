package Business.Roles.FinanceEnt.CreditPaymentOrg;

import Business.Roles.InDeliverOrganization;
import Business.Roles.PurchaseEnt.UserOrg.UserOrg;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sichengzhou
 */
public class CreditPaymentOrg {

    private ArrayList<PaymentManager> paymentManagerList;
    private ArrayList<SinglePaymentInfo> paymentInfos;

    public CreditPaymentOrg() {
        this.paymentManagerList = new ArrayList<PaymentManager>();
        this.paymentInfos = new ArrayList<SinglePaymentInfo>();
    }

    public PaymentManager addPaymentManager() {
        PaymentManager tmp = new PaymentManager(this);
        this.paymentManagerList.add(tmp);
        return tmp;
    }

    public ArrayList<SinglePaymentInfo> getPaymentInfos() {
        return this.paymentInfos;
    }

    public void addPaymentInfo(UserOrg userOrg, String description, int price) {
        this.paymentInfos.add(new SinglePaymentInfo(userOrg, description, price));
    }

    public class SinglePaymentInfo {

        private String description;
        private UserOrg userOrg;
        private int price;

        SinglePaymentInfo(UserOrg userOrg, String description, int price) {
            this.userOrg = userOrg;
            this.description = description;
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public UserOrg getUserOrg() {
            return userOrg;
        }

        public int getPrice() {
            return price;
        }
    }
}
