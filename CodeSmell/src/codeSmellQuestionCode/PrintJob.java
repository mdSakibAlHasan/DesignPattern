package codeSmellQuestionCode;

import codeSmellAssignment.HighTonerSaveMode;
import codeSmellAssignment.LowTonerSaveMode;
import codeSmellAssignment.MediumTonerSaveMode;

import java.util.Queue;

public class PrintJob {
    //Feature envey
    //long class
    //extract class
    HighTonerSaveMode highTonerSaveMode = new HighTonerSaveMode();
    LowTonerSaveMode lowTonerSaveMode = new LowTonerSaveMode();
    MediumTonerSaveMode mediumTenorSaveMode = new MediumTonerSaveMode();
    Queue<Object> PrintRequest ;

    public void pullJob()
    {

    }

    //feature envey
    public void changePriority()
    {

    }
}
