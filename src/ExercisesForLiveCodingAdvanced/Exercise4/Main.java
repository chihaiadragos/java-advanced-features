package ExercisesForLiveCodingAdvanced.Exercise4;

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("BATMAN", "BRUCE");
        storage.addToStorage("BATMAN", "WAYNE");
        storage.addToStorage("BATMAN", "GENIUS");
        storage.addToStorage("BATMAN", "BATMAN");

        storage.addToStorage("X-MEN", "STORM");
        storage.addToStorage("X-MEN", "WOLVERINE");
        storage.addToStorage("X-MEN", "GAMBIT");

        storage.addToStorage("AVENGERS", "IRON");
        storage.addToStorage("AVENGERS", "MAN");
        storage.addToStorage("AVENGERS", "BATMAN");

        System.out.println(storage);
        System.out.println();

        storage.printValues("AVENGERS");
        System.out.println();

        storage.findValues("BATMAN");

    }
}
