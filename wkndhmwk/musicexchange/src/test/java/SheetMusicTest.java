import Enums.Genre;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(5, 10, "Master of Puppets", Genre.METAL);
    }

    @Test
    public void canGetTitle(){
        assertEquals("Master of Puppets", sheetMusic.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals(Genre.METAL, sheetMusic.getGenre());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(5, sheetMusic.getBoughtPrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100.00, sheetMusic.calculateMarkup(5,10), 0.0);
    }
}
