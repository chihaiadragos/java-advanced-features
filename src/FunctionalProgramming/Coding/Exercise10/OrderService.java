package FunctionalProgramming.Coding.Exercise10;

import java.util.function.Supplier;

public class OrderService {
    public static double calculateTotalPrice(Basket basket) throws Exception {
        Supplier<Exception> exceptionSupplier = () -> new RuntimeException("Basket empty");
        return basket.getProducts().entrySet().stream().map(m -> m.getKey().getPrice() * m.getValue().get()).findFirst().orElseThrow(exceptionSupplier);
        // Double::sum <- se numeste method reference
    }
}
