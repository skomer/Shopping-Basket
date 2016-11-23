import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ShoppingBasketTest {

    ShoppingBasket basket1;
    ShoppingBasket basket2;
    ShoppingBasket basket3;
    
    Item toothpaste = new Item("toothpaste", 3.99, true);
    Item drainCleaner = new Item("drain cleaner", 6.99, false);
    Item steak = new Item("steak", 10.49, false);
    Item orange = new Item("orange", 1.00, true);
    Item basil = new Item("basil", 1.20, false);


    Item pen = new Item("pen", 0.69, true);
    Item ruler = new Item("ruler", 0.90, true);
    Item rubbish = new Item("rubbish", 17.95, true);
    Item egg = new Item("egg", 1.31, false);



    
    ArrayList<Item> basketContents1 = new ArrayList<Item>();
    ArrayList<Item> basketContents2 = new ArrayList<Item>();
    ArrayList<Item> basketContents3 = new ArrayList<Item>();
    ArrayList<Item> bogofItems = new ArrayList<Item>();
    
    @Before
    public void before() {
        basketContents1.add(steak);
        basketContents1.add(orange);
        basketContents1.add(orange);
        basketContents1.add(toothpaste);
        basketContents1.add(orange);
        basketContents1.add(toothpaste);
        basket1 = new ShoppingBasket(basketContents1);

        basketContents2.add(egg);
        basketContents2.add(egg);
        basketContents2.add(pen);
        basketContents2.add(pen);
        basketContents2.add(pen);
        basketContents2.add(pen);
        basketContents2.add(orange);
        basketContents2.add(pen);
        basketContents2.add(egg);
        basketContents2.add(orange);
        basketContents2.add(steak);
        basketContents2.add(toothpaste);
        basket2 = new ShoppingBasket(basketContents2);
    }

    @Test
    public void hasContents() {
        assertTrue(basket1.getBasketContents().size() > 0);
    }

    @Test
    public void canAddItem() {
        basket1.addItem(basil);
        assertTrue(basket1.getBasketContents().size() == 7);
    }

    @Test
    public void canRemoveItem() {
        basket1.removeItem(steak);
        assertTrue(basket1.getBasketContents().size() == 5);
        assertFalse(basket1.getBasketContents().contains(steak));
    }

    @Test
    public void canGetTotalBeforeDiscounts() {
        assertEquals(21.47, basket1.getTotalBeforeDiscounts(), 0.001);
        assertEquals(23.86, basket2.getTotalBeforeDiscounts(), 0.001);
    }

    @Test
    public void canGetBogofItems() {
        bogofItems = basket1.getBogofItems();
        for (int i=0; i < bogofItems.size(); i++) {
            assertTrue(bogofItems.get(i).isBogof);
        }
    }

    @Test
    public void bogofItemsAreSortedByName() {

    }



    @Test
    public void canGetBogofDiscount() {
        assertEquals(4.99, basket1.getBogofDiscount(), 0.001);
        //assertEquals(x, basket2.getBogofDiscount(), 0.001);
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












