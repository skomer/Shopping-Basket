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
        basket.addItemToBasket(basil);
        assertTrue(basket.getBasketContents().size() == 7);
    }

    @Test
    public void canRemoveItem() {

    }

    @Test
    public void canApplyBogofDiscount() {

    }

    @Test
    public void canApplyTwentyPoundsOrOverDiscount() {

    }

    @Test
    public void canApplyLoyaltyDiscount() {

    }

    @Test
    public void canEmptyBasket() {

    }



}












