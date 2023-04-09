package make;

import market.Mediator;
import market.Product;

import java.util.Scanner;

public class AdminControl {
    Product product;
    public String name, description, image;
    public double price;
    public int inventory;
    Scanner sc = new Scanner(System.in);
    Mediator mediator = new Mediator();
    public void createProduct()
    {
        System.out.println("---------------CREATE NEW PRODUCT----------");
        System.out.print("Enter product name: ");
        name = sc.nextLine();
        System.out.print("Enter product price: ");
        price = sc.nextDouble();
        System.out.print("Enter product inventory: ");
        inventory = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product description: ");
        description = sc.nextLine();

        product = new Product(name,description,inventory,null,inventory);
        mediator.addProduct(product);
    }
}
