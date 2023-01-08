package factoryMethodExample;

public class NoSqlDatabazePackage extends Package{

    @Override
    protected void createPackage() {
        //dbList.add(new MongoDB());
        dbList.put(MongoDB.class.getName(),new MongoDB());
    }
}
