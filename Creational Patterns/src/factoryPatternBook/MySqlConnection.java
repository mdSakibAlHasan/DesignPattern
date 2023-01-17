package factoryPatternBook;

public class MySqlConnection implements Connection{
    @Override
    public void connectWithDatabase() {
        System.out.println("MySql connect with database-------");
    }
}
