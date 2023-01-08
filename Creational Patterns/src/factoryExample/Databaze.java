package factoryExample;

public class Databaze {
    String driverName, userName;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName){
        this.driverName = driverName;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void showConnectionDetails(){
        System.out.println("Driver name : "+getDriverName());
        System.out.println("User name : "+getUserName());
    }
}
