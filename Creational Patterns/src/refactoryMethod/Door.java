package refactoryMethod;

public class Door extends MapSite {
    private Room room1;
    private Room room2;
    private boolean isOpen;
    public Door(Room room1, Room room2) {
        room1 = room1;
        room2 = room2;
    }

    public void enter() {
        // Implementation of Enter method
    }

    public Room otherSideFrom(Room room) {
        if (room == room1) {
            return room2;
        } else if (room == room2) {
            return room1;
        } else {
            return null;
        }
    }


}
