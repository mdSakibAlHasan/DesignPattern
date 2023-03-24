package market;

public class Product {
    String name;
    String description;
    double price;
    String image;
    int inventory;

    public Product(String name, String description, double price, String image, int inventory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "\nProduct{\n" +
                "\tname='" + name + '\n' +
                "\tdescription='" + description + '\n' +
                "\tprice=" + price +'\n'+
                "\tinventory=" + inventory +
                '}';
    }
}
