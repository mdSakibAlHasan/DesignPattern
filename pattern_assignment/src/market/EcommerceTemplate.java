package market;

import payment.Payment;

import java.util.Scanner;

public abstract class EcommerceTemplate {

//    Mediator mediator = new Mediator();
//    Scanner sc = new Scanner(System.in);
//    private Product product;
//    private User user;
//    private Payment payment;
    abstract void displayProduct();
    abstract boolean purchaseProduct();
    abstract void manageUser();
    abstract void processPayment();

    public final boolean ecommerceProcess() {
        displayProduct();
        if(!purchaseProduct()){
            System.out.println("Your product sells out");
            return false;
        }
        manageUser();
        processPayment();

        return true;
    }
}
