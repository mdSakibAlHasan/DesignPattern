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
    abstract void purchaseProduct();
    abstract void manageUser();
    abstract void processPayment();

    public final void ecommerceProcess() {
        displayProduct();
        purchaseProduct();
        manageUser();
        processPayment();

    }
}
