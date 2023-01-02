package Liscov_substitution;

public class Rectangle implements Shape{
    double height,wide;

    public Rectangle(double height, double wide){
        this.height = height;
        this.wide = wide;
    }

    @Override
    public double getArea() {
        return height*wide;
    }
}
