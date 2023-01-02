package codeSmellQuestionCode;

import codeSmellAssignment.PrintMode;

public class TonerSaveMode implements PrintModee {

    @Override
    public void saveTanor() {
        //switch-case code smell
        //Replace Type Code with Polymorphism
        if(tonerSavingLevel == "Low"){
            System.out.println("A algorithm inmprlement");
        } else if (tonerSavingLevel == "Middle") {
            System.out.println("A algorithm inmprlement");
        }
        else {
            System.out.println("A algorithm inmprlement for high ");
        }

    }

    //Refused Bequest code smell
    //solution: Push Down Methon
    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }
}
