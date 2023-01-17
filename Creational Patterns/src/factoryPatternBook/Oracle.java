package factoryPatternBook;

public class Oracle extends Databaze{

    @Override
    public Connection get_connection_details() {
        internalMethod();
        return new OracleConnection();
    }

    public void internalMethod(){
        System.out.println("Internal method of Oracle");
    }
}
