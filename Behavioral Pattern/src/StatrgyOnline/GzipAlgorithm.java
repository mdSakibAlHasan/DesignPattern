package StatrgyOnline;

public class GzipAlgorithm implements CompressStrategy {
    @Override
    public String algorithm(String fileName) {
        return fileName+".gzip";
    }
}
