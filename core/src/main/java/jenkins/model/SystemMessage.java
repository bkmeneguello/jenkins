package jenkins.model;

import java.io.IOException;

public class SystemMessage {
    
    private String systemMessage;
    
    @Override
    public String toString() {
        try {
            return Jenkins.getInstance().getMarkupFormatter().translate(systemMessage);
        } catch (IOException e) {
            return "";
        }
    }

}
