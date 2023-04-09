package payment;

import java.util.Scanner;

public class PayPal implements Payment{
    private String bilingAddress,accountNumber;
    private double ammount, offerPrice;

    Scanner sc = new Scanner(System.in);


    @Override
    public void doPayment(double ammount, double offerPrice) {
        this.ammount = ammount;
        this.offerPrice = offerPrice;
        System.out.print("Enter your billing address: ");
        bilingAddress = sc.nextLine();
        System.out.print("Enter your account number: ");
        accountNumber = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Paypal";
    }
}
