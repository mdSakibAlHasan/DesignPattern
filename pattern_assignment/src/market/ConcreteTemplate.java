package market;

import payment.CreditCard;
import payment.Cryptocurrency;
import payment.PayPal;
import payment.Payment;
import java.util.Scanner;

public class ConcreteTemplate extends EcommerceTemplate {
    Mediator mediator;
    public ConcreteTemplate(Mediator mediator){
        this.mediator = mediator;
    }
    Scanner sc = new Scanner(System.in);
    private Product product;
    private User user;
    private Payment payment;
    @Override
    void displayProduct() {
        System.out.println("All product in this e-commerce market:");
        for(Product product: mediator.productList){
            //System.out.println(product.name+" "+product.description+" "+product.price);
            System.out.println(product);//product.toString();
        }
    }

    @Override
    boolean purchaseProduct() {
        do{
            System.out.print("Enter your purchase product name: ");
            String productName = sc.nextLine();
            product = mediator.getProduct(productName);
        }while (product == null);

        return product.inventory > 0;
    }

    @Override
    void manageUser() {
        do{
            System.out.print("Enter your email and password: ");
            String email = sc.nextLine();
            String pass = sc.nextLine();
            user = mediator.getUser(email,pass);
        }while (user == null);
    }

    @Override
    void processPayment() {
        System.out.println("Enter your payment method: \n 1.CreditCard\n2.PayPal\n3.Cryptocurrency");
        int paymentMethod = sc.nextInt();
        if(paymentMethod == 1)
            payment = new CreditCard();
        else if(paymentMethod == 2)
            payment = new PayPal();
        else
            payment = new Cryptocurrency();

        //payment.doPayment();
    }

    public void order(){
        if(ecommerceProcess()){
            String str = mediator.orderConfirm(product,user,payment,1);
            System.out.println(str);
        }
    }
}
