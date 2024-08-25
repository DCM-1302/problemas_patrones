package patrones.problema5;

public class FlowersDecorator extends RoomDecorator{
    FlowersDecorator(Room room) {
        super(room);
    }

    @Override
    public String roomDescription() {
        return wrapee.roomDescription() + ", flores frescas";
    }

    @Override
    public double cost() {
        return wrapee.cost() + + 10000;
    }
}
