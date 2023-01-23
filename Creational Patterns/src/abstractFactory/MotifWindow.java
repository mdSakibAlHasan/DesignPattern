package abstractFactory;

public class MotifWindow implements Window{
    public MotifWindow(){
        show();
    }
    public void show(){
        System.out.println("Motiv window class");
    }
}
