package payment;

import java.util.Scanner;

public class CreditCard implements Payment{
    private int cardNumber,pin;
    private double ammount, offerPrice ;

    Scanner sc = new Scanner(System.in);
    @Override
    public void doPayment(double ammount, double offerPrice) {
        this.ammount = ammount;
        this.offerPrice = offerPrice;
        System.out.print("Enter your card Number: ");
        cardNumber = sc.nextInt();
        System.out.print("Enter your pin: ");
        pin = sc.nextInt();
    }

    @Override
    public String toString() {
        return "\tPAY RECEIPT\nPayment method: Credit Card\nCard number: "+cardNumber+
                "\n Product price: "+ammount+"\n Offer price: "+offerPrice+
                "\n Payable amount: "+(ammount-offerPrice);
    }
}
