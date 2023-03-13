package decoder;

public class Client {
    public static void main(String[] args) {
        TextView textView = new TextView();
        Windows windows =  new Windows();

        windows.setContent(new ScrollDecorator(new BorderDecorator(textView,1)));
    }
}
