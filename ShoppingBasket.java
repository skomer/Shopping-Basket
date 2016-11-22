import java.util.ArrayList;

public class ShoppingBasket {

    ArrayList<Item> basketContents;
    double totalBeforeDiscounts;
    double totalAfterDiscounts;

    public ShoppingBasket() {
    }

    public ShoppingBasket(ArrayList<Item> basketContents) {
        this.basketContents = basketContents;
    }

    public ShoppingBasket(ArrayList<Item> basketContents, double totalBeforeDiscounts, double totalAfterDiscounts) {
        this.basketContents = basketContents;
        this.totalBeforeDiscounts = totalBeforeDiscounts;
        this.totalAfterDiscounts = totalAfterDiscounts;
    }

    public ArrayList<Item> getBasketContents() {
        return this.basketContents;
    }

    public void addItem(Item item) {
        this.basketContents.add(item);
    }

    public void removeItem(Item item) {
        this.basketContents.remove(item);
    }

    // public applyBogofDiscount() {

    // }

    // public applyTwentyPoundsOrOverDiscount() {

    // }

    // public applyLoyaltyDiscount() {

    // }

    public void emptyBasket() {

    }

}









