package make;

import market.Mediator;

import java.util.EnumMap;
import java.util.Scanner;

public class Login {
    String email, password;
    Scanner sc = new Scanner(System.in);
    Mediator mediator = new Mediator();

    public boolean login()
    {
        System.out.println("-----------------LOGIN-----------");
        System.out.print("Email: ");
        email = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();

        if(mediator.getUser(email,password)== null){
            return false;
        }
        else {
            return true;
        }
    }
}
