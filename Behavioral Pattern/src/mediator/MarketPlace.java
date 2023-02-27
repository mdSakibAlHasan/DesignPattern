package mediator;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements MarketPlaceMediator{

    private List<Buyer> buyers;
    private List<Seller> sellers;
    private List<Product> products;

    public MarketPlace() {
        this.buyers = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        this.buyers.add(buyer);
    }

    @Override
    public void addSeller(Seller seller) {
        this.sellers.add(seller);
    }

    public MarketPlaceParticipate sendMessage(MarketPlaceParticipate participate)
    {
        for(MarketPlaceParticipate listPart: buyers){
            if(participate.equals(listPart)){
                return listPart;
            }
        }

        for(MarketPlaceParticipate listPart: sellers){
            if(participate.equals(listPart)){
                return listPart;
            }
        }

        return null;
    }


    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void placeOrder(Buyer buyer, Product product) {
        if (this.products.contains(product)) {
            System.out.println("Order placed by " + buyer.getName() + " for " + product.getName());
            product.setBuyer(buyer);
        } else {
            System.out.println("Product " + product.getName() + " not found in the marketplace");
        }
    }

    @Override
    public void processPayment(Buyer buyer, Seller seller, double amount) {
        if (buyer.getBalance() >= amount) {
            buyer.decreaseBalance(amount);
            seller.increaseBalance(amount);
            System.out.println("Payment of " + amount + " processed from " + buyer.getName() + " to " + seller.getName());
        } else {
            System.out.println("Insufficient funds in " + buyer.getName() + " account to process payment");
        }
    }
}
