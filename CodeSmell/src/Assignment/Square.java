package Assignment;

public class Square implements Shape{
    double side;
    @Override
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getSide() {
        return side;
    }
}
