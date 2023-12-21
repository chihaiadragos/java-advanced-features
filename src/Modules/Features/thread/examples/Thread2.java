package Modules.Features.thread.examples;

import java.util.Arrays;
import java.util.List;

public class Thread2 implements Runnable{
    private Chat chat;
    private List<String> answers = Arrays.asList("Hi", "I am good, what about you?", "Great!");

    public Thread2(Chat chat) {
        this.chat = chat;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (String message : answers) {
            chat.answer(getClass().getSimpleName() + " : " + message);
        }
    }
}
