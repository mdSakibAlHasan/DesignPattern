package workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PlaintextToHtmlConverter {
    String source;
    int i;
    List<String> result;
    List<String> convertedLine;
    String characterToConvert;

    public String toHtml() throws Exception {
        return basicHtmlEncode(read());
    }

    protected String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get("sample.txt")));
    }

    private String basicHtmlEncode(String source) {
        
        result = new ArrayList<>();
        convertedLine = new ArrayList<>();
        
	convert(source);
        
        addANewLine();
        String finalResult = String.join("<br />", result);
        return finalResult;
    }
    
    
    public void convert(String source)
    {
    
    	this.source = source;
        i = 0;
    	while (i <= this.source.length()) {
            characterToConvert = stashNextCharacterAndAdvanceThePointer();
            switch (characterToConvert) {
                case "<":
                    convertedLine.add("&lt;");
                    break;
                case ">":
                    convertedLine.add("&gt;");
                    break;
                case "&":
                    convertedLine.add("&amp;");
                    break;
                case "\n":
                    addANewLine();
                    break;
                default:
                    pushACharacterToTheOutput();
            }
            i += 1;
        }
    	
    }
    
    

    //pick the character from source string
    //and increment the pointer
    private String stashNextCharacterAndAdvanceThePointer() {
        char c = source.charAt(i);
        return String.valueOf(c);
    }

    //stringfy convertedLine array and push into result
    //reset convertedLine
    private void addANewLine() {
        result.add(String.join("", convertedLine));
        convertedLine = new ArrayList<>();
    }

    private void pushACharacterToTheOutput() {
        convertedLine.add(characterToConvert);
    }
}
