import java.util.Arrays;
import java.util.ArrayList;

public abstract class MenuItem {
    private String name;
    private double price;
    private static final double MAX_PRICE = 100;
    private static final ArrayList<String>VALID_NAMES =
            new ArrayList<>(Arrays.asList("latte", "cappuccino", "espresso"));

    public MenuItem(String name, double price) {
        setPrice(price);
        setName(name);
    }

    public void setPrice(double price) {
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        if(price > MAX_PRICE)
            throw new IllegalArgumentException("Price cannot be greater than " + MAX_PRICE);
        this.price = price;
    }

    public void setName(String name) {
        String lowerName = name.toLowerCase();
        for(String valid_name: VALID_NAMES){
            if (valid_name.equals(lowerName)) {
                this.name = name;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid name: " + name + "Names must be one of " + VALID_NAMES);
    }

    public String getMenu() {
        return String.format("%s: %d", getName(), getPrice());
    }
    public int getPrice() {
        return (int) price;
    }
    public String getName() {
        return name;
    }

    public abstract double calculateTotalPrice();
}


