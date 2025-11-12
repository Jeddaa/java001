public class Food extends MenuItem{
    private boolean isVegetarian;

    public Food(String name, double price, boolean isVegetarian) {
        super(name, price);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * 1.15;
    }
}
