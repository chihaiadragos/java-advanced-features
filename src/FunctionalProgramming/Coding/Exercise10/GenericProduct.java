package FunctionalProgramming.Coding.Exercise10;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{
    private String name;
    private Supplier<Double> priceSupplier;
    private Function<LocalDate, Boolean> productAvailability;

    public GenericProduct(String name, Supplier<Double> priceSupplier, Function<LocalDate, Boolean> productAvailability) {
        this.name = name;
        this.priceSupplier = priceSupplier;
        this.productAvailability = productAvailability;
    }

    @Override
    public double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public boolean isAvailable(LocalDate localDate) {
        return productAvailability.apply(localDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericProduct{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
