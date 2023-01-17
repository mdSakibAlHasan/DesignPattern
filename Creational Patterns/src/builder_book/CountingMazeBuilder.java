package builder_book;

public class CountingMazeBuilder extends MazeBuilder{
    public CountingMazeBuilder() {}
    public void buildMaze() {}
    public void buildRoom(int room) {}
    public void buildDoor(int roomFrom, int roomTo) {}

    @Override
    public Maze getMaze() {
        return null;
    }

    //public void addWall(int room, Direction direction) {}
    public void getCounts(int[] counts) {
        counts[0] = _doors;
        counts[1] = _rooms;
    }

    public void getCounts(int room,int door){
        _doors = door;
        _rooms = door;
    }
    private int _doors;
    private int _rooms;
}
