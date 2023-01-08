package codeSmellQuestionCode;

public abstract class PrintMode {
   public int number_of_pages, page_size;
   public String orientation, color_intensity;
   Double cost_per_page;
    public static String tonerSavingLevel="";
    public abstract void saveTanor();       //
    public abstract void savePage();
    public abstract void boost();
}
