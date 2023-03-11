package payment;

import java.util.Scanner;

public class Cryptocurrency implements Payment{
    private String sendingAddress;
    private String transctionID;
    Scanner sc = new Scanner(System.in);


    @Override
    public void doPayment() {
        System.out.print("Enter sending address: ");
        String senderAddress = sc.nextLine();
        System.out.print("Enter your transaction ID: ");
        String transactionID = sc.nextLine();

    }
}
