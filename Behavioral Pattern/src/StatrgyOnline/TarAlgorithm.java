package StatrgyOnline;

public class TarAlgorithm implements CompressStrategy {
    @Override
    public String algorithm(String fileName) {
        return fileName+".tar";
    }
}
