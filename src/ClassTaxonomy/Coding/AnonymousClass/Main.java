package ClassTaxonomy.Coding.AnonymousClass;

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
    }
}
