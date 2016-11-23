import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class ShoppingBasket {

    ArrayList<Item> basketContents;
    ArrayList<Item> bogofItems;
    double totalBeforeDiscounts;
    double totalAfterDiscounts;

    double bogofDiscount;

    public ShoppingBasket() {
    }

    public ShoppingBasket(ArrayList<Item> basketContents) {
        this.basketContents = basketContents;
        this.bogofItems = getBogofItems();
    }

    // public ShoppingBasket(ArrayList<Item> basketContents, double totalBeforeDiscounts, double totalAfterDiscounts) {
    //     this.basketContents = basketContents;
    //     this.totalBeforeDiscounts = totalBeforeDiscounts;
    //     this.totalAfterDiscounts = totalAfterDiscounts;
    // }

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

    public ArrayList<Item> getBogofItems() {
        ArrayList<Item> bogofItems = new ArrayList<Item>();
        for (int i=0; i < basketContents.size(); i++) {
            Item item = basketContents.get(i);
            if (item.isBogof == true) {
                bogofItems.add(item);
            }
        }
        return bogofItems;
    }

    public void sortBogofItems() {
        //ArrayList<Item> bogofItems = getBogofItems();
        // for (int i = 0; i < this.bogofItems.size(); i++) {
        //     System.out.println(this.bogofItems.get(i).name);
        // }
        // System.out.println("-------------------");
        Collections.sort(this.bogofItems);

        // for (int i = 0; i < this.bogofItems.size(); i++) {
        //     System.out.println(this.bogofItems.get(i).name);
        // }
    }

    public double getTotalAfterDiscounts() {
        return 0.5;
    }

    public void applyDiscounts() {

    }

    public double applyBogof() {

        // Check if there are bogof eligible items in the basket
        // If so, apply the discount to them
        // check for duplicates in the basket?
        // extract items from the basket who have bogof=true
        // match them up somehow
        // 


        return 884.2;



    }

    // public applyTwentyPoundsOrOver() {

    // }

    // public applyLoyalty() {

    // }

    public void emptyBasket() {

    }

}









