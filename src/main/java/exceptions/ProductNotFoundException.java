package exceptions;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String name) {
        super("Produkt " + name + " nie odnaleziony");
    }
}
