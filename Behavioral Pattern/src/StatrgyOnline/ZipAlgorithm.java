package StatrgyOnline;

public class ZipAlgorithm implements CompressStrategy {
    @Override
    public String algorithm(String fileName) {

        return fileName+".zip";
    }
}
