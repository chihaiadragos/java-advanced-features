package exercise;

public class Dog extends Cat implements Test1{
    @Override
    String isCat() {
        return null;
    }

    @Override
    boolean isAlive() {
        return false;
    }
}
