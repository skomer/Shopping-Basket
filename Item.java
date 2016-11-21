
public class Item {

    String name;
    double basePrice;
    boolean isBogof;

    public void Item(String name, double basePrice, boolean isBogof) {
        this.name = name;
        this.basePrice = basePrice;
        this.isBogof = isBogof;
    }

    public String getName() {
        return this.name;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public boolean getIsBogof() {
        return this.isBogof;
    }



}