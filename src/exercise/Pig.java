package exercise;

public class Pig implements  Calculator, CalculatorMAX{
    public int getAge(){
        return 10;
    }
    public int getAge(String asdf){
        return this.getAge();
    }
    //overload methods works only when different paramethers or another number of paramethers
    public boolean getAge(boolean asdf){
        return true;
    }
}
