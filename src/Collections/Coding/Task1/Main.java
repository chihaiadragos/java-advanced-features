package Collections.Coding.Task1;

public class Main {
    public static void main(String[] args) {
        SDAArrayList cars = new SDAArrayList();
        cars.addCar("Mercedes");
        cars.addCar("Audi");
        cars.addCar("Dacia");
        cars.addCar("Ford");
        cars.addCar("RAM");

        cars.displayCars();
        System.out.println();

        cars.removeCar("RAM");
        cars.displayCars();
        System.out.println();

        System.out.println(cars.getCar("Ford"));
        System.out.println(cars.getCar("Lexus"));
    }
}
