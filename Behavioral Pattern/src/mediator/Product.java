package mediator;

public class Product implements MarketPlaceParticipate{
    private String name;
    private double price;
    private Buyer buyer;
    private MarketPlaceMediator mediator;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
        this.mediator.processPayment(buyer, this.getOwner(), this.price);
    }

    public Seller getOwner() {
//        for (Seller seller : this.mediator.getSellers()) {
//            for (Product product : seller.getProducts(this)) {
//                if (product == this) {
//                    return seller;
//                }
//            }
//        }
        return null;
    }

    @Override
    public void setMediator(MarketPlaceMediator mediator) {
        this.mediator = mediator;
    }
}
