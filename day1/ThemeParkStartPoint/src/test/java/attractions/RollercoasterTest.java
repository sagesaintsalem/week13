package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRollercoaster(){
        Visitor visitor1 = new Visitor(13, 146.00, 11.97);
        Visitor visitor2 = new Visitor(13, 140.00, 12.54);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void tallPeopleOvercharged(){
        Visitor visitor3 = new Visitor(24, 205.00, 34.32);
        Visitor visitor4 = new Visitor(22, 190.50, 31.10);
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor4), 0.0);
    }
}
