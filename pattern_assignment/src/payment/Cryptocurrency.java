package payment;

import java.util.Scanner;

public class Cryptocurrency implements Payment{
    private String sendingAddress,transctionID;
    private double ammount, offerPrice ;
    Scanner sc = new Scanner(System.in);


    @Override
    public void doPayment(double ammount, double offerPrice) {
        this.ammount = ammount;
        this.offerPrice = offerPrice;
        System.out.print("Enter sending address: ");
        sendingAddress = sc.nextLine();
        System.out.print("Enter your transaction ID: ");
        transctionID = sc.nextLine();

    }

    @Override
    public String toString() {
        return "\tPAY RECEIPT\nPayment method: Cryptocurrency\n Sending address: "+sendingAddress+
                "\n Transaction ID: "+transctionID+
                "\n Product price: "+ammount+"\n Offer price: "+offerPrice+
                "\n Payable amount: "+(ammount-offerPrice);
    }
}
