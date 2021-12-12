package Business.Roles.FinanceEnt.CreditPaymentOrg;

import Business.Roles.InDeliverOrganization;
import Business.Roles.PurchaseEnt.UserOrg.UserOrg;

import java.util.ArrayList;
import java.util.Date;

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
    private String name;

    public CreditPaymentOrg(String name) {
        this.paymentManagerList = new ArrayList<PaymentManager>();
        this.paymentInfos = new ArrayList<SinglePaymentInfo>();
        this.name = name;
    }

    public PaymentManager addPaymentManager() {
        PaymentManager tmp = new PaymentManager(this);
        this.paymentManagerList.add(tmp);
        return tmp;
    }

    public ArrayList<SinglePaymentInfo> getPaymentInfos() {
        return this.paymentInfos;
    }

    public int checkMoneyOwed(UserOrg targetedUserOrg) {
        int amount = 0;
        for (SinglePaymentInfo spi : paymentInfos) {
            if (spi.getUserOrg().equals(targetedUserOrg)) {
                if (spi.info.equals("Buy")) {
                    amount += spi.getAmount();
                } else if (spi.info.equals("Pay") || spi.info.equals("Return")) {
                    amount -= spi.getAmount();
                }
            }
        }
        return amount;
    }

    public void addPaymentInfo(UserOrg userOrg, String description, int price) {
        this.paymentInfos.add(new SinglePaymentInfo(userOrg, description, price));
    }

    public class SinglePaymentInfo {

        private String info;
        private UserOrg userOrg;
        private Date time;

        private int amount;

        SinglePaymentInfo(UserOrg userOrg, String description, int amount) {
            this.userOrg = userOrg;
            this.info = description;
            this.amount = amount;
            this.time = new Date();
        }

        public String getInfo() {
            return info;
        }

        public UserOrg getUserOrg() {
            return userOrg;
        }

        public Date getTime() {
            return time;
        }

        public int getAmount() {
            return amount;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
