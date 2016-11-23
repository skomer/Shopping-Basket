import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class ShoppingBasket {

    //////-//////-////// VARIABLE DECLARATIONS //////-//////-//////
    ArrayList<Item> basketContents;
    ArrayList<Item> bogofItems;
    double totalBeforeDiscounts;
    double bogofDiscount;
    double tenPerCentDiscount;
    double loyaltyDiscount;
    double totalAfterDiscounts;

    //////-//////-////// CONSTRUCTORS //////-//////-//////
    public ShoppingBasket() {}

    public ShoppingBasket(ArrayList<Item> basketContents) {
        this.basketContents = basketContents;
        this.totalBeforeDiscounts = getTotalBeforeDiscounts();
        this.bogofItems = getBogofItems();
        this.bogofDiscount = setBogofDiscount();
        this.tenPerCentDiscount = setTenPerCentDiscount();
        //this.loyaltyDiscount = xxx;
        //this.totalAfterDiscounts = xxx;
    }

    //////-//////-////// METHODS //////-//////-//////
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

    public double setBogofDiscount() {
        double calculatedBogofDiscount = 0.0;
        for (int i = 0; i < this.bogofItems.size(); i++) {

            try {
                if (this.bogofItems.get(i+1).name == this.bogofItems.get(i).name) {
                    calculatedBogofDiscount += this.bogofItems.get(i+1).basePrice;
                    i += 1;
                }
            } catch (IndexOutOfBoundsException ioobe) {
                int x = 1;
            }
        }

        return calculatedBogofDiscount;
    }

    public double getBogofDiscount() {
        return this.bogofDiscount;
    }

    public double setTenPerCentDiscount() {
        double subTotal = this.totalBeforeDiscounts - this.bogofDiscount;
        double calculatedTenPerCentDiscount;
        if (subTotal > 20.00) {
            calculatedTenPerCentDiscount = subTotal * 0.1;
        }
        else {
            calculatedTenPerCentDiscount = 0.0;
        }
        return calculatedTenPerCentDiscount;
    }

    public double getTenPerCentDiscount() {
        return this.tenPerCentDiscount;
    }

    // public applyLoyalty() {

    // }

    public void getTotalDiscountAmount() {

    }

    public double getTotalAfterDiscounts() {
        return 0.01;
    }



    public void emptyBasket() {

    }

}









