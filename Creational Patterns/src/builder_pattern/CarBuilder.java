package builder_pattern;

public class CarBuilder {
    private  int id;
    private String brand;
    private String model;
    private  String color;

    public CarBuilder id(int id){
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model){
        this.model = model;
        return this;
    }

    public CarBuilder color(String color){
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(id,brand,model,color);
    }

}
