public class demo {
//    import java.util.ArrayList;
//import java.util.Scanner;
//
//    // Product class
//    class Product {
//        String name;
//        String description;
//        double price;
//        String image;
//        int inventory;
//
//        public Product(String name, String description, double price, String image, int inventory) {
//            this.name = name;
//            this.description = description;
//            this.price = price;
//            this.image = image;
//            this.inventory = inventory;
//        }
//    }
//
//    // User class
//    class User {
//        String name;
//        String email;
//        String password;
//        String address;
//
//        public User(String name, String email, String password, String address) {
//            this.name = name;
//            this.email = email;
//            this.password = password;
//            this.address = address;
//        }
//    }
//
//    // Payment class
//    class Payment {
//        String paymentMethod;
//        String paymentDetails;
//
//        public Payment(String paymentMethod, String paymentDetails) {
//            this.paymentMethod = paymentMethod;
//            this.paymentDetails = paymentDetails;
//        }
//    }
//
//    // Mediator class
//    class Mediator {
//        ArrayList<Product> productList;
//        ArrayList<User> userList;
//        ArrayList<Payment> paymentList;
//
//        public Mediator() {
//            productList = new ArrayList<>();
//            userList = new ArrayList<>();
//            paymentList = new ArrayList<>();
//        }
//
//        public void addProduct(Product product) {
//            productList.add(product);
//        }
//
//        public void addUser(User user) {
//            userList.add(user);
//        }
//
//        public void addPayment(Payment payment) {
//            paymentList.add(payment);
//        }
//
//        public String[] confirmOrder(User user) {
//            // process order
//            String orderDetails = "Order confirmed. Thank you for shopping with us.";
//            // send payment receipt
//            String paymentDetails = "Payment received. Thank you for shopping with us.";
//            String[] result = {orderDetails, paymentDetails};
//            return result;
//        }
//    }
//
//    // Template Method class
//    abstract class EcommerceTemplate {
//        abstract void displayProduct();
//        abstract void purchaseProduct();
//        abstract void manageUser();
//        abstract void processPayment();
//
//        public void ecommerceProcess() {
//            displayProduct();
//            purchaseProduct();
//            manageUser();
//            processPayment();
//        }
//    }
//
//    // Concrete Template Method class
//    class ConcreteEcommerceTemplate extends EcommerceTemplate {
//        Scanner scanner;
//
//        public ConcreteEcommerceTemplate() {
//            scanner = new Scanner(System.in);
//        }
//
//        @Override
//        public void displayProduct() {
//            // display product details
//            for (Product product : mediator.productList) {
//                System.out.println("Product Name: " + product.name);
//                System.out.println("Description: " + product.description);
//                System.out.println("Price: " + product.price);
//                System.out.println("Image: " + product.image);
//                System.out.println("Inventory: " + product.inventory);
//            }
//        }
//
//        @Override
//        public void purchaseProduct() {
//            // purchase product
//            System.out.print("Enter the product name to purchase: ");
//            String productName = scanner.nextLine();
//            System.out.print("Enter the quantity of the product to purchase: ");
//            int productQuantity = scanner.nextInt();
//            scanner.nextLine(); // consume the new line character
//            System.out.print("Enter your name: ");
//            String userName = scanner.nextLine();
//            System.out.print("Enter your email: ");
//            String userEmail = scanner.nextLine();
//            System.out.print("Enter your password: ");
//            String userPassword = scanner.nextLine();
//            System.out.print("Enter your address: ");
//            String userAddress = scanner.nextLine();
//            System.out.print("Enter payment method (credit card, paypal, or cryptocurrency): ");
//            String paymentMethod = scanner.nextLine();
//            System.out.print("Enter payment details: ");
//            String paymentDetails
}
