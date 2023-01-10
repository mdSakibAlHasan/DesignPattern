package singleton;

public class SingleObject {
    public static SingleObject instance;

    private SingleObject()
    {
        //private constructor for single object creation
    }

    public static SingleObject getObject()
    {
        if(instance == null){
            instance = new SingleObject();
        }

        return instance;
    }

    public void showMessage()
    {
        System.out.println("Hellow this is a singleton class");
    }
}

