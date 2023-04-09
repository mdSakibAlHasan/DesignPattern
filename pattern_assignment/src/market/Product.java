package market;

public class Product {
    public String name, description, image;
    public double price;
    public int inventory;

    public Product(String name, String description, double price, String image, int inventory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return  name + '\t' +
                price +'\t'+
                inventory +"\n"+
                "Description: " + description + '\n';
    }
}
