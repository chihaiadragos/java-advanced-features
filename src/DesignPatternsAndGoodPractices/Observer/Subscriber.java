package DesignPatternsAndGoodPractices.Observer;

public class Subscriber {
    private String name;
    private int age;

    public Subscriber(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void pendingNotification(String notificationMessage) {
        System.out.println(this.name + " who is " + this.age + " years old got notification: " + notificationMessage);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subscriber{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
