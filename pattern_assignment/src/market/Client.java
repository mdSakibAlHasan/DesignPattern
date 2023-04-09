package market;

import make.AccountCreate;
import make.AdminControl;

import java.io.IOException;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) throws IOException {

        Constant constant = Constant.getInstance();
        AccountCreate accountCreate = new AccountCreate();
        AdminControl adminControl = new AdminControl();

        Mediator mediator = new Mediator();
        ConcreteTemplate concreteTemplate = new ConcreteTemplate(mediator);
        Scanner sc = new Scanner(System.in);
        int option;
        boolean loop=true;
        System.out.println(constant.HEADING);
        while(loop){
            System.out.println(constant.START);
            option = sc.nextInt();
            if(option == 1)
                concreteTemplate.order();
            else if (option == 2) {
                accountCreate.create_account();
            } else if (option == 3) {
                adminControl.createProduct();
            } else if (option == 4) {
                loop = false;
            }
            else
                System.out.println("Wrong input. Please enter correct input");
            System.in.read();
        }

    }

}
