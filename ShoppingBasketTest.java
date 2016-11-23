import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ShoppingBasketTest {

    ShoppingBasket basket1;
    ShoppingBasket basket2;
    ShoppingBasket basket3;
    ShoppingBasket basket4;
    
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
    ArrayList<Item> basketContents4 = new ArrayList<Item>();
    ArrayList<Item> bogofItems1 = new ArrayList<Item>();
    ArrayList<Item> bogofItems2 = new ArrayList<Item>();
    ArrayList<Item> bogofItems3 = new ArrayList<Item>();
    ArrayList<Item> bogofItems4 = new ArrayList<Item>();
    
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

        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(drainCleaner);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(egg);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(rubbish);
        basketContents3.add(pen);
        basket3 = new ShoppingBasket(basketContents3);

        basketContents4.add(drainCleaner);
        basket4 = new ShoppingBasket(basketContents4);

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
        assertEquals(278.24, basket3.getTotalBeforeDiscounts(), 0.001);
    }

    @Test
    public void canGetBogofItems() {
        bogofItems1 = basket1.getBogofItems();
        bogofItems2 = basket2.getBogofItems();
        bogofItems3 = basket3.getBogofItems();
        for (int i=0; i < bogofItems1.size(); i++) {
            assertTrue(bogofItems1.get(i).isBogof);
        }
        for (int i=0; i < bogofItems2.size(); i++) {
            assertTrue(bogofItems2.get(i).isBogof);
        }
        for (int i=0; i < bogofItems3.size(); i++) {
            assertTrue(bogofItems3.get(i).isBogof);
        }
    }

    @Test
    public void bogofItemsAreSortedByName() {

    }

    @Test
    public void canGetBogofDiscount() {
        assertEquals(4.99, basket1.getBogofDiscount(), 0.001);
        assertEquals(2.38, basket2.getBogofDiscount(), 0.001);
        assertEquals(125.65, basket3.getBogofDiscount(), 0.001);
    }

    @Test
    public void canApplyBogof() {

    }

    @Test
    public void canCalculateTenPerCentDiscount() {
        assertEquals(0.0, basket1.getTenPerCentDiscount(), 0.001);
        assertEquals(2.148, basket2.getTenPerCentDiscount(), 0.001);
        assertEquals(15.259, basket3.getTenPerCentDiscount(), 0.001);
        assertEquals(0.0, basket4.getTenPerCentDiscount(), 0.001);
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












