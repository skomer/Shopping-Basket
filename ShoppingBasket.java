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

    public double getTotalBeforeDiscounts() {
        this.totalBeforeDiscounts = 0;
        for (int i=0; i<basketContents.size(); i++) {
            double itemPrice = basketContents.get(i).basePrice;
            this.totalBeforeDiscounts += itemPrice;
        }
        return this.totalBeforeDiscounts;
    }

    public void addItem(Item item) {
        this.basketContents.add(item);
    }

    public void removeItem(Item item) {
        this.basketContents.remove(item);
    }

    public double getTotalAfterDiscounts() {
        return 0.5;
    }

    public void applyDiscounts() {

    }


    // public applyBogof() {

    // }

    // public applyTwentyPoundsOrOver() {

    // }

    // public applyLoyalty() {

    // }

    public void emptyBasket() {

    }

}









