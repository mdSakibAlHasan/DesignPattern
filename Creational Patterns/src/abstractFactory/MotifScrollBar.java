package abstractFactory;

public class MotifScrollBar implements ScrollBar{
    public MotifScrollBar(){
        show();
    }
    public void show(){
        System.out.println("Here are motifScrollBar");
    }
}
