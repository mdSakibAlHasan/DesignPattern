package abstractFactory;

public class PMWidgetfactory extends WidgetFactory {
    @Override
    public Window createWindow() {
        return new PMWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }
}
