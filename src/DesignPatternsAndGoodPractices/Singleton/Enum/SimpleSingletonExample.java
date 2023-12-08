package DesignPatternsAndGoodPractices.Singleton.Enum;

public enum SimpleSingletonExample {
    INSTANCE;
    private int currentCount = 0;

    public int getCurrentCount() {
        return currentCount;
    }

    public void increment() {
        currentCount++;
    }
}
