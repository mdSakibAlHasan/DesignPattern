package market;

import payment.Payment;

import java.util.Scanner;

public abstract class EcommerceTemplate {

    Scanner sc = new Scanner(System.in);
    String ch;
    abstract void displayProduct();
    abstract boolean purchaseProduct();
    abstract void manageUser();
    abstract void processPayment();
    abstract String makeReceipt();

    public final boolean ecommerceProcess() {
        displayProduct();
        System.out.print("Are you want to purchase(Y/N): ");
        ch = sc.nextLine();
        if(ch.equals("Y")){
            if(!purchaseProduct()){
                System.out.println("Your product sells out");
                return false;
            }
            manageUser();
            processPayment();
            makeReceipt();

            return true;
        }
        return false;
    }
}
