package decoder;

public class BorderDecorator extends Decoder{
    private int width;

    public BorderDecorator(VisualComponent component, int width){
        super(component);
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder(width);
    }

    private void drawBorder(int borderWidth) {
        System.out.println("Border added here and width "+width);

    }
}
