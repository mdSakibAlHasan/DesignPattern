package factoryPatternBook;

public abstract class Databaze {
    public String database_name;
    public void connect(){
       Connection connection= get_connection_details();
       work(connection);
    }

    public void work(Connection connection)
    {
        connection.connectWithDatabase();
    }


    public abstract Connection get_connection_details();
}
