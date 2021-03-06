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
    private String description;

    public SaleMenuItem(String name, int salePrice, int inPrice, int number, String description) {
        this.name = name;
        this.salePrice = salePrice;
        this.inPrice = inPrice;
        this.soldNumber = 0;
        this.remainNumber = number;
        this.isDeleted = false;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean IsDeleted() {
        return isDeleted;
    }

    public String getDescription() {
        return description;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setRemainNumber(int remainNumber) {
        this.remainNumber = remainNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void inStock(int inStockNumber) {
        this.remainNumber += inStockNumber;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
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
