package instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;

public class Drumkit extends Instrument{

    private boolean electric;

    public Drumkit(double boughtPrice, double sellingPrice, String model, Colour colour, Material material, InstrumentType type, boolean electric) {
        super(boughtPrice, sellingPrice, model, colour, material, type);
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}

