package patrones.problema5;

public abstract class RoomDecorator implements Room{
    public Room wrapee;

    RoomDecorator (Room room){
        this.wrapee = room;
    }

    @Override
    public String roomDescription() {
        return wrapee.roomDescription();
    }

    @Override
    public double cost() {
        return wrapee.cost();
    }
}
