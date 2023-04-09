package market;

public class Constant {
    private Constant()
    {

    }


    static Constant constant=null;
    public String HEADING = "\n\n" +
            "╔═══════════════════════════════════════════════════╗\n" +
            "║                 Welcome to E-Shop                 ║\n" +
            "║                                                   ║\n" +
            "║                                                   ║\n" +
            "║                                                   ║\n" +
            "╚═══════════════════════════════════════════════════╝\n" ;

    public String START = "1.Show product\n"+
                        "2.Create account\n"+
                        "3.Add product\n"+
                        "4.exit";

    public static Constant getInstance(){
        if(constant == null)
            constant = new Constant();

        return constant;

    }



}
