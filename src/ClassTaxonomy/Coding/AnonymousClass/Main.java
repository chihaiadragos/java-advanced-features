package ClassTaxonomy.Coding.AnonymousClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new Car(20000, CarType.MERCEDES, 2010);
        Car mercedes2 = new Car(35000, CarType.MERCEDES, 2015);
        Car fiat1 = new Car(    3500,  CarType.FIAT,     2008);
        Car fiat2 = new Car(    7000,  CarType.FIAT,     2010);
        Car skoda1 = new Car(   12000, CarType.SKODA,    2015);
        Car skoda2 = new Car(   25000, CarType.SKODA,    2021);

        Dealership dealership = new Dealership();

        System.out.println(dealership.getFinalPrice(mercedes1));
        System.out.println(dealership.getFinalPrice(mercedes2));
        System.out.println(dealership.getFinalPrice(fiat1));
        System.out.println(dealership.getFinalPrice(fiat2));
        System.out.println(dealership.getFinalPrice(skoda1));
        System.out.println(dealership.getFinalPrice(skoda2));

        dealership.negotiate(mercedes1, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 5;
            }
        });
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car(30000, CarType.MERCEDES, 2019);
        Car car2 = new Car(50000, CarType.MERCEDES, 2021);
        Car car3 = new Car(10000, CarType.FIAT, 2018);
        Car car4 = new Car(20000, CarType.SKODA, 2019);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println();
        System.out.println(carList);

        carList.removeIf(car -> car.getPrice() > 25000);

        System.out.println();
        System.out.println(carList);

    }
}
