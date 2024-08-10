package patrones.problema5;

public class HotelSystem {
    public static void main (String[] args){
        Room room = new BasicRoom();
        System.out.println(room.roomDescription() + " \n Costo: $" + room.cost() + "\n");

        room = new FlowersDecorator(room);
        System.out.println(room.roomDescription() + " \n Costo: $" + room.cost() + "\n");

        room = new ChocolateDecorator(room);
        System.out.println(room.roomDescription() + " \n Costo: $" + room.cost() + "\n");

        room = new WineDecorator(room);
        System.out.println(room.roomDescription() + " \n Costo: $" + room.cost() + "\n");

    }
}
