package patrones.problema3;

public class OrderBeverage extends FoodItem{
    @Override
    public void takeOrder() {
        System.out.println("Beginning beverage order...");
    }

    @Override
    public void prepareOrder() {
        System.out.println("Preparing order...");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Checking item availability...");
    }

    @Override
    public void calculatePrice() {
        System.out.println("Calculating price...");
    }
}
