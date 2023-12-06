package DesignPatternsAndGoodPractices.Observer;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Andrei", 11);
        Subscriber subscriber2 = new Subscriber("Ana", 25);
        Subscriber subscriber3 = new Subscriber("Miruna", 31);

        Channel channel = new Channel();
        channel.registerSubscriber(subscriber1);
        channel.registerSubscriber(subscriber2);
        channel.registerSubscriber(subscriber3);
        System.out.println(channel);
        channel.notification("Black Friday");
    }
}
