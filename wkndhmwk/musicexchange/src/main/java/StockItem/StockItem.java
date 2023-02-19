package StockItem;

import Interfaces.ISell;

public abstract class StockItem implements ISell {
    private double boughtPrice;
    private double sellingPrice;

    public StockItem(double boughtPrice, double sellingPrice) {
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double calculateMarkup(double boughtFor, double sellingPrice) {
        double profit = sellingPrice - boughtFor;
        double markUp = 100 * (profit / boughtFor);
        return markUp;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
