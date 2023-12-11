package DesignPatternsAndGoodPractices.State;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        State state = new StartStateTV();
        tv.setStateOfTheTV(new StopStateTV());
        tv.doAction();
    }
}
