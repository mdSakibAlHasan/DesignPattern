package abstractFactory;

public class Client {
    public static void main(String[] args) {
        WidgetFactory widgetFactory = new MotifWidgetFactory();
        Window wd = widgetFactory.createWindow();
        wd.sh
    }
}
