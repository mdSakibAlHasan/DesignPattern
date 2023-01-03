package codeSmellQuestionCode;

public class PageSaveMode extends PrintMode{
    //Refused Bequest code smell
    //solution: Push Down Methon
    @Override
    public void saveTanor() {

    }

    @Override
    public void savePage() {
        System.out.println("An algorithm");
    }

    public void renderPreview()
    {

    }

    @Override
    public void boost() {

    }
}
