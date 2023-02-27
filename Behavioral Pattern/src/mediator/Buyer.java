package mediator;

public class Buyer implements MarketPlaceParticipate{
    private String name;
    private double balance;
    private MarketPlaceMediator mediator;

    public Buyer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void decreaseBalance(double amount) {
        this.balance -= amount;
    }

    public void increaseBalance(double amount) {
        this.balance += amount;
    }

    public void buy(Product product) {
        System.out.println(this.name + " is buying " + product.getName());
        this.mediator.placeOrder(this, product);
    }

    @Override
    public void setMediator(MarketPlaceMediator mediator) {
        this.mediator = mediator;
    }

//    @Override
//    public void setMediator(MarketPlaceMediator mediator) {
//
//    }
}
