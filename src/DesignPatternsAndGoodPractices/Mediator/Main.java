package DesignPatternsAndGoodPractices.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "Andrei");
        User user2 = new UserImpl(chatMediator, "Amalia");
        User user3 = new UserImpl(chatMediator, "Andreea");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.send("Am mancat 23 de sarmale");

    }
}
