package Shop;

import Interfaces.ISell;
import instruments.Drumkit;

import java.util.List;

public class Shop implements ISell {

    private List<ISell> stock;

    public Shop(List<ISell> stock) {
        this.stock = stock;
    }

    public List<ISell> getStock() {
        return stock;
    }

    public void setStock(List<ISell> stock) {
        this.stock = stock;
    }

    @Override
    public double calculateMarkup(double boughtFor, double sellingPrice) {
        double profit = sellingPrice - boughtFor;
        double markUp = 100 * (profit / boughtFor);
        return markUp;
    }

    public void addItem(ISell sellableItem){
        stock.add(sellableItem);
    }

    public void removeItem(ISell sellableItem) {
        stock.remove(sellableItem);
    }
}


