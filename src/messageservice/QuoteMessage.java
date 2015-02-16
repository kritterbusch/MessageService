package messageservice;

/*
 * @author kritterbusch
 */
public class QuoteMessage implements MessageStrategy {

    public QuoteMessage() {
    }

    public void sayMessage() {
        System.out.println(this.getMessage());
    }

    @Override
    public String getMessage() {
        return "I'm not going to censor myself to comfort your ignorance.\n\t-Jon Stewart";
    }
}
