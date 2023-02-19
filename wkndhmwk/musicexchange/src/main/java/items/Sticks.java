package items;
import Enums.Material;
import Enums.StickLength;

public class Sticks extends MusicItem {

    private StickLength stickLength;
    private Material material;

    public Sticks(double boughtPrice, double sellingPrice, StickLength stickLength, Material material) {
        super(boughtPrice, sellingPrice);
        this.stickLength = stickLength;
        this.material = material;
    }

    public StickLength getStickLength() {
        return stickLength;
    }

    public void setStickLength(StickLength stickLength) {
        this.stickLength = stickLength;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
