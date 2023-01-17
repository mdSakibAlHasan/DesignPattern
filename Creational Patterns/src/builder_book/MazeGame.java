package builder_book;

public class MazeGame {
    public static Maze createMaze(MazeBuilder builder) {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }

    //Maze MazeGame.

    Maze createComplexMaze(MazeBuilder builder) {
        builder.buildRoom(1);
        // . . .
        builder.buildRoom(1001);
        return builder.getMaze();
    }

}
