package structural.proxy;

public class RealCalculator implements Calculator{

    @Override
    public double calculate(double a, double b, double c) {
        System.out.println("Liczę");
        return a * b * c;
    }
}
