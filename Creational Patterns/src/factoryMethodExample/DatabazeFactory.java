package factoryMethodExample;

public class DatabazeFactory {
    public static Package createDatabazeObject(PackageType type)
    {
        switch (type){
            case SQL:
                return new SqlDatabazePackaze();
            case NOSQL:
                return new NoSqlDatabazePackage();
            default:
                return null;
        }
    }
}
