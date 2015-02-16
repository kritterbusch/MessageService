package messageservice;

public class EveningMessage implements MessageStrategy {

    public EveningMessage() {
    }

    @Override
    public void sayMessage() {
        System.out.println(this.getMessage());
    }

    @Override
    public String getMessage() {
        return "Good Evening!";
    }

}
