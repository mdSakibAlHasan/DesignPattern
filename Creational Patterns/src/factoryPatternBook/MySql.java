package factoryPatternBook;

public class MySql extends Databaze{
    @Override
    public Connection get_connection_details() {
        ownMethod();
        //System.out.println("MySql database are connect here");
        return new MySqlConnection();
    }

    public void ownMethod()
    {
        System.out.println("own method");
    }
}
