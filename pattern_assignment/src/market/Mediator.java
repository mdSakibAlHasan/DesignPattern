package market;

import payment.Payment;

import java.util.ArrayList;

public class Mediator {
    ArrayList<Product> productList;
    ArrayList<User> userList;

    public Mediator(){
        productList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public String orderConfirm(Product product, User user, Payment payment){
       payment.doPayment();                                       //strategy pattern

        String str = user.name +" you confirm "+product.name+" and your price is "+product.price+
                " through "+payment.toString();
        return str;
    }

    public Product getProduct(String productName){
        for(Product product: productList){
            if(product.name.equals(productName))
                return product;
        }

        return null;
    }

    public User getUser(String email, String pass){
        for(User user: userList){
            if(user.email.equals(email) && user.password.equals(pass))
                return user;
        }

        return null;
    }

}
