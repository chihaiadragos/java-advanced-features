package ExercisesForLiveCodingAdvanced.Exercise5;

public class Main {
    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSet<>();
        set.add("car");
        set.add("plane");
        set.add("building");
        set.add("sky");

        System.out.println("Set has size of " + set.size());
        System.out.println();

        set.remove("car");
        System.out.println("Set has size of " + set.size());
        System.out.println();

        System.out.println("Set contains 'sky': " + set.contains("sky"));
        System.out.println("Set contains 'dog': " + set.contains("dog"));
        System.out.println();

        System.out.println("Set has size of " + set.size());
        System.out.println(set);
        set.clear();


        System.out.println("Set has size of " + set.size());
        System.out.println(set);

    }
}
