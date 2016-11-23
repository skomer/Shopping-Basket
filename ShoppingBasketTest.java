import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ShoppingBasketTest {

    ShoppingBasket basket;
    
    Item toothpaste = new Item("toothpaste", 3.99, true);
    Item drainCleaner = new Item("drain cleaner", 6.99, false);
    Item steak = new Item("steak", 10.49, false);
    Item orange = new Item("orange", 1.00, true);
    Item basil = new Item("basil", 1.20, false);
    
    ArrayList<Item> basketContents = new ArrayList<Item>();
    ArrayList<Item> bogofItems = new ArrayList<Item>();
    
    @Before
    public void before() {
        basketContents.add(steak);
        basketContents.add(orange);
        basketContents.add(orange);
        basketContents.add(toothpaste);
        basketContents.add(orange);
        basketContents.add(toothpaste);
        basket = new ShoppingBasket(basketContents);
    }

    @Test
    public void hasContents() {
        assertTrue(basket.getBasketContents().size() > 0);
    }

    @Test
    public void canAddItem() {
        basket.addItem(basil);
        assertTrue(basket.getBasketContents().size() == 7);
    }

    @Test
    public void canRemoveItem() {
        basket.removeItem(steak);
        assertTrue(basket.getBasketContents().size() == 5);
        assertFalse(basket.getBasketContents().contains(steak));
    }

    @Test
    public void canGetTotalBeforeDiscounts() {
        assertEquals(21.47, basket.getTotalBeforeDiscounts(), 0.001);
    }

    @Test
    public void canGetBogofItems() {
        bogofItems = basket.getBogofItems();
        for (int i=0; i < bogofItems.size(); i++) {
            assertTrue(bogofItems.get(i).isBogof);
        }
    }

    @Test
    public void fakeTest() {
        basket.sortBasket();
    }





    @Test
    public void canGetBogofDiscount() {

    }

    @Test
    public void canApplyBogof() {

    }

    @Test
    public void canApplyTwentyPoundsOrOver() {

    }

    @Test
    public void canApplyLoyalty() {

    }

    @Test
    public void canEmptyBasket() {

    }



}












