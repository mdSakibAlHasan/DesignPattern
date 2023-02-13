package builder_pattern;

public class Director {
    /*define the order in which we
    should call the construction steps
    so that we can reuse specific configurations
    of the product we are building
     */

    public void buildFarary(CarBuilder builder){
        builder.brand("butali").build();

    }

    public void buildLambo(CarBuilder builder){
        builder.id(23).brand("Lambo").build();
    }

    public static void main(String[] args) {
       // Director director = new Director();
        CarBuilder builder = new CarBuilder();
        //director.buildFarary(builder);
      Car car =  builder.brand("ferary").color("blue").id(67).build();
        System.out.println(car.toString());

    }
}
