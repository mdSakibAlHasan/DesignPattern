package singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject singleObject;

        singleObject = SingleObject.getObject();
        singleObject.showMessage();
    }
}
