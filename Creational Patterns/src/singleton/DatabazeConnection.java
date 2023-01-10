package singleton;

import javax.xml.crypto.Data;

public class DatabazeConnection {
    public static DatabazeConnection connection;

    private DatabazeConnection(){
        //private not access
    }

    public static DatabazeConnection getConnection(){
        if(connection == null){
            connection = new DatabazeConnection();
        }
        return connection;
    }

    public  void setConnection()
    {
        System.out.println("Connection Establish");
    }

    public static void main(String[] args) {
        DatabazeConnection instance;
        instance = DatabazeConnection.getConnection();
        instance.setConnection();
    }
}
