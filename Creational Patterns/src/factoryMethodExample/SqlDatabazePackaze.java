package factoryMethodExample;

public class SqlDatabazePackaze extends Package{

    @Override
    protected void createPackage() {
//        dbList.add(new MySql());
//        dbList.add(new MS_SQL());
//        dbList.add(new Oracle());

        dbList.put(MySql.class.getName(),new MySql());
        dbList.put(MS_SQL.class.getName(),new MS_SQL());
        dbList.put(Oracle.class.getName(),new Oracle());

    }
}
