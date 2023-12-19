package FunctionalProgramming.Coding.Exercise10;

import java.time.LocalDate;

public interface Product {
    double getPrice();
    boolean isAvailable(LocalDate localDate);
}
