package FunctionalProgramming.Coding.Exercise10;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Product product1 = new GenericProduct("Milka", () -> 5.0, (date) -> date.isAfter(LocalDate.now()) );
        Product product2 = new GenericProduct("Pizza", () -> 20.0, (date) -> (date.getMonth().getValue() - LocalDate.now().getMonth().getValue()) < 2);
        Product product3 = new GenericProduct("Apple", () -> 2.0, (date) -> (date.getMonth().getValue() - LocalDate.now().getMonth().getValue()) < 2);

        Basket basket = new Basket();
        basket.addProduct(product1, 15);
        basket.addProduct(product2, 60);

        System.out.println(basket.getProducts());

        Map<Product, AtomicInteger> products = basket.getProducts();
        products.remove(product1);
        System.out.println();

        basket.addProduct(product1, 10);
        basket.removeProduct(product2, 59);
        basket.removeProduct(product3, 59);

        System.out.println(basket.getProducts());
        System.out.println();
        System.out.println(products);
    }
}
