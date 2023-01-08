package factoryMethodExample;

public class Test {
    public static void main(String[] args) {
        Package df1 = DatabazeFactory.createDatabazeObject(PackageType.SQL);
        System.out.println(df1);

        Package df2 = DatabazeFactory.createDatabazeObject(PackageType.NOSQL);
        System.out.println(df2);
    }
}
