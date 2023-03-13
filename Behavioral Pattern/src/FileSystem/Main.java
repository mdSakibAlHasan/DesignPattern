package FileSystem;

public class Main {
    public static void main(String[] args) {
        FileChecker fileChecker = new FileChecker("test.txt");
        new ObserveFile(fileChecker);


        while (true) {
            fileChecker.checkFile();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {
                error.printStackTrace();
            }
        }
    }
}
