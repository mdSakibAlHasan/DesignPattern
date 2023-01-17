package factoryPatternBook;

public class Main {
    public static void main(String[] args) {
        Databaze databaze = new MySql();
        databaze.get_connection_details();
        databaze.connect();

        System.out.println("\nOracle connect heere\n");
        databaze = new Oracle();
        databaze.get_connection_details();
    }
}
