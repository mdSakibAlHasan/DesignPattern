package builder_book;
public abstract class MazeBuilder {
    public abstract void buildMaze();
    public abstract void buildRoom(int room);
    public abstract void buildDoor(int roomFrom, int roomTo);
    public abstract Maze getMaze();
    protected MazeBuilder() {}
}
