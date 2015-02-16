package messageservice;

import javax.swing.JOptionPane;

/**
 * @author kritterbusch
 */
public class JokeMessage implements MessageStrategy {

    public JokeMessage() {
    }

    @Override
    public void sayMessage() {
        JOptionPane.showMessageDialog(null, this.getMessage());
    }

    @Override
    public String getMessage() {
        return "Q: What do computers eat for a snack? \n"
                + "A: Microchips!";
    }

}
