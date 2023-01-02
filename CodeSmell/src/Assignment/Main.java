package Assignment;

public class Main {
    public static void main(String[] args) {
        Rectangular rectangle = new Rectangular();
        rectangle.setSide(3);
        rectangle.setLength(4);
        System.out.println("Area of rectangle is:  "+rectangle.getArea());

       Square square = new Square();
       square.setSide(4);
        System.out.println("Area of square is: "+square.getArea());
    }
}
