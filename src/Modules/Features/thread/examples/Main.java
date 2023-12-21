package Modules.Features.thread.examples;

public class Main {
    public static void main(String[] args) {

        Chat chat = new Chat();

        Thread1 thread1 = new Thread1(chat);
        Thread2 thread2 = new Thread2(chat);


    }
}
