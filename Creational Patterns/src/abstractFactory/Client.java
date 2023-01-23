package abstractFactory;

public class Client {
    public static void main(String[] args) {
        WidgetFactory widgetFactory = new MotifWidgetFactory();
        widgetFactory.createWindow();
        widgetFactory.createScrollBar();

        widgetFactory = new PMWidgetfactory();
        widgetFactory.createScrollBar();
        widgetFactory.createWindow();
    }
}
