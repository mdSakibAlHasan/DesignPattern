package market;

import java.io.IOException;

public class Client {


    public static void main(String[] args) throws IOException {
        Product product[] = new Product[10];
        product[0]= new Product("pen","Matador pen",5.0,null,5);
        product[1]= new Product("khata","Basundhara",50.0,null,7);
        product[2]= new Product("Keybord","habic",500.0,null,3);
        product[3]= new Product("mobile","Iphone",20000.0,null,2);
        product[4]= new Product("laptop","Dell",100000.0,null,1);
        product[5]= new Product("mouse","A4 tec",900.0,null,7);
        product[6]= new Product("keypad","Apple",150.0,null,5);
        product[7]= new Product("SSD","samsung",4000.0,null,5);
        product[8]= new Product("RAM","team",5000.0,null,0);

        User user[] = new User[2];
        user[0]= new User("Sakib","bsse1209","sakib","Dhaka");
        user[1]= new User("Hasan","bsse1209@","sakib","Dhaka");
        Mediator mediator = new Mediator();
        for(int i=0;i<9;i++)
            mediator.addProduct(product[i]);
        for(int i=0;i<2;i++)
            mediator.addUser(user[i]);


        ConcreteTemplate concreteTemplate = new ConcreteTemplate(mediator);
        while(true){
            concreteTemplate.order();
            //System.out.println("Are you show again?");
            System.in.read();
        }

    }

}
