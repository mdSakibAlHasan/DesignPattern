package market;

import make.Database;
import make.Login;
import payment.Payment;

import java.util.ArrayList;

public class Mediator {
    ArrayList<Product> productList;
    ArrayList<User> userList;
    Database db = new Database();

    public Mediator(){
        productList = new ArrayList<>();
        userList = new ArrayList<>();
        productList = db.getProductDB();
        userList = db.getUser();
    }

    public void addProduct(Product product){
        productList.add(product);
        db.storeProduct(productList);
    }


    public void orderConfirm(Product product, User user, Payment payment,double offerPrice){
       payment.doPayment(product.price,offerPrice);                                       //strategy pattern
        product.inventory--;
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
