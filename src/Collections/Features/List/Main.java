package Collections.Features.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("n1");
        names.add("n2");
        names.add("n1");
        names.add("n3");
        System.out.println(names);
        System.out.println();
        
        names.add(0, "n4");
        System.out.println(names);
        System.out.println();

        names.remove(2);
        System.out.println(names);
        System.out.println();

        names.remove("n1");
        System.out.println(names);
        System.out.println();

        names.set(1, "n5");
        System.out.println(names);
        System.out.println();

        System.out.println(names.get(0));
        System.out.println();

        System.out.println(names.indexOf("n5"));
        System.out.println();
        names.add("n5");
        System.out.println(names);
        System.out.println();

        System.out.println(names.lastIndexOf("n5"));
        System.out.println();

        List<String> namesSublist = names.subList(0, 3);
        System.out.println(namesSublist);
        System.out.println();

        Collections.sort(names);
        System.out.println(names);
        System.out.println();

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(100);
        numbersList.add(16);
        numbersList.add(10560);
        numbersList.add(1115);
        numbersList.add(890345747);
        System.out.println(numbersList);
        System.out.println();

        Collections.sort(numbersList);
        System.out.println(numbersList);
    }
}
