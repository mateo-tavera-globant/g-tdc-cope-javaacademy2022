package supplier;

import java.util.function.Supplier;

/**
 * Represent a supplier of results
 */
public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionURLBySupplier.get());

    }

    static Supplier<String> getDBConnectionURLBySupplier =()->
            "jdbc://localhost:8080";
}
