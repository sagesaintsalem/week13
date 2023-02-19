package instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import StockItem.StockItem;

public abstract class Instrument extends StockItem implements IPlay {

    private String model;
    private Colour colour;
    private Material material;
    private InstrumentType type;

    public Instrument(double boughtPrice, double sellingPrice, String model, Colour colour, Material material, InstrumentType type) {
        super(boughtPrice, sellingPrice);
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    //    @Override
//    public double calculateMarkup(double boughtFor, double sellingPrice) {
//        double profit = sellingPrice - boughtFor;
//        double markUp = 100 * (profit / boughtFor);
//        return markUp;
//    }

    @Override
    public String play() {
        return "You play the " + this.model;
    }
}
