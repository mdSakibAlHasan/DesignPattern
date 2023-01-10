package factoryExample;

public class MySql extends Databaze {

  public MySql()
  {
      setDatabazeName("MySQL");
      setUserName("sakib");
  }

    @Override
    public void connectionEstablish() {

    }
}
