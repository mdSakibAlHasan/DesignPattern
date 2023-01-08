package factoryExample;

public class DatabazeFactory {


    public Databaze createDatabazeObject(DatabazeType type){
        switch (type){
            case MYSQL:
                return new MySql();
            case ORACLE:
                return new Oracle();
            case MONGO:
                return new MongoDB();
            default:
                return null;
        }
    }
}
