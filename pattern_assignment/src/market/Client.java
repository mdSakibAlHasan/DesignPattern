package market;

public class Client {


    public static void main(String[] args) {
        Product product = new Product("pen","Matador pen",5.0,null,5);
        User user = new User("Sakib","bsse1209","sakib","Dhaka");
        Mediator mediator = new Mediator();
        mediator.addUser(user);
        mediator.addProduct(product);

        ConcreteTemplate concreteTemplate = new ConcreteTemplate(mediator);
        concreteTemplate.order();
    }

}
