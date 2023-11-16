package ClassTaxonomy.Features.AbstractClasses;

import ClassTaxonomy.Features.Interfaces.NetflixStreamingPlayer;
import ClassTaxonomy.Features.Interfaces.PrimeStreamingPlayer;
import ClassTaxonomy.Features.Interfaces.StreamingPlayer;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Cuttu", 2);
        ZooKeeper john = new ZooKeeper("John", 30, 3000, dog);
        john.petAnimal();

        Dog dog2 = new Dog("Azorel", 3);
        ZooKeeper kevin = new ZooKeeper("Kevin", 20, 2000, dog2);
        kevin.petAnimal();

        Animal animal = new Cat("Miti", 1);
        kevin.setAnimal(animal);
        kevin.petAnimal();
        System.out.println(kevin);

        Animal panda = new Animal("Panda", 5) {
            @Override
            public void makeSound() {
                System.out.println("bau bau");
            }
        };

        ZooKeeper ion = new ZooKeeper("Ion", 25, 2500, panda);
        ion.petAnimal();
        System.out.println("---------------------------------------------------");

        StreamingPlayer streamingPlayer = new NetflixStreamingPlayer();
        Tv tv = new Tv("Lg", 150, streamingPlayer);
        tv.play("Titanic");

        StreamingPlayer streamingPlayer1 = new PrimeStreamingPlayer();
        tv.setStreamingPlayer(streamingPlayer1);
        tv.play("Titanic 2");

    }
}
