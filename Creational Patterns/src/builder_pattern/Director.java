package builder_pattern;

public class Director {
    /*define the order in which we
    should call the construction steps
    so that we can reuse specific configurations
    of the product we are building
     */

    public void buildBugatti(CarBuilder builder){
        builder.brand("butali")
                .color("blue").build();

    }

    public void buildLambo(CarBuilder builder){
        builder.id(23).brand("Lambo").build();
    }

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
    }
}
