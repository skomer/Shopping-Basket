import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

    Item lightbulb = new Item("lightbulb", 4.99, false);
    Item smellyCandle = new Item("scented candle", 8.99, true);
    Item peanut = new Item("peanut", 0.05, false);
    Item frozenPizza = new Item("frozen pizza", 3.00, false);

    @Test
    public void hasName() {
        assertEquals("scented candle", smellyCandle.getName());
    }

    @Test
    public void hasBasePrice() {
        assertEquals(4.99, lightbulb.getBasePrice(), 0.001);
    }

    @Test
    public void isBogofOrNot() {
        assertEquals(false, frozenPizza.getIsBogof());
    }


}







