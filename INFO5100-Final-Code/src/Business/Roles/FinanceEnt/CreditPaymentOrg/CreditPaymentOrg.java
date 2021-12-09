package Business.Roles.FinanceEnt.CreditPaymentOrg;

import Business.Roles.Organization;

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

    public void addPaymentInfo(String name, int price) {
        this.paymentInfos.add(new SinglePaymentInfo(name,price));
        
    }
   

    public class SinglePaymentInfo {

        private String name;
        private int price;

        SinglePaymentInfo(String name,int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        
    }
}
