package patrones.problema3;


import javax.swing.*;

public class TakeOutSystem {
    public static void main (String[] args){
        FoodItem foodOrder = new OrderFood();
        FoodItem beverageOrder = new OrderBeverage();
        FoodItem dessertOrder = new OrderDessert();

        foodOrder.processOrder();
        beverageOrder.processOrder();
        dessertOrder.processOrder();
    }
}
