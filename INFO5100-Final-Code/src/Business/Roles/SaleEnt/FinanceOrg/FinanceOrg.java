/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles.SaleEnt.FinanceOrg;

import Business.Roles.SaleEnt.SaleEnt;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ekoxier
 */
public class FinanceOrg {

    private ArrayList<Transaction> transactionHistory;
    private ArrayList<Accountant> accountantList;

    public FinanceOrg(SaleEnt se) {
        this.transactionHistory = new ArrayList<Transaction>();
        this.accountantList = new ArrayList<Accountant>();
    }

    public Accountant createAccountant() {
        Accountant tmp = new Accountant(this);
        this.accountantList.add(tmp);
        return tmp;
    }

    public void addAccountant(Accountant sm) {
        this.accountantList.add(sm);
    }

    public void removeAccountant(int index) {
        this.accountantList.remove(index);
    }

    public void removeAccountant(Accountant sm) {
        this.accountantList.remove(sm);
    }

    public Transaction addTransaction(int moneyEarned, String additionalInfo) {
        Transaction tmpTransaction = new Transaction(moneyEarned, additionalInfo);
        this.transactionHistory.add(tmpTransaction);
        return tmpTransaction;
    }

    class Transaction {

        private Date time;
        private int moneyEarned;
        private String additionalInfo; // 

        Transaction(int moneyEarned, String additionalInfo) {
            this.time = new Date();
            this.moneyEarned = moneyEarned;
            this.additionalInfo = additionalInfo;
        }

        public Date getTime() {
            return time;
        }

        public int getMoneyEarned() {
            return moneyEarned;
        }

        public String getAdditionalInfo() {
            return additionalInfo;
        }
    }
}
