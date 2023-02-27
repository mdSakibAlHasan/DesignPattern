package mediator;

public interface MarketPlaceMediator {
    public void addBuyer(Buyer buyer);
    public void addSeller(Seller seller);
    public void addProduct(Product product);
    public void placeOrder(Buyer buyer, Product product);
    public void processPayment(Buyer buyer, Seller seller, double amount);
}
