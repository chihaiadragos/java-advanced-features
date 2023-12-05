package DesignPatternsAndGoodPractices.Prototype;

class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    @Override
    public Prototype clone() {
        // Create a new instance and copy the data
        return new ConcretePrototype(this.data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
