package abstractFactory;

public class MotifWidgetFactory extends WidgetFactory{
    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }
}
