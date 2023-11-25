package ClassTaxonomy.Coding.CkassesAndInterfaces.Task3;

public class Car {
    private String brand;
    private String type;

    private Engine engine;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
        this.engine = new Car.Engine();
        engine.setEngineType();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        private String engineType;

        public void setEngineType() {

            if ("economy".equals(type)) {
                this.engineType = "diesel";
            } else if("luxury".equals(type)) {
                this.engineType = "electric";
            } else {
                this.engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}
