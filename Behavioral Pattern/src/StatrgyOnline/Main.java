package StatrgyOnline;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ZipAlgorithm());
        System.out.println("Compress file name: " + context.executeStrategy("book"));

        context = new Context(new TarAlgorithm());
        System.out.println("Compress file name: " + context.executeStrategy("book"));

        context = new Context(new GzipAlgorithm());
        System.out.println("Compress file name: " + context.executeStrategy("book"));
    }
}
