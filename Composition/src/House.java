public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }

    public void ownHouse(){
        System.out.println("This is my house, calls openDoor(), using object");
        room.openDoor();
    }

    public void sellHouse(){
        System.out.println("House for sale, calls closeDoor(), using getter");
        getRoom().closeDoor();

    }
    public Room getRoom() {
        return room;
    }
}
