package Modules.Features.thread.examples;


import java.util.Arrays;
import java.util.List;

public class Thread1 implements Runnable{
    private Chat chat;
    private List<String> questions = Arrays.asList("Hi", "How are you ?", "I am also doing fine!");

    public Thread1(Chat chat) {
        this.chat = chat;
        new Thread(this).start();
    }

    @Override
    public void run() {
        /*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread1");
         */

        for (String message : questions) {
            chat.question("Thread1: " + message);
        }
    }
}
