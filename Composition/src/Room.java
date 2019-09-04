public class Room {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well.
    // Add at least one method to access an object via getter and then that objects public method as you saw in the previous video.
    // then add at least one method to hide the object (e.g not using a getter) but to access the object used in composition within the main class like you saw in this video.

    private int walls;
    private int doors;
    private int chairs;
    private int beds;
    private int windows;
    private String typeOfRoom;
    private Dimensiones dimensiones;

    public Room(int walls, int doors, int chairs, int beds, int windows, String typeOfRoom) {
        this.walls = walls;
        this.doors = doors;
        this.chairs = chairs;
        this.beds = beds;
        this.windows = windows;
        this.typeOfRoom = typeOfRoom;
    }

    public void closeDoor(){
        System.out.println("Close the door");
    }

    public void openDoor(){
        System.out.println("Open this door");
    }
    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getChairs() {
        return chairs;
    }

    public int getBeds() {
        return beds;
    }

    public int getWindows() {
        return windows;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }
}
