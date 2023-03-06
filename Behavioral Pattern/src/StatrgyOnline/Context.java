package StatrgyOnline;

public class Context {
    private CompressStrategy compressStrategy;

    public Context(CompressStrategy compressStrategy){
        this.compressStrategy = compressStrategy;
    }

    public String executeStrategy(String fileName){
        return compressStrategy.algorithm(fileName);
    }
}
