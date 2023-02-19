import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import instruments.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;
    @Before
    public void before(){
        bass = new Bass(120,160,"Epiphone C01", Colour.RED, Material.ROSEWOOD, InstrumentType.ELECTRIC, 4);
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(50.0, bass.calculateMarkup(120, 180), 0.0);
    }


    @Test
    public void canPlayIt(){
        assertEquals("You play the Epiphone C01", bass.play());
    }
    }

