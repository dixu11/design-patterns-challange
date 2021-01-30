package structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        //Obiekt robi proste obliczenia - chcemy aby uniknąc powtazania obliczen dla ponownego zapytania
        // z tymi samymi danymi

        Calculator calculator = new ProxyCalculator(new RealCalculator());

        System.out.println(calculator.calculate(23, 45, 56));
        System.out.println(calculator.calculate(23, 45, 56));
        System.out.println(calculator.calculate(23, 678, 56));
    }

}
