package CompositePatternBook;

public interface Shape {
    public void draw();
    public default void add(){

    }
}
