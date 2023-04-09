package make;

import market.Product;

import java.util.Scanner;

public class ProductManage {
    String name,description,inventory,image;
    double price;
    Product product;
    Scanner sc = new Scanner(System.in);


    public void addProfuct()
    {
        System.out.println("----------ADD PRODUCT------------------");
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input description: ");
        description = sc.nextLine();
        System.out.print("Input inventory: ");
        inventory = sc.nextLine();
        System.out.print("Input price: ");
        price = sc.nextDouble();


    }
}
