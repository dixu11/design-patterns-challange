package structural.proxy;

public class ProxyCalculator implements Calculator {

    private Calculator calculator;
    private double lastA;
    private double lastB;
    private double lastC;
    private double lastResult;


    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculate(double a, double b, double c) {
        if (lastA == a && lastB == b && lastC == c) {
            return lastResult;
        }

        lastA = a;
        lastB = b;
        lastC = c;
        lastResult =  calculator.calculate(a, b, c);
        return lastResult;
    }
}
