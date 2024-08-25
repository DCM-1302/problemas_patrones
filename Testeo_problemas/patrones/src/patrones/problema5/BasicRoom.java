package patrones.problema5;

public class BasicRoom implements Room{
    @Override
    public String roomDescription() {
        return "Habitación básica";
    }

    @Override
    public double cost() {
        return 100000;
    }
}
