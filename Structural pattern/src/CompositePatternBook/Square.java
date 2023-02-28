package CompositePatternBook;

import java.util.ArrayList;
import java.util.List;

public class Square extends CompositeShape{

    public void add(int x, int y, int length){
        lines.add(new Line(x, y, x + length, y));                               // Top
        lines.add(new Line(x + length, y, x + length, y + length));      // Right
        lines.add(new Line(x + length, y + length, x, y + length));    // Bottom
        lines.add(new Line(x, y + length, x, y));                            // Left
    }


}
