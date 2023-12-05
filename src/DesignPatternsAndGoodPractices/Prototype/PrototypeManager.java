package DesignPatternsAndGoodPractices.Prototype;

import java.util.HashMap;
import java.util.Map;

class PrototypeManager {
    private Map<String, Prototype> prototypes;

    public PrototypeManager() {
        prototypes = new HashMap<>();
    }

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        // Retrieve a cloned instance from the prototype
        return prototypes.get(key).clone();
    }
}
