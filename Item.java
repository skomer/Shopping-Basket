
public class Item implements Comparable<Item> {

    String name;
    double basePrice;
    boolean isBogof;

    public Item(String name, double basePrice, boolean isBogof) {
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

    //@Override
    public int compareTo(Item otherItem) {
        // return (this.getName() < item.getName() ? -1 :
        //     (this.getName() == item.getName() ? 0 : 1)
        // );
        return this.name.compareTo(otherItem.name);
    }



}









