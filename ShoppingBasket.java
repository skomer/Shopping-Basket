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
        //this.totalBeforeDiscounts = getTotalBeforeDiscounts;
        this.bogofDiscount = setBogofDiscount();



        //this.totalAfterDiscounts = 0.0;

    }

    // unneeded constructor?
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
        Collections.sort(bogofItems);
        return bogofItems;
    }

    // public void sortBogofItems() {
    //     ArrayList<Item> unsortedBogofItems = getBogofItems();
    //     //ArrayList<Item> bogofItems = getBogofItems();
    //     // for (int i = 0; i < this.bogofItems.size(); i++) {
    //     //     System.out.println(this.bogofItems.get(i).name);
    //     // }
    //     // System.out.println("-------------------");
    //     Collections.sort(unsortedBogofItems);

    //     // for (int i = 0; i < this.bogofItems.size(); i++) {
    //     //     System.out.println(this.bogofItems.get(i).name);
    //     // }
    // }

    public double setBogofDiscount() {
        double calculatedBogofDiscount = 0.0;
        for (int i = 0; i < this.bogofItems.size(); i++) {
            if (this.bogofItems.get(i+1).name == this.bogofItems.get(i).name) {
                calculatedBogofDiscount += this.bogofItems.get(i+1).basePrice;
                i += 1;
            }
        }
        return calculatedBogofDiscount;
    }



    public double getBogofDiscount() {
        return this.bogofDiscount;
    }

    public double getTotalAfterDiscounts() {
        return 0.01;
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


        return 0.01;



    }

    // public applyTwentyPoundsOrOver() {

    // }

    // public applyLoyalty() {

    // }

    public void emptyBasket() {

    }

}









