package mediator;

public class Seller implements MarketPlaceParticipate{
    private String name;
    private double balance;
    private MarketPlaceMediator mediator;

    public Seller(String name, double balance) {
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

    public Seller getProducts(Product product) {
        return this;
    }

    @Override
    public void setMediator(MarketPlaceMediator mediator) {

    }
}
