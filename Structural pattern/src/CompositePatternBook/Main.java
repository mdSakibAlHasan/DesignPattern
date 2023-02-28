package CompositePatternBook;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.add(10, 10, 100, 50);
        rectangle.draw();

        System.out.println("/n/n Here are square draw \n\n");
        Square square = new Square();
        square.add(10,10,100);
        square.draw();
    }

}
