public class RootRoom {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well.
    // Add at least one method to access an object via setter and then that objects public method as you saw in the previous video.
    // then add at least one method to hide the object (e.g not using a getter) but to access the object used in composition whitin the main class like you saw in this video.
    public static void main(String[] args){
//        Dimensiones dimensiones = new Dimensiones(12,4,6);
//        Room room = new Room(4,1,3,2,2,"twin");
//
//        House myHouse = new House(room);
//
//        myHouse.ownHouse();
//
//        myHouse.getRoom().openDoor();
//
//        myHouse.sellHouse();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Ana's", wall1, wall2, wall3, wall4, ceiling, bed,lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }


}
