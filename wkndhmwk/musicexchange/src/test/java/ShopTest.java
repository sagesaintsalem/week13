import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.ISell;
import Shop.Shop;
import instruments.Drumkit;
import instruments.Guitar;
import items.Picks;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drumkit drumkit;
    Guitar guitar;
    Picks picks;

    List<ISell> stock;

    @Before
    public void before(){
        stock = new ArrayList<>();
        shop = new Shop(stock);
        drumkit = new Drumkit(150, 220, "Yamaha", Colour.BLACK, Material.ROSEWOOD, InstrumentType.PERCUSSION, false);
        guitar = new Guitar(100, 150, "Fender", Colour.PINK, Material.ROSEWOOD, InstrumentType.ELECTRIC, 6);
        picks = new Picks(1,2.50, Colour.INDIGO, Material.PLASTIC);

    }

    @Test
    public void checkStockIsEmpty(){
        ArrayList<ISell> expected = new ArrayList<>();
        assertEquals(expected, shop.getStock());
    }

    @Test
    public void canAddItem() {
        shop.addItem(drumkit);
        shop.addItem(guitar);
        shop.addItem(picks);
        ArrayList<ISell> expected = new ArrayList<>();
        expected.add(drumkit);
        expected.add(guitar);
        expected.add(picks);
        assertEquals(expected, shop.getStock());
    }

    @Test
    public void canRemoveItem(){
        shop.addItem(drumkit);
        shop.addItem(guitar);
        shop.addItem(picks);
        ArrayList<ISell> expected = new ArrayList<>();
        expected.add(drumkit);
        expected.add(guitar);
        expected.add(picks);
        System.out.println(expected);
        System.out.println(stock);
        shop.removeItem(drumkit);
        expected.remove(drumkit);
        System.out.println(expected);
        System.out.println(stock);
        assertEquals(expected, shop.getStock());

    }
}
