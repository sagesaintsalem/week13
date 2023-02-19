package instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;

public class Guitar extends Instrument{

    private int noOfStrings;

    public Guitar(double boughtPrice, double sellingPrice, String model, Colour colour, Material material, InstrumentType type, int noOfStrings) {
        super(boughtPrice, sellingPrice, model, colour, material, type);
        this.noOfStrings = noOfStrings;
    }
}
