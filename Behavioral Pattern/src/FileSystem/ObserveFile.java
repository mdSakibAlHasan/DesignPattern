package FileSystem;
import java.util.Date;

public class ObserveFile implements Observer {
    private FileChecker subject;


    public ObserveFile(FileChecker fileChecker) {
        this.subject = fileChecker;
        this.subject.register(this);
    }

    @Override
<<<<<<< HEAD
    public void update(Subject theChangedSubject) {
        if (theChangedSubject == this.subject) {
            check();
=======
    public void update(Subject subject) {
        if (subject == this.subject) {
            draw();
>>>>>>> 9d5c6c42210bbae8cee03076053ab0fe6a32e6df
        }
    }


    public void check() {
        Date date = this.subject.getDate();
        System.out.println("File modified at "+date);
    }

}

