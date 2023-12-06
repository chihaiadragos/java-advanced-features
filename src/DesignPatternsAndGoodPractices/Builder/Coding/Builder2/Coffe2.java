package DesignPatternsAndGoodPractices.Builder.Coding.Builder2;

public class Coffe2 {
    private String type;
    private boolean withSugar;
    private boolean withMilk;
    private String size;

    public Coffe2(String type) {
        this.type = type;
    }

    public Coffe2 setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
        return this;
    }

    public Coffe2 setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
        return this;
    }

    public Coffe2 setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffe2{");
        sb.append("type='").append(type).append('\'');
        sb.append(", withSugar=").append(withSugar);
        sb.append(", withMilk=").append(withMilk);
        sb.append(", size='").append(size).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
