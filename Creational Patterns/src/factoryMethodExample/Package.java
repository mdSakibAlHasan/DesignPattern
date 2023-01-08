package factoryMethodExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Package {
    //protected List<Databaze> dbList = new ArrayList<Databaze>();
    protected Map<String,Databaze> dbList = new HashMap<String,Databaze>();
    public Package(){
        createPackage();
    }

    protected abstract void createPackage();
    @Override
    public String toString(){
        return "Package [dbList=" + dbList +"]";
    }
}
