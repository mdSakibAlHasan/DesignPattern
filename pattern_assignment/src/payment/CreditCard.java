package payment;

import java.util.Scanner;

public class CreditCard implements Payment{
    private int cardNumber;
    private int pin;
    Scanner sc = new Scanner(System.in);
//    public CreditCard(String cardNumber, int pin) {
//        this.cardNumber = cardNumber;
//        this.pin = pin;
//    }
    @Override
    public void doPayment() {
        System.out.print("Enter your card Number: ");
        cardNumber = sc.nextInt();
        System.out.print("Enter your pin: ");
        pin = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Your card number is "+cardNumber;
    }
}
