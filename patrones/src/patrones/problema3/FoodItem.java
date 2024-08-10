package patrones.problema3;

public abstract class FoodItem {

    public final void processOrder () {
        takeOrder();
        prepareOrder();
        checkAvailability();
        calculatePrice();
        completeOrder();
    }

    public abstract void takeOrder ();
    public abstract void prepareOrder ();
    public abstract void checkAvailability ();
    public abstract void calculatePrice ();
    private void completeOrder () {
        System.out.println("Order Completed.");
    }

}
