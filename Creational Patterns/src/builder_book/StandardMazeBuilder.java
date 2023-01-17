package builder_book;

import refactoryMethod.Direction;
import refactoryMethod.Room;
import refactoryMethod.Wall;

public class StandardMazeBuilder extends MazeBuilder{
    private Maze currentMaze;


    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(int n) {
        if (currentMaze.rooms.get(n) != null) {
            Room room = new Room(n);
            currentMaze.AddRoom(room);
            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {

    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }
}
