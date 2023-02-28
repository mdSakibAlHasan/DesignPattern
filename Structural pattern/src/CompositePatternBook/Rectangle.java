package CompositePatternBook;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends CompositeShape{

        public void add(int x, int y, int width, int height) {
            lines.add(new Line(x, y, x + width, y));                               // Top
            lines.add(new Line(x + width, y, x + width, y + height));      // Right
            lines.add(new Line(x + width, y + height, x, y + height));    // Bottom
            lines.add(new Line(x, y + height, x, y));                            // Left
        }

}
