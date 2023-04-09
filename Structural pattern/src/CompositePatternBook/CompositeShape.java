package CompositePatternBook;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeShape implements Shape{
    List<Line> lines = new ArrayList<>();
    @Override
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}