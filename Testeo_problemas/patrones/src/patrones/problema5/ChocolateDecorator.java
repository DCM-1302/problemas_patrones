package patrones.problema5;

public class ChocolateDecorator extends RoomDecorator{
    ChocolateDecorator(Room room) {
        super(room);
    }

    @Override
    public String roomDescription() {
        return wrapee.roomDescription() + ", chocolate gourmet";
    }

    @Override
    public double cost() {
        return super.cost() + 10000;
    }
}
