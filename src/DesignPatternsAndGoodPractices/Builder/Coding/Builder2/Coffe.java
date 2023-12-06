package DesignPatternsAndGoodPractices.Builder.Coding.Builder2;

public class Coffe {
    private String type;
    private boolean withSugar;
    private boolean withMilk;
    private String size;

    private Coffe(String type, boolean withSugar, boolean withMilk, String size) {
        this.type = type;
        this.withSugar = withSugar;
        this.withMilk = withMilk;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "type='" + type + '\'' +
                ", withSugar=" + withSugar +
                ", withMilk=" + withMilk +
                ", size='" + size + '\'' +
                '}';
    }

    public static class CoffeBuilder {
        private String type;
        private boolean withSugar;
        private boolean withMilk;
        private String size;
        public CoffeBuilder(String type){
            this.type = type;
        }
        public CoffeBuilder withSugar(boolean withSugar) {
            this.withSugar = withSugar;
            return this;
        }
        public CoffeBuilder withMilk(boolean withMilk) {
            this.withMilk = withMilk;
            return this;
        }
        public CoffeBuilder size(String size) {
            this.size = size;
            return this;
        }
        public Coffe build() {
            return new Coffe(this.type, this.withSugar, this.withMilk, this.size);
        }

    }
}
