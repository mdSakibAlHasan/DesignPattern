package Liscov_substitution;

public class Square implements Shape {
    private double height;

    public Square(double height)
    {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*height;
    }
}

