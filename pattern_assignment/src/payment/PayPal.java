package payment;

import java.util.Scanner;

public class PayPal implements Payment{
    private String email;
    private String bilingAddress;
    private int accountNumber;
    Scanner sc = new Scanner(System.in);
//    public PayPal(String email, String bilingAddress, int accountNumber){
//        this.email = email;
//        this.bilingAddress = bilingAddress;
//        this.accountNumber = accountNumber;
//    }

    @Override
    public void doPayment() {
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter your billing address: ");
        String billingAddress = sc.nextLine();
        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine();
    }
}
