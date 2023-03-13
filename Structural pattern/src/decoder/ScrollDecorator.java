package decoder;

public class ScrollDecorator extends Decoder{

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    public void draw() {
        super.draw();
        drawScroll();
    }

    private void drawScroll(){
        System.out.println("Scroll draw here");
    }
}
