package decoder;

public abstract class Decoder implements VisualComponent{

    private VisualComponent component;

    public Decoder(VisualComponent component){
        this.component = component;
    }
    public  void draw(){
        component.draw();
    }
    public  void resize(){
        component.resize();
    }

}
