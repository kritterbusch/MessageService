package messageservice;

import javax.swing.*;

/* 
 * @author kritterbusch 
 * This is my helper class. We are instantiating MessageStrategy
 */
public class MessageService {

    private MessageStrategy message;

    public MessageService() {
    }

    public MessageService(MessageStrategy message) {
        this.message = message;
    }

    public String getMessage() {
        return message.getMessage();
    }

    public void sayMessage() {
        JOptionPane.showMessageDialog(null, message.getMessage());
    }
}
