package instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;

public class Keyboard extends Instrument{

    private int noOfPedals;

    public Keyboard(double boughtPrice, double sellingPrice, String model, Colour colour, Material material, InstrumentType type, int noOfPedals) {
        super(boughtPrice, sellingPrice, model, colour, material, type);
        this.noOfPedals = noOfPedals;
    }
}
