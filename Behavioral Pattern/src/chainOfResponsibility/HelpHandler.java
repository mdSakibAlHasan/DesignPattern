package chainOfResponsibility;

public class HelpHandler {
    private HelpHandler successor;

    public void setSuccessor(HelpHandler successor) {
        this.successor = successor;
    }

    public void handleHelp(HelpTopic topic) {
        if (successor != null) {
            successor.handleHelp(topic);
        }
    }
}

class PrintTopicHandler extends HelpHandler {
    @Override
    public void handleHelp(HelpTopic topic) {
        if (topic == HelpTopic.PRINT_TOPIC) {
            System.out.println("Printing help topic...");
        } else {
            super.handleHelp(topic);
        }
    }
}

class PaperOrientationTopicHandler extends HelpHandler {
    @Override
    public void handleHelp(HelpTopic topic) {
        if (topic == HelpTopic.PAPER_ORIENTATION_TOPIC) {
            System.out.println("Paper orientation help topic...");
        } else {
            super.handleHelp(topic);
        }
    }
}

class ApplicationTopicHandler extends HelpHandler {
    @Override
    public void handleHelp(HelpTopic topic) {
        if (topic == HelpTopic.APPLICATION_TOPIC) {
            System.out.println("Application help topic...");
        } else {
            super.handleHelp(topic);
        }
    }
}

public class NoHelpTopicHandler extends HelpHandler {
    @Override
    public void handleHelp(HelpTopic topic) {
        if (topic == HelpTopic.NO_HELP_TOPIC) {
            System.out.println("No help available...");
        } else {
            super.handleHelp(topic);
        }
    }
}

class HelpSystem {
    private HelpHandler printHandler;
    private HelpHandler paperOrientationHandler;
    private HelpHandler applicationHandler;
    private HelpHandler noHelpHandler;

    public HelpSystem() {
        printHandler = new PrintTopicHandler();
        paperOrientationHandler = new PaperOrientationTopicHandler();
        applicationHandler = new ApplicationTopicHandler();
        noHelpHandler = new NoHelpTopicHandler();

        printHandler.setSuccessor(paperOrientationHandler);
        paperOrientationHandler.setSuccessor(applicationHandler);
        applicationHandler.setSuccessor(noHelpHandler);
    }

    public void showHelp(HelpTopic topic) {
        printHandler.handleHelp(topic);
    }
}

class  HelpTopic {


       static int PRINT_TOPIC=0;
        static int PAPER_ORIENTATION_TOPIC=1;
        static int APPLICATION_TOPIC=2;
        static int NO_HELP_TOPIC=3;


    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}



