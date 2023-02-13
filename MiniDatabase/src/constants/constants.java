package constants;
/**
 * A Global store for all the constants used in the application.
 * In future, we can let the user a create configuration file to modify the constants.
 */
public class constants {

    //Constant class are not needed to create multiple object.
    //we use here singleton patttern

    private constants(){

    }

    public String VERSION = "v0.3.1";
    String ROOT_PATH = ".";
    public String DATA_XML_PATH = ROOT_PATH + "\\minidb.xml";
    public String DB_DIR_PATH = ROOT_PATH + "\\db";

    public String HEADING = "\n\n" +
            "╔═══════════════════════════════════════════════════╗\n" +
            "║                 Welcome to MiniDB                 ║\n" +
            "║                      " + VERSION + "                       ║\n" +
            "║              --- Made by Chanakya ---             ║\n" +
            "║      Source: https://github.com/U-C-S/MiniDB      ║\n" +
            "╚═══════════════════════════════════════════════════╝\n" +
            "Enter the Commands: (Use 'exit;' to exit the cli)";

    public String CMD_PREFIX = "\n\u001B[31m>\u001B[0m ";

    //Alternative for those CLIs that cannot read UTF-8
    public String HEADINGx = "\n\n" +
            "---------- Welcome to MiniDB ----------\n" +
            "---------------- " + VERSION + " ---------------\n" +
            "----------- Made by Chanakya ----------\n" +
            "Source: https://github.com/U-C-S/MiniDB\n\n" +
            "Enter the Commands: (Use 'exit;' to exit the cli)";

    public String CMD_PREFIXx = "\n> ";
    public String NO_DATABASE_SELECTED = "You need to select a database first with `use` command";

    public final String HELP_COMMANDS = "\n" +
            "Commands:\n" +
            "  exit;           - Exits the program\n" +
            "  help            - Prints this menu\n" +
            "  list            - Lists all the databases\n" +
            "  use <name>      - Select the database\n" +
            "  drop <name>     - Drops a database if it exists\n" +
            "  new <name>      - Create a new database\n" +
            "  schema <data>   - declare the schema for newly created database\n" +
            "  add <data>      - Inserts data (MUST FOLLOW SCHEMA)\n" +
            "  read ?<id>      - Shows the data in the database. id is optional\n" +
            "  delete <table>  - Deletes a row\n";

    public static constants constants_object;
    public static constants getInstance(){
        if (constants_object == null){
            constants_object = new constants();
        }

        return constants_object;
    }

}