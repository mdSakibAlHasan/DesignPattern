package decoder;

public class TextView implements VisualComponent{
    @Override
    public void draw() {
        System.out.println("text view draw here");
    }

    @Override
    public void resize() {
        System.out.println("Resize the scroll bar");
    }
}
