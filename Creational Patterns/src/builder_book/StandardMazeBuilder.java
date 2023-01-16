package builder_book;

public class StandardMazeBuilder extends MazeBuilder{
    public StandardMazeBuilder() {}
    public void buildMaze() {}
    public void buildRoom(int room) {}
    public void buildDoor(int roomFrom, int roomTo) {}
    public Maze getMaze() { return null; }
    //private Direction commonWall(Room room1, Room room2) { return null; }
    private Maze _currentMaze;
}
