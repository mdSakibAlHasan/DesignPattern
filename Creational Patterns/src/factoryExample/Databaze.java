package factoryExample;

import singleton.DatabazeConnection;

public abstract class Databaze {
    String databazeName, userName;
    public Databaze()
    {
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setDatabazeName(String databazeName)
    {
        this.databazeName = databazeName;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getDatabazeName()
    {
        return databazeName;
    }

    public void showConnectionDetails(){
        System.out.println("Databaze name : "+getDatabazeName());
        System.out.println("User name : "+getUserName());
    }


    public abstract void connectionEstablish();
}
