import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest {

    ShoppingBasket basket;
    
    Item toothpaste = new Item("toothpaste", 3.99, true);
    Item drainCleaner = new Item("drain cleaner", 6.99, false);
    Item steak = new Item("steak", 10.49, false);
    Item orange = new Item("orange", 1.00, true);

    ArrayList<Item> basketContents = {steak, orange, orange, toothpaste, orange, toothpaste};

    @Before
    public void before() {
        basket = new ShoppingBasket(basketContents);
    }

    @Test
    public void hasContents() {

    }

    @Test
    public void canAddItem() {

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












