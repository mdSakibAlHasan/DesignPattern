package singleton;

import javax.xml.crypto.Data;

public class DatabazeConnection {
    public static DatabazeConnection connection;
    public String value;

    private DatabazeConnection(){
        //private not access
    }

    public static DatabazeConnection getConnection(){
        if(connection == null){
            connection = new DatabazeConnection();
        }
        return connection;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    public static void main(String[] args) {
        DatabazeConnection instance1,instance2;
        instance1 = DatabazeConnection.getConnection();
        instance1.setValue("Oracle");

        instance2 = DatabazeConnection.getConnection();
        System.out.println("Connection establish: "+instance2.getValue());

    }
}
