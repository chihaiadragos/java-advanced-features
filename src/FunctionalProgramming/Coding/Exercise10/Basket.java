package FunctionalProgramming.Coding.Exercise10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket {
//    private List<Product> products = new ArrayList<>();
    private Map<Product, AtomicInteger> products = new HashMap<>();
    public void addProduct(Product product, Integer quantity) {
        if (products.containsKey(product)) {
            products.get(product).getAndAdd(quantity);
        } else {
            products.put(product, new AtomicInteger(quantity));
        }
    }
    public void removeProduct(Product product, Integer quantity) {
        if (products.containsKey(product)) {
            if (products.get(product).get() <= quantity) {
                products.remove(product);
            } else {
                products.get(product).getAndAdd(-quantity);
            }
        } else {
            System.out.println("Not available");
        }
    }
    public Map<Product, AtomicInteger> getProducts() {
        return new HashMap<>(products);
    }
}
