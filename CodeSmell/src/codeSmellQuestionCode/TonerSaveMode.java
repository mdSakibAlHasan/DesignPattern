package codeSmellQuestionCode;

import java.util.Objects;

public class TonerSaveMode extends PrintMode {

     public String tonerSavingLevel;
    @Override
    public void saveTanor() {
                                  //switch-case code smell
                                 //Replace Type Code with Polymorphism
        if(Objects.equals(tonerSavingLevel, "Low")){
            System.out.println("A algorithm inmprlement");
        } else if (Objects.equals(tonerSavingLevel, "Middle")) {
            System.out.println("A algorithm inmprlement");
        }
        else {
            System.out.println("A algorithm implement for high ");
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
