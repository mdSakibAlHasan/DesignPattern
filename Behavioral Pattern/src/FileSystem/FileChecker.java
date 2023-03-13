package FileSystem;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileChecker extends Subject {
    private File originalFile;
    private double originalFileSize=0;

    public FileChecker(String path) {
        originalFile = new File(path);
        originalFileSize = (double)originalFile.length();
    }

    public Date getDate() {
        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        return date;
    }



    public boolean fileModifyCheck(){
        double leatestFileSize = (double) originalFile.length();
        if(originalFileSize == leatestFileSize){
            return false;
        }
        else{
            originalFileSize = leatestFileSize;
            return true;
        }
    }



    public void checkFile() {
        if (fileModifyCheck())
            notifyObject();
    }
}

