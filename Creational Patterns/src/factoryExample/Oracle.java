package factoryExample;

public class Oracle extends Databaze{
    public Oracle(){
        setDriverName("oracle.jdbc.driver.OracleDriver");
        setUserName("oracle@123");
    }
}
