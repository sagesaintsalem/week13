package items;

import Enums.Colour;
import Enums.Genre;
import Enums.Material;

public class Picks extends MusicItem{

    private Colour colour;
    private Material material;

    public Picks(double boughtPrice, double sellingPrice, Colour colour, Material material) {
        super(boughtPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
