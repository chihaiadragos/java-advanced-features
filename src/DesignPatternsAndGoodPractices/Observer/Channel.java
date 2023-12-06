package DesignPatternsAndGoodPractices.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void registerSubscriber(Subscriber subscriber) {
        if (subscriber.getAge() >= 18) {
            subscribers.add(subscriber);
        } else {
            System.out.println("Invalid subscriber age");
        }
    }

    public void notification(String message) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getAge() < 18) {
                subscriber.pendingNotification("GO TO SCHOOL KID");
            } else {
                subscriber.pendingNotification(message);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Channel{");
        sb.append("subscribers=").append(subscribers);
        sb.append('}');
        return sb.toString();
    }
}
