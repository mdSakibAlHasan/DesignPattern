package refactoryMethod;

public class Room extends MapSite{
    private MapSite[] sides = new MapSite[4];
    private int roomNumber;
    public Room(int roomNo) {
        roomNumber = roomNo;
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    public void setSide(Direction direction, MapSite site) {
        sides[direction.ordinal()] = site;
    }

    public void enter() {
        // Implementation of Enter method
    }



}
