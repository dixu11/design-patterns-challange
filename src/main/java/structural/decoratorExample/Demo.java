package structural.decoratorExample;

public class Demo {
    public static void main(String[] args) {
        Car car =   new LuxuryCar(new SportsCar(new BasicCar()));
        car.assemble();

    }
}

//Basic Car. Adding features of Luxury Car. Adding features of Sports Car.
