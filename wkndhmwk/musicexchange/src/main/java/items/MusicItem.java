package items;

import Enums.Genre;
import Interfaces.ISell;
import StockItem.StockItem;

public abstract class MusicItem extends StockItem implements ISell {


    public MusicItem(double boughtPrice, double sellingPrice) {
        super(boughtPrice, sellingPrice);
    }

    @Override
    public double calculateMarkup(double boughtFor, double sellingPrice) {
        return super.calculateMarkup(boughtFor, sellingPrice);
    }


}
