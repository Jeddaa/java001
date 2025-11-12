public class Drink extends MenuItem {
    private boolean isCold;

    public Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    public boolean getIsCold() {
        return isCold;
    }

    public void setIsCold(boolean isCold) {
        this.isCold = isCold;
    }

    @Override
    public double calculateTotalPrice(){
        return getPrice() * 1.08;
    }
}
