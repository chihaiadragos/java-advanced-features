package Collections.Coding.Task1;

import java.util.ArrayList;

public class SDAArrayList {
    private ArrayList<String> cars;

    public SDAArrayList() {
        this.cars = new ArrayList<>();
    }
    public void addCar(String car) {
        cars.add(car);
    }
    public void removeCar(String car) {
        cars.remove(car);
    }
    public String getCar(String searchCar) {
        for (String car : cars) {
            if (searchCar.equals(car)) {
                return "We found: " + car;
            }
        }
        return "Car not found";
    }
    public void displayCars() {
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
