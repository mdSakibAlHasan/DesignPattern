package FileSystem;
import java.util.Date;

public class ObserveFile implements Observer {
    private FileChecker subject;


    public ObserveFile(FileChecker fileChecker) {
        this.subject = fileChecker;
        this.subject.register(this);
    }

    @Override
    public void update(Subject theChangedSubject) {
        if (theChangedSubject == this.subject) {
            check();
            //draw();

        }
    }


    public void check() {
        Date date = this.subject.getDate();
        System.out.println("File modified at "+date);
    }

}

