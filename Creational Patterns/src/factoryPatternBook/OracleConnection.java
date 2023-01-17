package factoryPatternBook;

public class OracleConnection implements Connection{

    @Override
    public void connectWithDatabase() {
        System.out.println("Oracle connect with database");
    }
}
