package ClassTaxonomy.Coding.AnonymousClass;

public class Car {
    private double price;
    private CarType type;
    private int year;

    public Car(double price, CarType type, int year) {
        this.price = price;
        this.type = type;
        this.year = year;
    }

    public CarType getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("price=").append(price);
        sb.append(", carType=").append(type);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
