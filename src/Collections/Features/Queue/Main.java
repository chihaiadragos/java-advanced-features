package Collections.Features.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> people = new LinkedList<>();
        people.offer("Diana");
        people.offer("Dragos");
        people.offer("Mihai");
        people.offer("Ramona");

        System.out.println("<------------------------>");
        System.out.println(people.peek());
        System.out.println("<------------------------>");
        people.poll();
        System.out.println(people);
        System.out.println("<------------------------>");
    }
}
