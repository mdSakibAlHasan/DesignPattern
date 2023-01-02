package Assignment;

public class Rectangular implements Shape{

    double length, wide;
    @Override
    public void setSide(double side) {
        wide = side;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*wide;
    }

    @Override
    public double getSide() {
        return wide;
    }

    public double getLength(){
        return length;
    }
}
