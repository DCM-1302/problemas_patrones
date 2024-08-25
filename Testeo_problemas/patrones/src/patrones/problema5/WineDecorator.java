package patrones.problema5;

public class WineDecorator extends RoomDecorator{
    WineDecorator(Room room) {
        super(room);
    }

    @Override
    public String roomDescription() {
        return wrapee.roomDescription() + ", vino (alta calidad)";
    }

    @Override
    public double cost() {
        return wrapee.cost() + 30000;
    }
}
