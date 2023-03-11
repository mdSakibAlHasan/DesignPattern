package FileSystem;
import java.util.Date;

public class ObserveFile implements Observer {
    private FileChecker subject;


    public ObserveFile(FileChecker fileChecker) {
        this.subject = fileChecker;
        this.subject.register(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject == this.subject) {
            draw();
        }
    }


    public void draw() {
        Date date = this.subject.getDate();
        System.out.println("File modified at "+date);
    }

}

