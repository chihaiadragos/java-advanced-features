package DesignPatternsAndGoodPractices.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();


    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!user.equals(u)) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
