package T3_2;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        ConcreteUser Supertf = new ConcreteUser("Supertf", mediator);
        ConcreteUser PGE = new ConcreteUser("PGE", mediator);

        Supertf.sendMessageAll("Welcome");

        PGE.sendMessage("Hi!", "Supertf");

    }
}