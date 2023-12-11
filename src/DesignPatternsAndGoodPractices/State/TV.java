package DesignPatternsAndGoodPractices.State;

public class TV implements State{
    private State stateOfTheTV;


    public void setStateOfTheTV(State stateOfTheTV) {
        this.stateOfTheTV = stateOfTheTV;
    }

    @Override
    public void doAction() {
        stateOfTheTV.doAction();
    }
}
