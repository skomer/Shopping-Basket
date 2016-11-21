import java.util.ArrayList;



public class ShoppingBasket {

    ArrayList basketContents;
    double totalBeforeDiscounts;
    double totalAfterDiscounts;

    public void ShoppingBasket() {
    }

    public void ShoppingBasket(ArrayList basketContents) {
        this.basketContents = basketContents;
    }

    public void ShoppingBasket(ArrayList basketContents, double totalBeforeDiscounts, double totalAfterDiscounts) {
        this.basketContents = basketContents;
        this.totalBeforeDiscounts = totalBeforeDiscounts;
        this.totalAfterDiscounts = totalAfterDiscounts;
    }

    public ArrayList getBasketContents() {
        return this.basketContents;
    }

    public void addItemToBasket(Item item) {
        this.basketContents.add(item);
    }

    public void removeItemFromBasket(Item item) {
        this.basketContents.delete(item);
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









