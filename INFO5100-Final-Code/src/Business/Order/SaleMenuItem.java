/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

/**
 *
 * @author Ekoxier
 */
public class SaleMenuItem {

    private String name;
    private int salePrice; // Sale Price
    private int inPrice; // In Stock Price
    private int soldNumber; // number of sold out
    private int remainNumber; // number of remain 
    private boolean isDeleted; // is deleted from shop?

    public SaleMenuItem(String name, int salePrice, int inPrice, int number) {
        this.name = name;
        this.salePrice = salePrice;
        this.inPrice = inPrice;
        this.soldNumber = 0;
        this.remainNumber = number;
        this.isDeleted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getInPrice() {
        return inPrice;
    }

    public void setInPrice(int inPrice) {
        this.inPrice = inPrice;
    }

    public int getSoldNumber() {
        return soldNumber;
    }

    public int getRemainNumber() {
        return remainNumber;
    }

    public void sell(int number) {
        this.soldNumber += number;
        this.remainNumber -= number;
    }
}
