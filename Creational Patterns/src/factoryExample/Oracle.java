package factoryExample;

public class Oracle extends Databaze {

    public Oracle()
    {
        setDatabazeName("Oracle");
        setUserName("sakib");
    }
    @Override
    public void connectionEstablish() {

    }
}
