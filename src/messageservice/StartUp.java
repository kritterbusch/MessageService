package messageservice;

import javax.swing.JOptionPane;

public class StartUp {

    public static void main(String[] args) {
        MessageStrategy message = new EveningMessage();
        message.sayMessage();
        JOptionPane.showMessageDialog(null, message.getMessage());

        message = new JokeMessage();
        message.sayMessage();

        message = new QuoteMessage();
        message.sayMessage();
    }

}
