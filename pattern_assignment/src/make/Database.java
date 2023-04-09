package make;

import market.Product;
import market.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    User user;
    Product product;
    String email,name,password,address,description;
    int inventory;
    double price;
    ArrayList<User> userList;
    ArrayList<Product> productList;

    public ArrayList<User> getUser()
    {
        userList = new ArrayList<>();
        int i=0;
        try {
            Scanner scanner = new Scanner(new File("users.txt"));
            while (scanner.hasNextLine()) {
                i++;
                if(i%4 == 1)
                    email = scanner.nextLine();
                else if(i%4 == 2)
                    name = scanner.nextLine();
                else if(i%4 == 3)
                    password = scanner.nextLine();
                else {
                    address = scanner.nextLine();
                    user = new User(name,email,password,address);
                    userList.add(user);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public void storeUser(ArrayList<User> userList)
    {
        File file = new File("users.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (User user1: userList) {
                bw.write(user1.email);
                bw.newLine();
                bw.write(user1.name);
                bw.newLine();
                bw.write(user1.password);
                bw.newLine();
                bw.write(user1.address);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<Product> getProductDB()
    {
        productList = new ArrayList<>();
        int i=0;
        try {
            Scanner scanner = new Scanner(new File("product.txt"));
            while (scanner.hasNextLine()) {
                i++;
                if(i%4 == 1)
                    name = scanner.nextLine();
                else if(i%4 == 2)
                    description = scanner.nextLine();
                else if(i%4 == 3)
                    inventory = Integer.parseInt(scanner.nextLine());
                else {
                    price = Double.parseDouble(scanner.nextLine());
                    product = new Product(name,description,price,null,inventory);
                    productList.add(product);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return productList;
    }

    public void storeProduct(ArrayList<Product> productList)
    {
        File file = new File("product.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (Product user1: productList) {
                bw.write(user1.name);
                bw.newLine();
                bw.write(user1.description);
                bw.newLine();
                bw.write(String.valueOf(user1.inventory));
                bw.newLine();
                bw.write(String.valueOf(user1.price));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
//        User user[] = new User[2];
//        user[0]= new User("Sakib","bsse1209","sakib","Dhaka");
//        user[1]= new User("Hasan","bsse1209@","sakib","Dhaka");
//        ArrayList<User> users = new ArrayList<>();
//        users.add(user[0]);
//        users.add(user[1]);

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
        ArrayList<Product> products = new ArrayList<>();
        products.add(product[0]);
        products.add(product[1]);
        products.add(product[2]);
        products.add(product[3]);
        products.add(product[4]);
        products.add(product[5]);
        products.add(product[6]);
        products.add(product[7]);
        products.add(product[8]);
        Database db = new Database();
        db.storeProduct(products);
        products = db.getProductDB();

//        users = db.getUser();
        for(Product product1: products){
            System.out.println(product1.name+product1.description+product1.price+product1.inventory);
        }
    }

}
