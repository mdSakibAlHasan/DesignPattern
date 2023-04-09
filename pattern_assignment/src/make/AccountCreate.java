package make;

import market.Mediator;
import market.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountCreate {
    String name, email, password, address;
    Scanner sc = new Scanner(System.in);
    User user;


    public User create_account(){
        System.out.println("--------------CREATE ACCOUNT----------------");
        System.out.print("Input your name: ");
        name = sc.nextLine();

        System.out.print("Input your Email: ");
        email = sc.nextLine();

        System.out.print("Create your new password: ");
        password = sc.nextLine();

        System.out.print("Input your address: ");
        address = sc.nextLine();

        user = new User(name,email,password,address);
        store(user);

        return user;
    }

    private void store(User user)
    {
        Database db = new Database();
        ArrayList<User> users = new ArrayList<>();
        users = db.getUser();
        users.add(user);
        db.storeUser(users);
    }

}
