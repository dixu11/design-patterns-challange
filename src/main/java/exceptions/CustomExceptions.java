package exceptions;

import java.util.*;
import java.util.function.Consumer;

public class CustomExceptions {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaki chcesz kupić produkt?");
        System.out.println("Dostępne produkty: " + service.getProducts());
        String chosen = scanner.nextLine();
        System.out.println("Wyszukuję: " + chosen);


        try {
            Product product = service.findProductByName(chosen);
            System.out.println("Znaleziono produkt! Kosztuje on: "+ product.getPrice());
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }



    }






}

class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product("Pralka",1300));
        products.add(new Product("Zmywarka",1200));
    }

     public Product findProductByName(String name) throws ProductNotFoundException {
         for (Product product : products) {
             if (product.getName().equals(name)) {
                 return product;
             }
         }
         throw new ProductNotFoundException(name);
    }

   /* public Product findProductByName(String name) {
        //nie działa
       *//* products.forEach(product -> {
            if (product.getName().equals(name)) {
                return product;
            }
        });*//*
        return null;
    }*/

    public List<Product> getProducts() {
        return products;
    }
}


class Product{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
