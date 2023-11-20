package GenericTypes.Features;

import ClassTaxonomy.Features.AbstractClasses.Dog;

public class Main {
    public static void main(String[] args) {

        Box boxDog = new Box(10, 50, new Dog("Azorel", 5));
        System.out.println(boxDog);
        boxDog.setContent("baubau");
        if (boxDog.getContent() instanceof Dog) {
            Dog dog1 = (Dog) boxDog.getContent();
        } else if (boxDog.getContent() instanceof String) {
            String content = (String) boxDog.getContent();
            System.out.println(content);
        }
    }
}