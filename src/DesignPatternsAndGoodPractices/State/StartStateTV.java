package DesignPatternsAndGoodPractices.State;

public class StartStateTV implements State{
    @Override
    public void doAction() {
        System.out.println("Start the TV");
    }
}
