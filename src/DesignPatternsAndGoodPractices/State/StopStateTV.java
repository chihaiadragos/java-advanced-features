package DesignPatternsAndGoodPractices.State;

public class StopStateTV implements State{
    @Override
    public void doAction() {
        System.out.println("Stop the TV");
    }
}
